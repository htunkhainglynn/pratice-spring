package com.jdc.test.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.example.AppConfig;
import com.jdc.example.di.Client;

@SpringJUnitConfig(classes = AppConfig.class)
public class TestClient {
	
	@Autowired
	private Client client;
	
	@Test
	void test() {
		client.doWork();
	}
}
