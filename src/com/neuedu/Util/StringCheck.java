package com.neuedu.Util;

public class StringCheck {
	public static boolean checkMail(String mail) {
		boolean flag = true;
		if (!(mail.endsWith(".com") || mail.endsWith(".cn"))) {
			System.out.println("错了，没有以.com或者.cn结尾");
			flag = false;
		}
		if (!mail.contains("@")) {
			System.out.println("必须含有一个@");
			flag = false;
		} else {
			if (mail.indexOf("@") != mail.lastIndexOf("@")) {
				System.out.println("@超过1个");
				flag = false;
			} else if (mail.indexOf("@") == 0
					|| mail.indexOf("@") == mail.length() - 1) {
				System.out.println("@不是开头就是结尾了");
				flag = false;
			}

			String mails[] = mail.split("@");
			char c[] = mails[0].toCharArray();
			if (!Character.isLetter(c[0])) {
				System.out.println("首字母必须是字母");
				flag = false;
			}
			for (int i = 0; i < c.length; i++) {

				if (!(c[i] == '_' || c[i] == '-' || c[i] == '.'
						|| Character.isLetter(c[i]) || Character.isDigit(c[i]))) {
					System.out.println("@符号前有非法字符");
					flag = false;
					break;
				}
			}

			if (mails[1].substring(0, 4).equals("360.")) {
				System.out.println("360死去");
				flag = false;
			}
		}
		return flag;
	}
}