package com.communion.registration.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.communion.registration.model.User;

public class UserDao {

	public int registerUser (ArrayList <String> r) throws ClassNotFoundException {
        //this is the string you use for a prepared statement below
		String INSERT_USERS_SQL = "INSERT INTO user" +
            "  (firstName, lastName, userName, userPassword) VALUES " +
            " (?, ?, ?, ?);";
		//if this stays 0 it means it didnt go back into the DB
        int result = 0;
        //DB connection
        try (Connection connection = DBConnection.getConnection();
            //this is the prepared statement said above
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            //this is not needed as its a primary key auto increment
        	//preparedStatement.setInt(1, 1);
        	//CHANGES: threw an arraylist with the inputs and then will create user from the DB data.
            preparedStatement.setString(1, r.get(0));
            preparedStatement.setString(2, r.get(1));
            preparedStatement.setString(3, r.get(2));
            preparedStatement.setString(4, r.get(3));
            //to see what you output
            System.out.println(preparedStatement);
            //Executing the query
            result = preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            // sql exception 
            printSQLException(e);
        }
        //if it returns 1 it means it worked.
        return result;
        
    }
		
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}
