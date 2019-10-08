package com.vso;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/loginUser")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("pass");

        if (user.equals("admin") && password.equals("pass")) {
            //response.sendRedirect("welcome.jsp");
            request.setAttribute("logged", "Admin");
            RequestDispatcher view = request.getRequestDispatcher("welcome.jsp");
            view.forward(request, response);

        } else {
            //response.sendRedirect("index.jsp");
            request.setAttribute("logged", "Wrong username or password");
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
        }
    }

}
