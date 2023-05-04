package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "product", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    ProductService customerService= new ProductServiceImpl();
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
            case "view":
                showViewPage(request,response);
                break;
            default:
                showList(request,response);
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("productList",customerService.findAll());

        request.setAttribute("producerList","list");//producerService.findAll()
        request.getRequestDispatcher("product/list.jsp").forward(request, response);
    }
    private void showCreatePage(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.sendRedirect("/product/Create_jsp.jsp");
    }
    private void showRemovePage(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.sendRedirect("/product/Remove_jsp.jsp");
    }
    private void showViewPage(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        int id=Integer.parseInt(request.getParameter("id"));
       Product product= service.findById(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("/product/View.jsp").forward(request,response);
    }
    private void showEditPage(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        int id=Integer.parseInt(request.getParameter("id"));
        Product product= service.findById(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("/product/Edit_jsp.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                crateProduct(request,response);
                break;
            case  "remove":
                removeProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
//            case "View":
//                viewCustomer(request,response);
//                break;
            default:
                showList(request,response);
        }
    }
    ProductService service=new ProductServiceImpl();
    private void crateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name=request.getParameter("productName");
        int price=Integer.parseInt(request.getParameter("productPrice"));
        String status=request.getParameter("productStatus");
        String producer=request.getParameter("productProducer");
        Product product=new Product(name,price,status,producer);
        service.create(product);
        response.sendRedirect("/product");
    }
    private void removeProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id=Integer.parseInt(request.getParameter("productId"));
        service.remove(id);
        response.sendRedirect("/product");
    }
    private void editProduct(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
         int id=Integer.parseInt(request.getParameter("id"));
        Product product= service.findById(id);
        String name=request.getParameter("productName");
        int price=Integer.parseInt(request.getParameter("productPrice"));
        String status=request.getParameter("productStatus");
        String producer=request.getParameter("productProducer");
        service.edit(id,name,price,status,producer);
        response.sendRedirect("/product");
    }
}
