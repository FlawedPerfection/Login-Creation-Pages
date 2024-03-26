package com.communion.registration.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.communion.registration.Dao.PostDao;
import com.communion.registration.Dao.UserCreationDao;
import com.communion.registration.Dao.UserDao;
import com.communion.registration.model.Post;
import com.communion.registration.model.User;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {

	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	
	private PostDao postDao;
	public ArrayList<String> postContentList = new ArrayList<>();
	public ArrayList<Post> postList = new ArrayList<>();

    public void init() {
        postDao = new PostDao();
        
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	//you can essentially put any thing here...
    	response.getWriter().append("Served at: ").append(request.getContextPath());
    	//you need this to bring the info from the post page to the doPost method
    	RequestDispatcher dispatcher = request.getRequestDispatcher("/post.jsp");
    	dispatcher.forward(request, response);
    }

   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   String firstName = req.getParameter("title");
       String lastName = req.getParameter("postContent");
       postContentList.add(firstName);
       postContentList.add(lastName);

       
       try {
       	postDao.registerPost(postContentList);
       	postList.add(PostDao.rowToObject(postContentList));
       	System.out.println(postList.get(0).getTitle());
       } catch (Exception e) {
       	e.printStackTrace();
       }

       RequestDispatcher dispatcher = req.getRequestDispatcher("/thread.jsp");
   	dispatcher.forward(req, resp);
   }

}
