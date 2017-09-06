package com.nramiscal.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// get the value for every query parameter
		String width = request.getParameter("width");
		String height = request.getParameter("height");

		int w = 0;
		int h = 0;

		if(width != null) {
			w = Integer.parseInt(width);
		}else {
			w=0;
		}


		if(height != null) {
			h = Integer.parseInt(height);
		}
		else {
			h=0;
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.write("<h1>Checkerboard</h1>");
		out.write("<h2>width = " + w + "</h2>");
		out.write("<h2>height = " + h + "</h2>");

		for (int i = 0; i < h; i++) {
			out.write("<div>");
			if (i%2==0) {
				for (int j = 0; j < w; j++) {
					if (j%2==0) {
						out.write("<div style=\"width:80px; height:80px; background-color:blue; display:inline-block; vertical-align:top\"></div>");
					}
					else {
						out.write("<div style=\"width:80px; height:80px; background-color:red; display:inline-block; vertical-align:top\"></div>");
					}
				}
			}
			else {
				for (int j = 0; j < w; j++) {
					if (j%2==0) {
						out.write("<div style=\"width:80px; height:80px; background-color:red; display:inline-block; vertical-align:top\"></div>");
					}
					else {
						out.write("<div style=\"width:80px; height:80px; background-color:blue; display:inline-block; vertical-align:top\"></div>");
					}
				}
			}

			out.write("</div>");
		}






	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
