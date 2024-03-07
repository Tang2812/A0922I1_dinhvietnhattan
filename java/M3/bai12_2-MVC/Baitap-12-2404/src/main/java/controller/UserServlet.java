package controller;

import model.User;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet",""})
public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

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
//            case "remove":
//                showRemovePage(request,response);
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

    void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("userList", userService.findAll());
        request.getRequestDispatcher("user/List.jsp").forward(request, response);
    }

    void showCreatePage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/user/Create.jsp");
    }
    void showEditPage(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       int id= Integer.parseInt(request.getParameter("id"));
        User user= userService.findById(id);
        request.setAttribute("user",user);
        request.getRequestDispatcher("/user/Edit.jsp").forward(request,response);
    }
    void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id= Integer.parseInt(request.getParameter("id"));
userService.delete(id);
response.sendRedirect("user/List.jsp");
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
                editUser(request,response);
                break;
//            case "view":
//                showViewPage(request,response);
//                break;
            default:
                showList(request, response);
        }
    }
    void createUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String name=request.getParameter("userName");
            String email=request.getParameter("userEmail");
            String country=request.getParameter("userCountry");
            User user=new User(name,email,country);
            userService.create(user);
        response.sendRedirect("user/List.jsp");
    }
    void editUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id= Integer.parseInt(request.getParameter("id"));
       User user= userService.findById(id);
        String name=request.getParameter("userName");
        String email=request.getParameter("userMail");
        String country=request.getParameter("userCountry");
        userService.edit(id,name,email,country);
        response.sendRedirect("user/List.jsp");
    }
}
