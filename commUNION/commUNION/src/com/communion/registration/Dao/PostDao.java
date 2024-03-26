package com.communion.registration.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

import com.communion.registration.interfaces.InvalidPost;
import com.communion.registration.model.Post;
import com.communion.registration.model.User;
	
public class PostDao {
	private final String listQuery = "SELECT * FROM posts ORDER BY post_id DESC;";
	
	public static Post rowToObject(ArrayList<String> r) {
		Post post = null;
		ArrayList<Post> rowObjectList = new ArrayList<>();
	
		try {
		Connection connection = DBConnection.getConnection();
			String sql = "select * from post where postTitle like '"+r.get(0)
					+ "' and postContent like '"+r.get(1)
					+"'";
			
			Statement stmt = connection.createStatement();
			
			ResultSet set = stmt.executeQuery(sql);
			
			while (set.next()) {
				
				post = new Post(set.getInt("postId")
						, set.getString("postTitle")
						, set.getString("postContent"));
				rowObjectList.add(post);
			}
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}
		return post;
	}

	public int registerPost(ArrayList<String> r) throws ClassNotFoundException {
		
				String INSERT_USERS_SQL = "INSERT INTO post" +
		            "  (postTitle, postContent) VALUES " +
		            " (?, ?);";
				
		        int result = 0;
		        //DB connection
		        try (Connection connection = DBConnection.getConnection();
		            //this is the prepared statement said above
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
		            //sets the question marks to the contents of the array
		            preparedStatement.setString(1, r.get(0));
		            preparedStatement.setString(2, r.get(1));
		            
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

	private void printSQLException(SQLException ey) {
		for (Throwable e: ey) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ey.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
	
	// to add post from the database on the thread page
	public List<Post> listPosts() {
		List<Post> posts = new ArrayList<>();
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement stm = connection.prepareStatement(listQuery);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("postId");
				String title = rs.getString("postTitle");
				String content = rs.getString("postContent");
				posts.add(new Post(id, title, content));
			}
			return posts;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	//to retrieve posts
	public Post retrieve(int id) throws InvalidPost {
		
		//String FETCH_POST_SQL = "SELECT* FROM post";
		try {
			Connection connection = DBConnection.getConnection();
			String sql = "select * from post";
			Statement stmt = connection.createStatement();
			((PreparedStatement) stmt).setInt(1, id);
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				String title = rs.getString("postTitle");
				String content = rs.getString("postContent");
				
				return new Post(id, title, content);
			}
			
			throw new InvalidPost("Could not find this post.");
			
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
		
}