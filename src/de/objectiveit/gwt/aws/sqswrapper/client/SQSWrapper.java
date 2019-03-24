package de.objectiveit.gwt.aws.sqswrapper.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.Window;

import de.objectiveit.gwt.aws.sqswrapper.client.request.CreateQueueAttribute;
import de.objectiveit.gwt.aws.sqswrapper.client.request.CreateQueueRequest;
import de.objectiveit.gwt.aws.sqswrapper.client.request.DeleteMessageBatchRequest;
import de.objectiveit.gwt.aws.sqswrapper.client.request.DeleteMessageBatchRequestEntry;
import de.objectiveit.gwt.aws.sqswrapper.client.request.DeleteMessageRequest;
import de.objectiveit.gwt.aws.sqswrapper.client.request.ListQueuesRequest;
import de.objectiveit.gwt.aws.sqswrapper.client.request.ReceiveMessageRequest;
import de.objectiveit.gwt.aws.sqswrapper.client.request.SendMessageBatchRequest;
import de.objectiveit.gwt.aws.sqswrapper.client.request.SendMessageBatchRequestEntry;
import de.objectiveit.gwt.aws.sqswrapper.client.request.SendMessageRequest;
import de.objectiveit.gwt.aws.sqswrapper.client.response.ReceiveMessageResponse;
import de.objectiveit.gwt.aws.sqswrapper.client.response.SQSMessage;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SQSWrapper implements EntryPoint {

	private static final String QUEUE_URL = ""; // TODO use a
																											// valid
																											// queue URL
	AWSInjector injector;

	public void onModuleLoad() {
		Window.alert("sqs2");
		injector = AWSInjector.INSTANCE;

		final AWS aws = injector.getAWS();

		// setting up credentials
		AWSCredentials credentials = injector.getAWSCredentials();
		credentials.accessKeyId = ""; // TODO use a valid access key
		credentials.secretAccessKey = ""; // TODO use a valid secret access key
		credentials.sessionToken = ""; // SET STS SESSION TOKEN HERE - Blank or null if using iam credentials

		final Options options = new Options(credentials, "us-east-1");

		aws.config.update(options);

//		createQueue();
//		listQueues();
//		sendMessageToQueue();
//		sendBatchMessageToQueue();
		receiveMessage();
//		receiveAndDeleteMessage();
//		receiveAndDeleteBatchMessage();

	}

	private void receiveAndDeleteBatchMessage() {
		ReceiveMessageRequest request = new ReceiveMessageRequest(QUEUE_URL);
		request.setMaxNumberOfMessages(5);
		injector.getSQS().receiveMessage(request, new ReceiveMessageResponse() {
			@Override
			public void response(String error, ReceiveMessageResult data) {
				GWT.log(error);
				GWT.log(data.getMessages().length + " messages");
				List<DeleteMessageBatchRequestEntry> entries = new ArrayList<DeleteMessageBatchRequestEntry>();

				for (SQSMessage sqsMessage : data.getMessages()) {
					entries.add(new DeleteMessageBatchRequestEntry(sqsMessage.getMessageId(),
							sqsMessage.getReceiptHandle()));
				}
				DeleteMessageBatchRequest deleteMessageBatchRequest = new DeleteMessageBatchRequest(QUEUE_URL, entries);
				injector.getSQS().deleteMessageBatch(deleteMessageBatchRequest, new IResponse() {
					@Override
					public void respond(String error, String data) {
						GWT.log(error);
						GWT.log(data);
					}
				});
			}
		});
	}

	private void receiveAndDeleteMessage() {
		ReceiveMessageRequest request = new ReceiveMessageRequest(QUEUE_URL);
		request.setMaxNumberOfMessages(5);
		injector.getSQS().receiveMessage(request, new ReceiveMessageResponse() {
			@Override
			public void response(String error, ReceiveMessageResult data) {
				GWT.log(error);
				GWT.log(data.getMessages().length + " messages");
				for (SQSMessage sqsMessage : data.getMessages()) {
					GWT.log(sqsMessage.getBody());
					deleteMessage(QUEUE_URL, sqsMessage.getReceiptHandle());
				}
			}
		});
	}

	private void deleteMessage(String queueUrl, String receiptHandle) {
		DeleteMessageRequest deleteMessageRequest = new DeleteMessageRequest(queueUrl, receiptHandle);
		injector.getSQS().deleteMessage(deleteMessageRequest, new IResponse() {
			@Override
			public void respond(String error, String data) {
				GWT.log(error);
				GWT.log(data);
			}
		});
	}

	private void receiveMessage() {
		String ATTRIBUTE_NAME = "asa"; // test parameter name
		ReceiveMessageRequest request = new ReceiveMessageRequest(QUEUE_URL, Arrays.asList(ATTRIBUTE_NAME));
		injector.getSQS().receiveMessage(request, new ReceiveMessageResponse() {
			@Override
			public void response(String error, ReceiveMessageResult data) {
				GWT.log(error);
				GWT.log(data.getMessages().length + " messages");
				for (SQSMessage sqsMessage : data.getMessages()) {
					if (sqsMessage.getMessageAttributes() != null) {
						JSONValue attributeObj = new JSONObject(sqsMessage.getMessageAttributes()).get(ATTRIBUTE_NAME);
						if (attributeObj != null)
							GWT.log(attributeObj.isObject().get("StringValue").isString().stringValue());
					}
				}
			}
		});
	}

	private void sendBatchMessageToQueue() {
		SendMessageBatchRequest request = new SendMessageBatchRequest(QUEUE_URL,
				Arrays.asList(new SendMessageBatchRequestEntry("1", "test1"),
						new SendMessageBatchRequestEntry("2", "test2"), new SendMessageBatchRequestEntry("3", "test3"),
						new SendMessageBatchRequestEntry("4", "test4"), new SendMessageBatchRequestEntry("5", "test5"),
						new SendMessageBatchRequestEntry("6", "test6"),
						new SendMessageBatchRequestEntry("7", "test7")));
		injector.getSQS().sendMessageBatch(request, new IResponse() {
			@Override
			public void respond(String error, String data) {
				GWT.log(error);
				GWT.log(data);
			}
		});

	}

	private void sendMessageToQueue() {
		SendMessageRequest request = new SendMessageRequest(QUEUE_URL, "testMessage");
		injector.getSQS().sendMessage(request, new IResponse() {

			@Override
			public void respond(String error, String data) {
				GWT.log(error);
				GWT.log(data);
			}
		});

	}

	private void createQueue() {
		CreateQueueRequest request = new CreateQueueRequest();
		request.setQueueName("testQueue");
		CreateQueueAttribute attributes = new CreateQueueAttribute();
		attributes.setDelaySeconds("5");
		request.setAttributes(attributes);
		injector.getSQS().createQueue(request, new IResponse() {

			@Override
			public void respond(String error, String data) {
				GWT.log(error);
				GWT.log(data);
			}
		});

	}

	private void listQueues() {
		ListQueuesRequest request = new ListQueuesRequest();
		request.setQueueNamePrefixString("test");
		injector.getSQS().listQueues(request, new IResponse() {

			@Override
			public void respond(String error, String data) {
				GWT.log(error);
				GWT.log(data);
			}
		});

	}
}
