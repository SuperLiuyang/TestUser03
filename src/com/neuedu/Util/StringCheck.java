package com.neuedu.Util;

public class StringCheck {
	public static boolean checkMail(String mail) {
		boolean flag = true;
		if (!(mail.endsWith(".com") || mail.endsWith(".cn"))) {
			System.out.println("���ˣ�û����.com����.cn��β");
			flag = false;
		}
		if (!mail.contains("@")) {
			System.out.println("���뺬��һ��@");
			flag = false;
		} else {
			if (mail.indexOf("@") != mail.lastIndexOf("@")) {
				System.out.println("@����1��");
				flag = false;
			} else if (mail.indexOf("@") == 0
					|| mail.indexOf("@") == mail.length() - 1) {
				System.out.println("@���ǿ�ͷ���ǽ�β��");
				flag = false;
			}

			String mails[] = mail.split("@");
			char c[] = mails[0].toCharArray();
			if (!Character.isLetter(c[0])) {
				System.out.println("����ĸ��������ĸ");
				flag = false;
			}
			for (int i = 0; i < c.length; i++) {

				if (!(c[i] == '_' || c[i] == '-' || c[i] == '.'
						|| Character.isLetter(c[i]) || Character.isDigit(c[i]))) {
					System.out.println("@����ǰ�зǷ��ַ�");
					flag = false;
					break;
				}
			}

			if (mails[1].substring(0, 4).equals("360.")) {
				System.out.println("360��ȥ");
				flag = false;
			}
		}
		return flag;
	}
}