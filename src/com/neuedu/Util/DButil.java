package com.neuedu.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.attribute.standard.PresentationDirection;

public class DButil {
	
	private static DButil db = new DButil();	
	private Connection conn ;
	
	private  DButil(){
		
	}
	
	public static  DButil getInstance(){
		return  db;
	}
	
	
	public Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "users", "1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return conn;
	}
	
//	public  void close(Object... o){
//		for (Object object : o) {
//			
//			if(object instanceof PreparedStatement ){
//				try {
//					((PreparedStatement)object).close();
//					System.out.println("ps¹Ø±Õ");
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}else if(object instanceof ResultSet ){
//				try {
//					((ResultSet)object).close();
//					System.out.println("rs¹Ø±Õ");
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}else if(object instanceof Connection ){
//				try {
//					((Connection)object).close();
//					System.out.println("conn¹Ø±Õ");
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
	public  void close(PreparedStatement ps,Connection conn){
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void close(PreparedStatement ps,ResultSet rs ,Connection conn){
		try {
			rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
