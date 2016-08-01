package com.bitwise.assignment2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddItemsToCart
 */
@WebServlet("/AddItemsToCart")
public class AddItemsToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Map<String, Integer> items = new HashMap<String, Integer>();

//	public Map<String, Integer> getCartItems() {
//
//		return items;
//	}

	public AddItemsToCart() {
		super();
		//
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if ("CONFIRM".equals(action)) {
			request.getSession(false).setAttribute("cart", items);
			response.sendRedirect("AddItems.jsp");
		} else if ("ADD".equals(action)) {
			items.put(request.getParameter("cart"), Integer.parseInt(request.getParameter("quantity")));
			response.sendRedirect("AddItems.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
