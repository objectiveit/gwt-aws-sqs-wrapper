package de.objectiveit.gwt.aws.sqswrapper.client.request;

import jsinterop.annotations.JsProperty;

public class DeleteMessageBatchRequestEntry {

	@JsProperty(name = "Id")
	private String id;

	@JsProperty(name = "ReceiptHandle")
	private String receiptHandle;

	public DeleteMessageBatchRequestEntry(String id, String receiptHandle) {
		this();
		this.setId(id);
		this.setReceiptHandle(receiptHandle);
	}

	public DeleteMessageBatchRequestEntry() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReceiptHandle() {
		return receiptHandle;
	}

	public void setReceiptHandle(String receiptHandle) {
		this.receiptHandle = receiptHandle;
	}

}
