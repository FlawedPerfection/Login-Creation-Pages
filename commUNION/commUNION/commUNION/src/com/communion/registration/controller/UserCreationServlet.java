package com.communion.registration.controller;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.communion.registration.Dao.UserCreationDao;
import com.communion.registration.Dao.UserDao;
import com.communion.registration.model.User;

@WebServlet("/userregister")
public class UserCreationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao;
	private UserCreationDao userCreationDao;
	public ArrayList<String> httpList = new ArrayList<>();
	public ArrayList<User> usersList = new ArrayList<>();

    public void init() {
        userDao = new UserDao();
        userCreationDao = new UserCreationDao();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	response.getWriter().append("Served at: ").append(request.getContextPath());
    	
    	RequestDispatcher dispatcher = request.getRequestDispatcher("/userregister.jsp");
    	dispatcher.forward(request, response);
    }

   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   String firstName = req.getParameter("firstName");
       String lastName = req.getParameter("lastName");
       String username = req.getParameter("username");
       String password = req.getParameter("password");
       httpList.add(firstName);
       httpList.add(lastName);
       httpList.add(username);
       httpList.add(password);
       
       try {
       	userDao.registerUser(httpList);
       	usersList.add(userCreationDao.rowToObject(httpList));
       	System.out.println(usersList.get(0).getFirstName());
       } catch (Exception e) {
       	e.printStackTrace();
       }
      

       RequestDispatcher dispatcher = req.getRequestDispatcher("/Login.jsp");
   	dispatcher.forward(req, resp);
   }
   
	
	

}
