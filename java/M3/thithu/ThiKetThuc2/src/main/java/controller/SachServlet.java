package controller;

import model.Sach;
import service.SachServiceImpl;
import service.Sachservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SachServlet", urlPatterns = {"/SachServlet", ""})
public class SachServlet extends HttpServlet {
    Sachservice service = new SachServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "xem":
                showXemPage(request, response);
                break;
            case "muon":
                showMuonPage(request, response);
                break;
            case "findTenSach":
                showfindtPage(request,response);
                break;
            case "findTenHocSinh":
                showfindTenHocSinhpage(request,response);
                break;
            default:
                showList(request, response);
        }
    }

    private void showfindTenHocSinhpage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("nameSearch");
        System.out.println(name);
        request.setAttribute("sachList",service.findHocSinh(name));
        request.getRequestDispatcher("/sach/ListSachChoMuon.jsp").forward(request,response);
    }

    private void showfindtPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("nameSearch");
        System.out.println(name);
        request.setAttribute("sachList",service.findId(name));
        request.getRequestDispatcher("/sach/ListSachChoMuon.jsp").forward(request,response);
    }

    private void showMuonPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Sach sach = service.findById(id);
        request.setAttribute("sach", sach);
        request.getRequestDispatcher("/sach/muonSach.jsp").forward(request,response);
    }

    private void showXemPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("sachList", service.findAllSachChoMuon());
        request.getRequestDispatcher("/sach/ListSachChoMuon.jsp").forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("sachList", service.findAll());
        request.getRequestDispatcher("/sach/ListSach.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "xem":
                showXemPage(request, response);
                break;
////            case "find":
////                find(request,response);
////                break;
//            case "edit":
//                editProduct(request,response);
//                break;
////            case "delete":
////                delete(request,response);
////                break;
            default:
                showList(request, response);
        }
    }
}
