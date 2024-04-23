package com.admin.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.DAO.GamesDAOImpl;
import com.DB.DBConnect;
import com.entity.GameDtls;

/**
 * Servlet to handle the addition of games to the database.
 * Retrieves game details from a form, including image upload.
 * Saves the image to the server and adds game details to the database.
 */
@WebServlet("/add_games")
@MultipartConfig
public class GamesAdd extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String gameName = req.getParameter("gname");
            String publisher = req.getParameter("publisher");
            String price = req.getParameter("price");
            String categories = req.getParameter("categories");
            String status = req.getParameter("status");
            Part part = req.getPart("gimg");
            String contentDispositionHeader = part.getHeader("content-disposition");
            String fileName = extractFileName(contentDispositionHeader);

            GameDtls g = new GameDtls(gameName, publisher, price, categories, status, fileName, "admin");

            GamesDAOImpl dao = new GamesDAOImpl(DBConnect.getConn());

            boolean f = dao.addGames(g);

            HttpSession session = req.getSession();

            if (f) {

                String path = getServletContext().getRealPath("") + "/GameImg";
                part.write(path + File.separator + fileName);

                session.setAttribute("succMsg", "Game Added Successfully");
                resp.sendRedirect("admin/add_games.jsp");

            } else {
                session.setAttribute("failedMsg", "Something Wrong on Server");
                resp.sendRedirect("admin/add_games.jsp");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Extracts the filename from the content disposition header of a multipart
     * request part.
     * 
     * @param contentDispositionHeader The content disposition header string.
     * @return The extracted filename.
     */
    private String extractFileName(String contentDispositionHeader) {
        String[] tokens = contentDispositionHeader.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length() - 1);
            }
        }
        return "";
    }

}
