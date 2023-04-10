package controller;

import model.customer;

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
    private static List<customer> customerList;
    static {
        customerList= new ArrayList<>();
        customerList.add(new customer("Tan",20,"Gia Lai"));
        customerList.add(new customer("Nhi",19,"Da Nang"));
        customerList.add(new customer("Tuan",10,"Quang Nam"));
        customerList.add(new customer("Quan",20,"Nha Trang"));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("/customer/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
