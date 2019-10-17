package com.deals.servlets;

import com.deals.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Register", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confPassword = req.getParameter("confPassword");

        UserService userService = new UserService();

        try {
            userService.register(username, password, confPassword);
        } catch (IllegalArgumentException | IllegalStateException e) {
            resp.sendRedirect("/register.jsp");
            return;
        }

        resp.sendRedirect("/index.jsp");
    }
}
