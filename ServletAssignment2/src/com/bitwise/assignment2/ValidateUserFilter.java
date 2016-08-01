package com.bitwise.assignment2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidateUserFilter
 */
@WebFilter("/ValidateUserFilter")
public class ValidateUserFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public ValidateUserFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		ValidateUserCredentials credentials = new ValidateUserCredentials();
		credentials.addUserCredentials();
		PrintWriter out = response.getWriter();

		if (credentials.Validate(userName, password)) {

			chain.doFilter(request, response);

		} else {
			request.getRequestDispatcher("UserLogin.jsp?msg=Wrong Username/Password. Please try again.")
					.forward(request, response);
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
