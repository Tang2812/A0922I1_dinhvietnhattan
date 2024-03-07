package controller;

import service.HoKhauService;
import service.HoKhauServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HoKhauServlet", urlPatterns = {"/HoKhauServlet",""})
public class HoKhauServlet extends HttpServlet {
    HoKhauService service=new HoKhauServiceImpl();
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

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("hoKhauList",service.findAll());
    request.getRequestDispatcher("/hoKhau/List.jsp").forward(request,response);
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
//            case "find":
//                find(request,response);
//                break;
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
