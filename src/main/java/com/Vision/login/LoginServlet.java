package com.Vision.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/sign_in.do")
public class LoginServlet extends HttpServlet {

	private LoginService userValidationService = new LoginService();
	

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/sign_in.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		boolean isUserValid = userValidationService.isUserValid(email, password);
		  
		  if (isUserValid) { 
		  request.getSession().setAttribute("first_name", email);
		  response.sendRedirect("/home.do"); 
		  }else{
		  request.setAttribute("errorMessage", "Invalid Credentials!");
		  request.getRequestDispatcher("/WEB-INF/views/sign_in.jsp").forward(request,response); 
		  }
		 
	}

}