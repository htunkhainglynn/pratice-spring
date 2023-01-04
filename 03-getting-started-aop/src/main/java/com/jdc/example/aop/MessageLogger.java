package com.jdc.example.aop;

public class MessageLogger {
	
	public void doBefore() {
		System.out.println("before business class");
	}
	
	public void doAfter() {
		System.out.println("after business class");
	}
}
