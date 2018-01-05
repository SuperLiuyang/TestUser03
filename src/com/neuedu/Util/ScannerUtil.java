package com.neuedu.Util;

import java.util.Scanner;

public class ScannerUtil {
	
	public static int getInt(int start,int end){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = -1;
		if(!("".equals(a)||a==null)){			
				try{
					b = Integer.parseInt(a);
					if(b>=start && b<=end){
						return b;
					}else{
						return -1;
					}
				}catch(NumberFormatException e){
					System.out.println(a+"´íÎó");	
				}	
				
		}
		return b;		
	}
}
