package controller;

import model.customer;
import service.CustomerServiceempl;
import service.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    ICustomerService service=new CustomerServiceempl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action=request.getParameter("action");
       if(action==null){
           action="";
       }
       switch (action){
           case "create":
               showCreatePage(request,response);
               break;
           default:
               showList(request,response);
       }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList",service.findAll());
        request.getRequestDispatcher("/customer/list.jsp").forward(request, response);
    }

    private void showCreatePage(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.sendRedirect("/customer/create_jsp.jsp");
}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                createCustomer(request,response);
                break;
            default:
                showList(request,response);
        }
    }
private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name=request.getParameter("customerName");
        int tuoi=Integer.parseInt(request.getParameter("customerTuoi"));
        String queQuan=request.getParameter("customerQueQuan");
        customer cus=new customer(name,tuoi,queQuan);
        service.save(cus);
        response.sendRedirect("/CustomerServlet");
    }
}
