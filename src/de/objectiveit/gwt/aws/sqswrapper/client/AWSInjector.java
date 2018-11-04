package de.objectiveit.gwt.aws.sqswrapper.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(AWSModule.class)
public interface AWSInjector extends Ginjector {
	public static final AWSInjector INSTANCE = GWT.create(AWSInjector.class);

	public SQS getSQS();

	public AWS getAWS();
	
	public AWSCredentials getAWSCredentials();

}
