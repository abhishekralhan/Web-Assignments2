package com.bitwise.assignment2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteItemsFromCart
 */
@WebServlet("/DeleteItemsFromCart")
public class DeleteItemsFromCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AddItemsToCart cartItems = new AddItemsToCart();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteItemsFromCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Map<String, Integer> cartItems = new HashMap<String, Integer>();
		cartItems = (Map<String, Integer>) (request.getSession(false).getAttribute("cart"));
		cartItems.remove(request.getParameter("name"));
		//response.sendRedirect("ViewCart");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
