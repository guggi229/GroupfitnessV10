package com.guggisberg.stefan.test.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloBean {

	public String hello() {
		System.out.println("hello");
		return "Bla bla";
	}

}
