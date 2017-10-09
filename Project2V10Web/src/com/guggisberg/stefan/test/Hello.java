package com.guggisberg.stefan.test;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.guggisberg.stefan.groupfitness.exceptions.UserNotFoundException;
import com.guggisberg.stefan.groupfitness.services.UserService;
import com.guggisberg.stefan.groupfitness.services.UserServiceRemote;
import com.guggisberg.stefan.test.ejb.HelloBean;
@ManagedBean
public class Hello {

	@EJB
	private HelloBean h;
	
	@EJB
	private UserServiceRemote us;
	
	public String getWorld() throws UserNotFoundException {
		return us.getUser(3L).getUserName();
	}
	
	
}
