package com.cucumber.application.nicebank;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pradeep on 16/10/16.
 */
public class AtmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Nice ATM</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to nice bank</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
