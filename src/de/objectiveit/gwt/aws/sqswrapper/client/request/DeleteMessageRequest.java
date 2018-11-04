package de.objectiveit.gwt.aws.sqswrapper.client.request;

import jsinterop.annotations.JsProperty;

public class DeleteMessageRequest {

	@JsProperty(name = "QueueUrl")
	private String queueUrl;

	@JsProperty(name = "ReceiptHandle")
	private String receiptHandle;

	public String getQueueUrl() {
		return queueUrl;
	}

	public void setQueueUrl(String queueUrl) {
		this.queueUrl = queueUrl;
	}

	public String getReceiptHandle() {
		return receiptHandle;
	}

	public void setReceiptHandle(String receiptHandle) {
		this.receiptHandle = receiptHandle;
	}

	public DeleteMessageRequest(String queueUrl, String receiptHandle) {
		this.queueUrl = queueUrl;
		this.receiptHandle = receiptHandle;
	}

}
