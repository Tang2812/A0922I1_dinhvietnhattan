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

@WebServlet(name = "CustomerServlet", value = {"/CustomerServlet",""})
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
           case "remove":
               showRemovePage(request,response);
               break;
           case "edit":
               showEditPage(request,response);
               break;
           case "View":
               showViewPage(request,response);
               break;
           default:
               showList(request,response);
       }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList",service.findAll());
        request.getRequestDispatcher("/customer/list.jsp").forward(request, response);
    }
private  void showEditPage(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String name= request.getParameter("ten");
        customer customer = service.finByName(name);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("customer/edit_jsp.jsp").forward(request, response);
}
    private  void showViewPage(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String name=request.getParameter("ten");
        customer customer=service.finByName(name);
        request.setAttribute("customer",customer);
        request.getRequestDispatcher("customer/view_jsp.jsp").forward(request, response);
    }
        private void showCreatePage(HttpServletRequest request,HttpServletResponse response) throws IOException {
            response.sendRedirect("/customer/create_jsp.jsp");
    }
private  void showRemovePage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/customer/Remove_jsp.jsp");
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
            case  "remove":
                removeCustomer(request,response);
                break;
            case "edit":
                editCustomer(request,response);
                break;
            case "View":
                viewCustomer(request,response);
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
    private  void removeCustomer(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String name=request.getParameter("customerName");
        service.remove(name);
        response.sendRedirect("/CustomerServlet");
    }
    private  void editCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name=request.getParameter("customerTen");
        int tuoi= Integer.parseInt(request.getParameter("customerTuoi"));
        String queQuan=request.getParameter("customerQueQuan");

        service.edit(name, tuoi, queQuan);
        response.sendRedirect("/CustomerServlet");
    }
    private void viewCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.sendRedirect("/CustomerServlet");
//        request.getRequestDispatcher("/CustomerServlet").forward(request, response);
    }
}
