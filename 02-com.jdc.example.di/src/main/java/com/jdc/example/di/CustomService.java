package com.jdc.example.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("custom")
public class CustomService implements Service {

	@Override
	public void doWork() {
		System.out.println("Custom service is working!");
	}

}
