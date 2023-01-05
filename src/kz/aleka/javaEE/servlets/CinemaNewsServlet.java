package kz.aleka.javaEE.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.aleka.javaEE.db.DBManager2;
import kz.aleka.javaEE.model.News;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/cinema")
public class CinemaNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<News> news = DBManager2.getList();
        req.setAttribute("news",news);
        req.getRequestDispatcher("/cinemaNews.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
