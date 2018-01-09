package com.accolite.miniau.servlet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accolite.miniau.ApiProject.API;
import com.accolite.miniau.ApiProject.Person;

public class TestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		API api = new API();
		PrintWriter pw = (resp.getWriter());
		List<Person> list = api.getList();
		for(Person person : list)
			pw.println(person);
			
	}
}
