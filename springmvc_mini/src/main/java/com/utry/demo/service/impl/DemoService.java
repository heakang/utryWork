package com.utry.demo.service.impl;


import com.utry.demo.service.IDemoService;
import com.utry.mvcframework.annotation.UTService;

/**
 * 核心业务逻辑
 */
@UTService
public class DemoService implements IDemoService {

	public String get(String name) {
		return "My name is " + name;
	}

	public static void main(String[] args) {
		Integer i = 0;
		Class<? extends Integer> aClass = i.getClass();
		DemoService d = new DemoService();
	}

}
