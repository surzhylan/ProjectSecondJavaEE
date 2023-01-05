package kz.aleka.javaEE.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.aleka.javaEE.db.DBManager;
import kz.aleka.javaEE.model.Item;

import java.io.IOException;
@WebServlet(value = "/details")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Long itemId = null;
        try{
           itemId  = Long.parseLong(id);
        }catch (Exception e){
        }
        Item item = DBManager.getItem(itemId);
        if(item!=null){
            req.setAttribute("tovar",item);
            req.getRequestDispatcher("/details.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("/404.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
