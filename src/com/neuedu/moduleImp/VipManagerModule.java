package com.neuedu.moduleImp;

import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.beans.User;

public class VipManagerModule extends ManagerModule  implements Module{

	public VipManagerModule(User user) {
		super(user);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("��ӭ��½����Ա�˻�");
	}

	@Override
	public Iterm SelectItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
