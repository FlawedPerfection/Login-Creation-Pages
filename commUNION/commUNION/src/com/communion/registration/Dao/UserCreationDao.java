package com.communion.registration.Dao;

import java.sql.*;
import java.util.ArrayList;

import com.communion.registration.model.User;

public class UserCreationDao {
	
	public User rowToObject(ArrayList<String> r) {
		User user = null;
		ArrayList<User> rowObjectList = new ArrayList<>();
	
		try {
		Connection connection = DBConnection.getConnection();
			String sql = "select * from user where firstName like '"+r.get(0)
					+ "' and lastName like '"+r.get(1)
					+ "' and userName like '"+r.get(2)
					+ "' and userPassword like '"+r.get(3)+"'";
			
			Statement stmt = connection.createStatement();
			
			ResultSet set = stmt.executeQuery(sql);
			
			while (set.next()) {
				
				user = new User(set.getInt("id")
						, set.getString("firstName")
						, set.getString("lastName")
						, set.getString("userName")
						,set.getString("role")
						, set.getString("userPassword"));
				rowObjectList.add(user);
			}
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}
		return user;
		

		
	}

}
