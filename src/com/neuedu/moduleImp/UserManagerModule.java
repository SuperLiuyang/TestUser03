package com.neuedu.moduleImp;

import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.ItermImp.AddUserIterm;
import com.neuedu.ItermImp.LoginIterm;
import com.neuedu.ItermImp.WelcomeIterm;
import com.neuedu.Util.ScannerUtil;
import com.neuedu.beans.User;

public class UserManagerModule extends ManagerModule implements Module{
	public UserManagerModule(User user) {
		super(user);
		// TODO Auto-generated constructor stub
	}

	
	


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("欢迎登陆普通用户");
		System.out.println(getUser().getUsername() +"您好！                           "+(getUser().getQx()==1?"普通用户":"管理员") );
		System.out.println("查看自己信息----------1");
		System.out.println("修改自己信息----------2");
		System.out.println("退出---------------3");
		
	}

	@Override
	public Iterm SelectItem() {
		// TODO Auto-generated method stub
		int key = ScannerUtil.getInt(1,3);
		Iterm it = null;
		switch (key) {
		case 1:
//			it= new showUserIterm();
			break;
		case 2:
//			it= new UpdateUserIterm();
			break;
		case 3:
			System.exit(0);
			break;			

		default:
			it = new WelcomeIterm();
			break;
		}
		return it;
	}

}
