package com.communion.registration.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.communion.registration.model.LoginUser;

public class LoginDao {

	public LoginUser loginCheck(ArrayList<String> r) {
		LoginUser loginUser = null;
		//ArrayList<User> rowObjectList = new ArrayList<>();
	
		try {
		Connection connection = DBConnection.getConnection();
			String sql = "select * from user where userName like '"+r.get(0)
					+ "' and userPassword like '"+r.get(1)+"'";
			
			Statement stmt = connection.createStatement();
			
			ResultSet set = stmt.executeQuery(sql);
			
			while (set.next()) {
				
				loginUser = new LoginUser(set.getString("userName")
						, set.getString("userPassword"));
			}
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}
		return loginUser;
		

		
	}


}
