package com.gwt.aws.sqs.client;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class AWSCredentials {
	@JsProperty
	public String accessKeyId;
	@JsProperty
	public String secretAccessKey;
	@JsProperty
	public String sessionToken;
}
