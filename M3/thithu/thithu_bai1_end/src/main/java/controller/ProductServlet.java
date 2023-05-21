package controller;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns ={ "/ProductServlet",""})
public class ProductServlet extends HttpServlet {
    ProductRepository service=new ProductRepositoryImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreatePage(request,response);
                break;
            case "find":
                find(request,response);
                break;
            case "edit":
                showEditPage(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                showList(request, response);
        }
    }

    private void showEditPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        Product product=service.findByid(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("/product/Edit.jsp").forward(request,response);
    }

    private void showCreatePage(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.sendRedirect("/product/Create.jsp");
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("productList",service.findAll());
    request.getRequestDispatcher("/product/List.jsp").forward(request,response);
    }
    private void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("nameSearch");
        System.out.println(name);
        request.setAttribute("productList",service.find(name));
        request.getRequestDispatcher("/product/List.jsp").forward(request,response);
    }
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        service.delete(id);
        response.sendRedirect("/ProductServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request,response);
                break;
//            case "find":
//                find(request,response);
//                break;
            case "edit":
                editProduct(request,response);
                break;
//            case "delete":
//                delete(request,response);
//                break;
            default:
                showList(request, response);
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        String ten=request.getParameter("productTen");
        int gia= Integer.parseInt(request.getParameter("productGia"));
        int soLuong= Integer.parseInt(request.getParameter("productSoLuong"));
        String mauSac=request.getParameter("productMauSac");
        String moTa=request.getParameter("productMoTa");
        String danhMuc=request.getParameter("productDanhMuc");
        Product product=new Product(id,ten,gia,soLuong,mauSac,moTa,danhMuc);
        service.edit(product);
        response.sendRedirect("/ProductServlet");
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ten=request.getParameter("productTen");
        int gia= Integer.parseInt(request.getParameter("productGia"));
        int soLuong= Integer.parseInt(request.getParameter("productSoLuong"));
        String mauSac=request.getParameter("productMauSac");
        String moTa=request.getParameter("productMoTa");
        String danhMuc=request.getParameter("productDanhMuc");
        Product product=new Product(ten,gia,soLuong,mauSac,moTa,danhMuc);
        service.create(product);
        response.sendRedirect("/ProductServlet");
    }
}
