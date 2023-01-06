package com.Vision.restaurants_details_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database_service.CommentTable;
import database_service.RateTable;
import model.Comment;
import model.Rate;



@WebServlet("/restaurants_details.do")
public class restaurants_details_servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/restaurants_details.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Comment comment = new Comment();
		Rate rating =  new Rate();
		String commentaire = request.getParameter("commentaire");
		String rate = request.getParameter("note");
		rating.setRating(rate);
		comment.setComment(commentaire);
		
		RateTable nTable = new RateTable();
		nTable.ajouterNote(rating);
		CommentTable commentTable = new CommentTable();
		commentTable.ajouterComment(comment);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/restaurants_details.jsp").forward(request, response);
	}

}
