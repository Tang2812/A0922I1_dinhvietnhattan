package controller;

import model.BenhNhan;
import repository.BenhNhanRepository;
import repository.BenhNhanRepositoryImpl;
import service.BenhNhanService;
import service.BenhNhanServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BenhNhanServlet", urlPatterns = {"/BenhNhanServlet",""})
public class BenhNhanServlet extends HttpServlet {
    BenhNhanService service= new BenhNhanServiceImpl();
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
//            case "find":
//                find(request,response);
//                break;
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

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String maBenhAn=request.getParameter("maBenhAn");
        System.out.println(maBenhAn);
        service.xoa(maBenhAn);
        response.sendRedirect("/BenhNhanServlet");
    }

    private void showEditPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String maBenhAn=request.getParameter("maBenhAn");
        System.out.println(maBenhAn);
        BenhNhan benhNhan=service.findId(maBenhAn);
        System.out.println(benhNhan);
        request.setAttribute("benhNhan",benhNhan);
        request.getRequestDispatcher("/benhNhan/Edit.jsp").forward(request,response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setAttribute("benhNhanList",service.findAll());
request.getRequestDispatcher("/benhNhan/List.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                createProduct(request,response);
//                break;
////            case "find":
////                find(request,response);
////                break;
            case "edit":
                editBenhNhan(request,response);
                break;
////            case "delete":
////                delete(request,response);
////                break;
            default:
                showList(request, response);
        }
    }

    private void editBenhNhan(HttpServletRequest request, HttpServletResponse response) throws IOException {
String maBenhAn=request.getParameter("maBenhAn");
String maBenhNhan=request.getParameter("maBenhNhan");
String tenBenhNhan=request.getParameter("tenBenhNhan");
String ngayNhapVien=request.getParameter("ngayNhapVien");
String ngayRaVien=request.getParameter("ngayRaVien");
String lyDoNhapVien=request.getParameter("lyDoNhapVien");
BenhNhan benhNhan= new BenhNhan(maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien);
service.sua(benhNhan);
response.sendRedirect("/BenhNhanServlet");

    }

}
