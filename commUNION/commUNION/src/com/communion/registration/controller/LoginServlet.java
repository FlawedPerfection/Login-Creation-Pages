package com.communion.registration.controller;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.communion.registration.Dao.*;
import com.communion.registration.model.LoginUser;
@WebServlet("/LoginAuth")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	LoginDao loginDao;
	
	public void init() {
		loginDao = new LoginDao();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/LoginAuth.jsp");
		dispatcher.forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		ArrayList <String> loginCheckList = new ArrayList <>();
		loginCheckList.add(userName);
		loginCheckList.add(password);
		
		LoginUser loginUser = loginDao.loginCheck(loginCheckList);
		String destPage = "LoginAuth.jsp";
		
		if (loginUser != null) {
			HttpSession session = req.getSession();
			session.setAttribute("loginUser", loginUser);
			destPage = "post.jsp";
		}
		else {
			String message = "invalid buv";
			req.setAttribute("message", message);
			destPage = "noUser.jsp";
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher(destPage);
		dispatcher.forward(req, resp);
		
	}
}
