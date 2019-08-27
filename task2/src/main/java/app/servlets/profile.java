package app.servlets;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import app.Model.*;

public class profile extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        int balance = model.getBalance();
        req.setAttribute("balance",balance);
        req.setAttribute("ids",model.getserids());
        req.setAttribute("prices",model.getserprice());
        req.setAttribute("des",model.getserdes());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/profile.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        int ind = Integer.valueOf(req.getParameter("ind"));
        model.delete(ind);
        doGet(req,resp);
    }
}
