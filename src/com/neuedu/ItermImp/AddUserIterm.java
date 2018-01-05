package com.neuedu.ItermImp;

import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.moduleImp.AddUserModule;

public class AddUserIterm implements Iterm{

	@Override
	public Module Selected() {
		// TODO Auto-generated method stub
		return new AddUserModule();
	}

}
