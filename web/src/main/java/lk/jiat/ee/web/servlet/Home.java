package lk.jiat.ee.web.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.ee.ejb.remote.ProductService;

import java.io.IOException;

@WebServlet("/home")
public class Home extends HttpServlet {

    @EJB
    private ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Welcome to the JIAT EE Web Application</h1>");

        productService.getAllProducts().forEach(p -> {
            try {
                resp.getWriter().write(p.getName() + "<br>");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }
}
