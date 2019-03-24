package de.objectiveit.gwt.aws.sqswrapper.client.response;

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsProperty;

public class SQSMessage {
	@JsProperty(name = "Body")
	public native String getBody();

	@JsProperty(name = "MessageId")
	public native String getMessageId();

	@JsProperty(name = "ReceiptHandle")
	public native String getReceiptHandle();

	@JsProperty(name = "MD5OfBody")
	public native String getMD5OfBody();

	@JsProperty(name = "MD5OfMessageAttributes")
	public native String getMD5OfMessageAttributes();

	@JsProperty(name = "MessageAttributes")
	public native JavaScriptObject getMessageAttributes();
}
