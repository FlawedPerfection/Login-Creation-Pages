package com.communion.registration.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.communion.registration.model.Comment;

public interface CommentDao {
	

		public ResultSet query(Connection conn, Comment comment) throws SQLException;

		public void save(Connection conn, Comment comment) throws SQLException;

		public void update(Connection conn, Comment comment) throws SQLException;

		public void delete(Connection conn, Comment comment) throws SQLException;

		public void deleteCId(Connection conn, Comment comment) throws SQLException;

}
