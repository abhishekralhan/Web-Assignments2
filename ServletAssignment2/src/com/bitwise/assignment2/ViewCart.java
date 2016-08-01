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

/**
 * Servlet implementation class ViewCart
 */
@WebServlet("/ViewCart")
public class ViewCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewCart() {
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
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<form action='DeleteItemsFromCart'>");
		out.print("<table border='1'>");
		out.print("<tr><th>Item</th><th>Quantity</th></tr>");
		for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
			out.print("<tr><td><input type='text' value=" + entry.getKey() + "name=" + entry.getKey() + "></td>");
			out.print("<td><input type='text' name='quantity' value=" + entry.getValue() + "></td>");
			out.print("<td><input type = 'submit' value='Delete From Cart'></td></tr>");
		}
		out.print("</table>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");

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
