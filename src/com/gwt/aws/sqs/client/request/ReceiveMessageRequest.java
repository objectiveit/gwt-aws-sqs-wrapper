package com.gwt.aws.sqs.client.request;

import jsinterop.annotations.JsProperty;

public class ReceiveMessageRequest {
	@JsProperty(name = "MaxNumberOfMessages")
	private int maxNumberOfMessages = 1;

	@JsProperty(name = "QueueUrl")
	private String queueUrl;

	@JsProperty(name = "ReceiveRequestAttemptId")
	private String receiveRequestAttemptId;

	@JsProperty(name = "VisibilityTimeout")
	private Integer visibilityTimeout;

	@JsProperty(name = "WaitTimeSeconds")
	private Integer waitTimeSeconds;

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

	public Integer getVisibilityTimeout() {
		return visibilityTimeout;
	}

	public void setVisibilityTimeout(Integer visibilityTimeout) {
		this.visibilityTimeout = visibilityTimeout;
	}

	public Integer getWaitTimeSeconds() {
		return waitTimeSeconds;
	}

	public void setWaitTimeSeconds(Integer waitTimeSeconds) {
		this.waitTimeSeconds = waitTimeSeconds;
	}

}
