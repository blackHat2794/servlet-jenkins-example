package com.blackhat.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @author ankit.kashyap2p version: 1.0 date: 21/August/16 To display date and
 *         time
 */
// URL: http://localhost:5050/DateApplicationDemo/test
public class DateServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// set Response content type
		res.setContentType("text/html");
		// Get PrintWriter object
		PrintWriter writer = res.getWriter();
		// Write Response
		Date date = new Date();
		writer.println("<b><i><center> Date and Time is " + date + " </center></i></b>");
		try {
			Thread.sleep(40000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		writer.println("<br>Our Servlet class(DateServlet) object hashcode: " + this.hashCode());
		writer.println("<br>Request object hashcode: " + req.hashCode());
		writer.println("<br>Response object hashcode: " + res.hashCode());
		writer.println("<br>Current Thread object hashcode: " + res.hashCode());
		// close stream
		writer.close();
	}// service(-,-)
}// class
