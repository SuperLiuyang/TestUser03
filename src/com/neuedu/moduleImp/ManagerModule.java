package com.neuedu.moduleImp;

import com.neuedu.beans.User;

public abstract class ManagerModule {
	private  User user;

	public ManagerModule(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
