package com.neuedu.ItermImp;

import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.moduleImp.LoginModule;

public class LoginIterm implements Iterm{

	@Override
	public Module Selected() {
		// TODO Auto-generated method stub
		return new LoginModule();
	}

}
