package controller;

import service.ProductService;
import service.ProductServiceIpml;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = {"/ProductServlet",""})
public class ProductServlet extends HttpServlet {
    ProductService service=new ProductServiceIpml();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                showCreatePage(request,response);
//                break;
////            case "remove":
////                showRemovePage(request,response);
////                break;
//            case "edit":
//                showEditPage(request,response);
//                break;
//            case "delete":
//                delete(request,response);
//                break;
            default:
                showList(request, response);
        }
    }
void showList(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("productList",service.findAll());
        request.getRequestDispatcher("/product/List.jsp").forward(request,response);
}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                showCreatePage(request,response);
//                break;
////            case "remove":
////                showRemovePage(request,response);
////                break;
//            case "edit":
//                showEditPage(request,response);
//                break;
//            case "delete":
//                delete(request,response);
//                break;
            default:
                showList(request, response);
        }
    }
}
