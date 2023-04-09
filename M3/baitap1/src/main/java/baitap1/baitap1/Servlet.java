package baitap1.baitap1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Disscount", value = "/display-discount")
public class Servlet extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String dec = request.getParameter("description");
    int price= Integer.parseInt(request.getParameter("price"));
       int percent=Integer.parseInt(request.getParameter("percen"));
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        float Amount= (float) ((float) price*percent*0.01);
        float resuilt= Amount+price;
            writer.println( "Decription: "+dec);
            writer.println("<br>");
            writer.println("Price: "+price);
        writer.println("<br>");
            writer.println("Percent: "+percent);
        writer.println("<br>");
            writer.println("Amount: "+Amount);
        writer.println("<br>");
            writer.println("Total price: : "+resuilt);

        writer.println("</html>");
    }
    }

