package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns ={"/ProductServlet",""})
public class ProductServlet extends HttpServlet {
ProductService service= new ProductServiceImpl();
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
////            case "remove":
////                showRemovePage(request,response);
////                break;
            case "edit":
                showEditPage(request,response);
                break;
//            case "delete":
//                delete(request,response);
//                break;
            default:
                showList(request, response);
        }
    }
void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setAttribute("productList",service.findAll());
request.getRequestDispatcher("product/List.jsp").forward(request,response);
}
void showCreatePage(HttpServletRequest request, HttpServletResponse response) throws IOException {
response.sendRedirect("product/Create.jsp");
}
void showEditPage(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id= Integer.parseInt(request.getParameter("id"));
        Product product=service.findById(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("/product/Edit.jsp").forward(request,response);
}
void delete(HttpServletRequest request, HttpServletResponse response){
        int id=Integer.parseInt(request.getParameter("id"));
}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createUser(request,response);
                break;
//            case "remove":
//                showRemovePage(request,response);
//                break;
            case "edit":
                editProduct(request,response);
                break;
//            case "view":
//                showViewPage(request,response);
//                break;
            default:
                showList(request, response);
        }
    }
    void createUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name=request.getParameter("productTen");
        int gia= Integer.parseInt(request.getParameter("productGia"));
        int soLuong= Integer.parseInt(request.getParameter("productSoLuong"));
        String mauSac=request.getParameter("productMauSac");
        String moTa=request.getParameter("productMoTa");
        String danhmuc=request.getParameter("productDanhMuc");
        int idDanhMuc=-1;
        switch (danhmuc){
            case "Iphone":
                idDanhMuc=1;
                break;
            case "Redmi":
                idDanhMuc=2;
                break;
        }
        service.create(name,gia,soLuong,mauSac,moTa,idDanhMuc);
        response.sendRedirect("/ProductServlet");
    }
    void editProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        String ten=request.getParameter("productTen");
        int gia= Integer.parseInt(request.getParameter("productGia"));
        int soLuong= Integer.parseInt(request.getParameter("productSoLuong"));
        String mauSac=request.getParameter("productMauSac");
        String moTa=request.getParameter("productMoTa");
        String danhMuc=request.getParameter("productDanhMuc");
        int idDanhMuc=-1;
        switch (danhMuc){
            case "Iphone":
                idDanhMuc=1;
                break;
            case "Redmi":
                idDanhMuc=2;
                break;
        }
        service.edit(id,ten,gia,soLuong,mauSac,moTa,idDanhMuc);
        response.sendRedirect("/ProductServlet");
    }
}
