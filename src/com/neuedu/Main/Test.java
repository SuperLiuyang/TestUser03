package com.neuedu.Main;

import java.sql.Connection;



import com.neuedu.Interface.Iterm;
import com.neuedu.Interface.Module;
import com.neuedu.Util.DButil;
import com.neuedu.moduleImp.WelcomeModule;
import com.neuedu.moduleImp2.WelcomeModule2;

public class Test {
	public static void main(String[] args) {		
		Module m = new WelcomeModule();
//		Module m = new WelcomeModule2();
		Iterm iterm = null;
		while(m!=null){
			m.print();
			iterm = m.SelectItem();
			m = iterm.Selected();
		}
	
	}
}
