package com.gwt.aws.sqs.client.request;

import jsinterop.annotations.JsProperty;

public class ReceiveMessageRequest {
	@JsProperty(name = "MaxNumberOfMessages")
	private int maxNumberOfMessages = 1;

	@JsProperty(name = "QueueUrl")
	private String queueUrl;

	@JsProperty(name = "ReceiveRequestAttemptId")
	private String receiveRequestAttemptId;

	public ReceiveMessageRequest(String queueUrl) {
		this.queueUrl = queueUrl;
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

}
