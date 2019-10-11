package servlet;

import db.Database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<html><body>" +
                "<form method='post' action='/Gradle___db_demo___db_demo_1_0_SNAPSHOT_war/login'>" +
                "<input type='text' name='username' />" +
                "<input type='password' name='password' />" +
                "<input type='submit' name='Login'/>" +
                "</form>" +
                "</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Database db = new Database();
        if (db.login(username, password)) {
            // TODO redirect to home page
            System.out.println("login success");
            req.getSession().setAttribute("username", username);
            resp.sendRedirect("/Gradle___db_demo___db_demo_1_0_SNAPSHOT_war/index.jsp");
        } else {
            System.out.println("login failed");
            // TODO redirect back to login page
            resp.sendRedirect("/Gradle___db_demo___db_demo_1_0_SNAPSHOT_war/login");
        }

        String usernameFromSession = (String) (req.getSession()).getAttribute("username");
    }
}
