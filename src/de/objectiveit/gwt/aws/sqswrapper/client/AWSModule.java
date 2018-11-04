package de.objectiveit.gwt.aws.sqswrapper.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class AWSModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(Resources.class).asEagerSingleton();
		bind(AWSFactory.class).asEagerSingleton();
	}

	@Provides
	SQS getSQS(Resources resources, AWSFactory awsFactory, AWS aws) {
		return awsFactory.createSQS();
	}

	@Provides
	@Singleton
	AWS getAWS(Resources resources, AWSFactory SQSFactory) {
		return AWSFactory.getAws();
	}
	
	@Provides
	@Singleton
	AWSCredentials getAWSCredentials(Resources resources, AWSFactory factory) {
		return factory.createCredentials();
	}

}
