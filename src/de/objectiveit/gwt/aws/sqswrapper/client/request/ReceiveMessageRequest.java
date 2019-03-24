package de.objectiveit.gwt.aws.sqswrapper.client.request;

import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

import jsinterop.annotations.JsProperty;

public class ReceiveMessageRequest {
	@JsProperty(name = "MaxNumberOfMessages")
	private int maxNumberOfMessages = 1;

	@JsProperty(name = "QueueUrl")
	private String queueUrl;

	@JsProperty(name = "ReceiveRequestAttemptId")
	private String receiveRequestAttemptId;

	@JsProperty(name = "MessageAttributeNames")
	private JsArrayString messageAttributeNamesString;
	
	@JsProperty(name = "WaitTimeSeconds")
	private int receiveMessageWaitTimeSeconds = 0;

	public ReceiveMessageRequest(String queueUrl) {
		this.queueUrl = queueUrl;
	}

	public ReceiveMessageRequest(String queueUrl, List<String> messageAttributeNamesString) {
		this.queueUrl = queueUrl;

		JsArrayString arr = JavaScriptObject.createArray().cast();

		for (String string : messageAttributeNamesString) {
			arr.push(string);
		}
		this.messageAttributeNamesString = arr;
	}

	public int getMaxNumberOfMessages() {
		return maxNumberOfMessages;
	}

	public void setMaxNumberOfMessages(int maxNumberOfMessages) {
		this.maxNumberOfMessages = maxNumberOfMessages;
	}

	public String getQueueUrl() {
		return queueUrl;
	}

	public void setQueueUrl(String queueUrl) {
		this.queueUrl = queueUrl;
	}

	public String getReceiveRequestAttemptId() {
		return receiveRequestAttemptId;
	}

	public void setReceiveRequestAttemptId(String receiveRequestAttemptId) {
		this.receiveRequestAttemptId = receiveRequestAttemptId;
	}

	public JsArrayString getMessageAttributeNamesString() {
		return messageAttributeNamesString;
	}

	public void setMessageAttributeNamesString(JsArrayString messageAttributeNamesString) {
		this.messageAttributeNamesString = messageAttributeNamesString;
	}

	public int getReceiveMessageWaitTimeSeconds() {
		return receiveMessageWaitTimeSeconds;
	}

	public void setReceiveMessageWaitTimeSeconds(int receiveMessageWaitTimeSeconds) {
		this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
	}

}
