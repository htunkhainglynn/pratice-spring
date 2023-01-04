package com.jdc.example.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("default")
public class DefaultService implements Service {

	@Override
	public void doWork() {
		System.out.println("Default service is working!");
	}

}
