package de.objectiveit.gwt.aws.sqswrapper.client.request;

import java.util.List;

import jsinterop.annotations.JsProperty;

public class SendMessageBatchRequest {
	@JsProperty(name = "QueueUrl")
	private String queueUrl;
	@JsProperty(name = "Entries")
	private SendMessageBatchRequestEntry[] entries;

	public SendMessageBatchRequest(String queueUrl, List<SendMessageBatchRequestEntry> entries) {
		this.queueUrl = queueUrl;
		this.entries = entries.toArray(new SendMessageBatchRequestEntry[entries.size()]);
	}

	public String getQueueUrl() {
		return queueUrl;
	}

	public void setQueueUrl(String queueUrl) {
		this.queueUrl = queueUrl;
	}

	public SendMessageBatchRequestEntry[] getEntries() {
		return entries;
	}

	public void setEntries(SendMessageBatchRequestEntry[] entries) {
		this.entries = entries;
	}
}
