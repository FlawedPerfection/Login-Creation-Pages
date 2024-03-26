/*package com.communion.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.communion.registration.Dao.UserDao;
import com.communion.registration.model.User;

@WebServlet("/register")
public class UserServlet extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;
		private UserDao userDao;

	    public void init() {
	        userDao = new UserDao();
	    }
	    
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	response.getWriter().append("Served at: ").append(request.getContextPath());
	    	
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("/userregister.jsp");
	    	dispatcher.forward(request, response);
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	        String firstName = request.getParameter("firstName");
	        String lastName = request.getParameter("lastName");
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        User user = new User(1, firstName, lastName, username, password);
	        user.setFirstName(firstName);
	        user.setLastName(lastName);
	        user.setUsername(username);
	        user.setPassword(password);

	        try {
	            userDao.registerUser(Array<user> r);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
	    	dispatcher.forward(request, response);
	    }

}*/
