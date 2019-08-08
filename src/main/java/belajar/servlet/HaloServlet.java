package belajar.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/coba")
public class HaloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String output = "<html>\n";
		output += "<head><title>Halo Servlet</title></head>";
		output += "<body><title><h1>Halo Servlet<h1></title></head>";
		output += "</html>\n";
		
		res.setContentType("text/html");
		res.getWriter().print(output);
		res.getWriter().flush();
	}
}
