package com.jdc.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Client {

	@Autowired 
	@Qualifier("custom")
	Service service;
	
//	public Client(@Autowired Service service) {
//		this.service = service;
//	}
	
	public void setService(Service service) {
		this.service = service;
	}

	public void doWork() {
		service.doWork();
	}
}
