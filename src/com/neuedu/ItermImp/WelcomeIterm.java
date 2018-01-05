package com.neuedu.ItermImp;

import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.moduleImp.WelcomeModule;

public class WelcomeIterm implements Iterm{

	@Override
	public Module Selected() {
		// TODO Auto-generated method stub
		return new WelcomeModule();
	}

}
