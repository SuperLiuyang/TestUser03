package com.neuedu.ItermImp;

import com.neuedu.beans.User;

public class ManagerIter {
	private User user;
	

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public ManagerIter(User user) {
		super();
		this.user = user;
	}
	
}
