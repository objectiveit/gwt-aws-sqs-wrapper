package com.gwt.aws.sqs.client;


import com.google.gwt.core.client.ScriptInjector;
import com.google.inject.Inject;

public class AWSFactory {

    @Inject
    public AWSFactory(Resources resources) {
        ScriptInjector.fromString(resources.awsJs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

    public static native AWS getAws() /*-{
		console.log('aws = ', $wnd.AWS);
		return $wnd.AWS;
    }-*/;

    public native SQS createSQS(AWS aws) /*-{
		return new aws.SQS();
    }-*/;

    public native SQS createSQS() /*-{
		return new $wnd.AWS.SQS();
    }-*/;
    
    public native AWSCredentials createCredentials() /*-{
	return new $wnd.AWS.Credentials();
}-*/;

}
