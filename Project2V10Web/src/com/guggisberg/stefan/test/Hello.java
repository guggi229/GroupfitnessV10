package com.guggisberg.stefan.test;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.guggisberg.stefan.test.ejb.HelloBean;
@ManagedBean
public class Hello {

	@EJB
	private HelloBean h;
	
	public String getWorld() {
		return h.hello();
	}
	
	
}
