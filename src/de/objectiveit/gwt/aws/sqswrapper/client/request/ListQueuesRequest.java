package de.objectiveit.gwt.aws.sqswrapper.client.request;

import jsinterop.annotations.JsProperty;

public class ListQueuesRequest {

	@JsProperty(name = "QueueNamePrefix")
	private String queueNamePrefixString;

	public String getQueueNamePrefixString() {
		return queueNamePrefixString;
	}

	public void setQueueNamePrefixString(String queueNamePrefixString) {
		this.queueNamePrefixString = queueNamePrefixString;
	}
}
