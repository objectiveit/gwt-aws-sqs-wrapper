package de.objectiveit.gwt.aws.sqswrapper.client;

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
