package com.neuedu.moduleImp;

import java.sql.Connection;
import java.util.Scanner;

import com.neuedu.Dao.UserDao;
import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.ItermImp.WelcomeIterm;
import com.neuedu.Util.DButil;
import com.neuedu.Util.StringCheck;
import com.neuedu.beans.User;

public class AddUserModule implements Module{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User user = new User();
		Connection conn1 = DButil.getInstance().getConnection();
		User usercheck  = null;
		UserDao ud1 = null;
		String username = null;
		do{
		user.setQx(0);
		System.out.println("«Î ‰»Î”√ªß√˚£∫");
		username = sc.nextLine();
		user.setUsername(username);		
		ud1 = new UserDao(conn1);
		usercheck =ud1.getUser(user);
		}
		while(usercheck.getQx()!=0);		
		System.out.println("«Î ‰»Î√‹¬Î£∫");
		String password = sc.nextLine();
		user.setPassword(password);	
		System.out.println(password);
		String email  = null;
		do{
			System.out.println("«Î ‰»Î” œ‰£∫");
			email = sc.nextLine();
		}while(!StringCheck.checkMail(email));
		user.setEmail(email);										
		user.setQx(1);
		Connection conn2 = DButil.getInstance().getConnection();
		UserDao ud2 = new UserDao(conn2);
		ud2.AddUser(user);		
		
		
	}

	@Override
	public Iterm SelectItem() {
		// TODO Auto-generated method stub
		return new WelcomeIterm();
	}

}
