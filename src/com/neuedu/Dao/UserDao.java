package com.neuedu.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuedu.Util.DButil;
import com.neuedu.beans.User;

public class UserDao {
	private Connection conn;
	private PreparedStatement ps ;
	private ResultSet rs ;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public void AddUser(User user) {

		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement("insert into usermanager (username,password,email,qx,id) values(?,?,?,?,idadd.nextval)");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setInt(4, user.getQx());
			int result = ps.executeUpdate();
			if (result > 0) {
				conn.commit();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			DButil.getInstance().close(ps,conn);
		}
	}

	public User getUser(User user) {
		if (((user.getUsername() != null) && (!"".equals(user.getUsername())))		
				&& (user.getPassword() == null || "".equals(user.getPassword()))) {
			try {
				ps = conn.prepareStatement("select distinct qx from usermanager where username = ?");
				ps.setString(1, user.getUsername());
				rs = ps.executeQuery();
				if(rs.next()){
					int qx = rs.getInt(1);
					if(qx>0){
						user.setQx(qx);
						System.out.println("用户名已存在");
					}
				}			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				DButil.getInstance().close(ps,rs,conn);
				
			}
			
		}else if(((user.getUsername() != null) && (!"".equals(user.getUsername())))		
				&& (user.getPassword() != null || !"".equals(user.getPassword()))){
			try {
				ps = conn.prepareStatement("select username,password,email,qx,id from usermanager where username = ? and password = ?");
				ps.setString(1, user.getUsername());
				ps.setString(2, user.getPassword());
				rs = ps.executeQuery();
				if(rs.next()){
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setEmail(rs.getString("email"));
					user.setQx(rs.getInt("qx"));
					user.setId(rs.getInt("id"));					
				}			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				DButil.getInstance().close(ps,rs,conn);
				
			}
		}
		
		return user;
	}
}
