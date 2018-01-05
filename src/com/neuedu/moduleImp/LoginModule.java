package com.neuedu.moduleImp;

import java.sql.Connection;
import java.util.Scanner;

import com.neuedu.Dao.UserDao;
import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.ItermImp.LoginIterm;
import com.neuedu.ItermImp.UserManagerIterm;
import com.neuedu.ItermImp.VipManagerIterm;
import com.neuedu.Util.DButil;
import com.neuedu.beans.User;

public class LoginModule implements Module{
	private User user = new User();
	@Override
	public void print() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		System.out.println(password);
		
		
		user.setUsername(username);
		user.setPassword(password);
		Connection conn = DButil.getInstance().getConnection();
		UserDao ud = new UserDao(conn); 
		user.setQx(0);
		user = ud.getUser(user);
		
		
	}

	@Override
	public Iterm SelectItem() {
		// TODO Auto-generated method stub
		Iterm it = null;
		if(user.getQx()==1){		
			it = new UserManagerIterm(user);  
		}else if(user.getQx()==2){			
			it = new VipManagerIterm(user);
		}else {
			System.out.println("用户名不存在");
			it = new LoginIterm();
			
		}
		return it;
	}

}
