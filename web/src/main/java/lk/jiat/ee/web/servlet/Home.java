package lk.jiat.ee.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Welcome to the JIAT EE Web Application</h1>");
        resp.getWriter().println("<p>This is a simple servlet example.</p>");
        resp.getWriter().println("<p>Current time: " + System.currentTimeMillis() + "</p>");
    }
}
