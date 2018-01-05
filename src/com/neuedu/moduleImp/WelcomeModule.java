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
		System.out.println("��ӭʹ��neuedu�û�����ϵͳ");
		System.out.println("===================");
		System.out.println("�û���¼-------------1");
		System.out.println("�û�ע��-------------2");
		System.out.println("�û��˳�-------------3");	
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
