package com.formation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

@WebServlet("/hello")
public class HelloServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws SerialException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("Hello from HelloSerlet!");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SerialException, IOException {
		doGet(request,response);
	}
}
