package com.neuedu.ItermImp;

import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.beans.User;
import com.neuedu.moduleImp.VipManagerModule;

public class VipManagerIterm extends ManagerIter implements Iterm{

	public VipManagerIterm(User user) {
		super(user);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Module Selected() {
		// TODO Auto-generated method stub
		return new VipManagerModule(getUser());
	}

}
