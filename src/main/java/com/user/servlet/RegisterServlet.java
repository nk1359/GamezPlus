package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.entity.User;

/**
 * Servlet for handling user registration.
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    /**
     * Processes the user registration request.
     * 
     * @param req  The HttpServletRequest object containing the request information.
     * @param resp The HttpServletResponse object for sending the response.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException      If an I/O error occurs.
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String name = req.getParameter("fname");
            String email = req.getParameter("email");
            String phno = req.getParameter("phno");
            String password = req.getParameter("password");
            String check = req.getParameter("check");

            User us = new User();
            us.setName(name);
            us.setEmail(email);
            us.setPhno(phno);
            us.setPassword(password);

            HttpSession session = req.getSession();

            if (check != null) {
                UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
                boolean f = dao.userRegister(us);
                if (f) {
                    session.setAttribute("succMsg", "Registration Successful...");
                    resp.sendRedirect("register.jsp");
                } else {
                    session.setAttribute("failedMsg", "Something Wrong on Server...");
                    resp.sendRedirect("register.jsp");
                }
            } else {
                session.setAttribute("failedMsg", "Please Check Agree to Terms and Conditions");
                resp.sendRedirect("register.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
