package com.jdc.example.aop.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.example.business.BusinessInterface;

@SpringJUnitConfig(locations = "classpath:/context.xml")
public class AopTest {

	@Autowired
	private BusinessInterface business;
	
	@Test
	void test() {
		business.doWork();
	}
}
