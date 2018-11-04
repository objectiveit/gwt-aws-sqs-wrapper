package de.objectiveit.gwt.aws.sqswrapper.client.request;

import java.util.List;

import jsinterop.annotations.JsProperty;

public class DeleteMessageBatchRequest {
	@JsProperty(name = "QueueUrl")
	private String queueUrl;
	@JsProperty(name = "Entries")
	private DeleteMessageBatchRequestEntry[] entries;

	public DeleteMessageBatchRequest(String queueUrl, List<DeleteMessageBatchRequestEntry> entries) {
		this.queueUrl = queueUrl;
		this.entries = entries.toArray(new DeleteMessageBatchRequestEntry[entries.size()]);
	}

	public String getQueueUrl() {
		return queueUrl;
	}

	public void setQueueUrl(String queueUrl) {
		this.queueUrl = queueUrl;
	}

	public DeleteMessageBatchRequestEntry[] getEntries() {
		return entries;
	}

	public void setEntries(DeleteMessageBatchRequestEntry[] entries) {
		this.entries = entries;
	}
}
