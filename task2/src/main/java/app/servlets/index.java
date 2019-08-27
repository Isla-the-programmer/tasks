package app.servlets;
import app.Model.Model;
import app.entities.Services;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/index.jsp")
public class index extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.valueOf(req.getParameter("id"));
        Model model = Model.getInstance();
        boolean exist = false;
        int price = 0;
        String descrip ="";
        switch (id){
            case(1):{
                price = 1000;
                descrip = "Баннер";
                break;
            }
            case(2): {
                price = 50;
                descrip = "Call-центр";
                break;
            }
            case(3):{
                price = 0;
                descrip = "DSS-Retail";
                break;
            }
            case(4): {
                price = 500;
                descrip = "Kompra";
                break;
            }
            default:
                break;
        }
        Services service = new Services(id,price,descrip);
        if(model.getBalance()-service.getPrice()>0)
            model.add(service);
        doGet(req,resp);
    }
}
