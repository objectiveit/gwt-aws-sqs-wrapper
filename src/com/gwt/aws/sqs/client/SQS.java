package com.gwt.aws.sqs.client;

import com.gwt.aws.sqs.client.request.CreateQueueRequest;
import com.gwt.aws.sqs.client.request.DeleteMessageBatchRequest;
import com.gwt.aws.sqs.client.request.DeleteMessageRequest;
import com.gwt.aws.sqs.client.request.ListQueuesRequest;
import com.gwt.aws.sqs.client.request.ReceiveMessageRequest;
import com.gwt.aws.sqs.client.request.SendMessageBatchRequest;
import com.gwt.aws.sqs.client.request.SendMessageRequest;
import com.gwt.aws.sqs.client.response.ReceiveMessageResponse;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "SQS")
public class SQS {

	@JsMethod
	public native void addPermission(IResponse response);

	@JsMethod
	public native void changeMessageVisibility(IResponse response);

	@JsMethod
	public native void changeMessageVisibilityBatch(IResponse response);

	@JsMethod
	public native void createQueue(CreateQueueRequest param, IResponse response);

	@JsMethod
	public native void deleteMessage(DeleteMessageRequest deleteMessageRequest, IResponse response);

	@JsMethod
	public native void deleteMessageBatch(DeleteMessageBatchRequest deleteMessageRequest,IResponse response);

	@JsMethod
	public native void deleteQueue(IResponse response);

	@JsMethod
	public native void getQueueAttributes(IResponse response);

	@JsMethod
	public native void getQueueUrl(IResponse response);

	@JsMethod
	public native void listDeadLetterSourceQueues(IResponse response);

	@JsMethod
	public native void listQueues(ListQueuesRequest param, IResponse response);

	@JsMethod
	public native void listQueueTags(IResponse response);

	@JsMethod
	public native void purgeQueue(IResponse response);

	@JsMethod
	public native void receiveMessage(ReceiveMessageRequest param, ReceiveMessageResponse response);

	@JsMethod
	public native void removePermission(IResponse response);

	@JsMethod
	public native void sendMessage(SendMessageRequest param, IResponse response);

	@JsMethod
	public native void sendMessageBatch(SendMessageBatchRequest param, IResponse response);

	@JsMethod
	public native void setQueueAttributes(IResponse response);

	@JsMethod
	public native void tagQueue(IResponse response);

	@JsMethod
	public native void untagQueue(IResponse response);

}
