package com.neuedu.moduleImp;



import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.ItermImp.AddUserIterm;
import com.neuedu.ItermImp.LoginIterm;
import com.neuedu.ItermImp.WelcomeIterm;
import com.neuedu.Util.ScannerUtil;

public class WelcomeModule implements Module{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用neuedu用户管理系统");
		System.out.println("===================");
		System.out.println("用户登录-------------1");
		System.out.println("用户注册-------------2");
		System.out.println("用户退出-------------3");	
	}

	@Override
	public Iterm SelectItem() {
		// TODO Auto-generated method stub
		int key = ScannerUtil.getInt(1,3);
		Iterm it = null;
		switch (key) {
		case 1:
			it= new LoginIterm();
			break;
		case 2:
			it= new AddUserIterm();
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
