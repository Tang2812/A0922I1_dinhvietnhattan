import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "CaculationServlet", value = "/calculate")
public class CaculationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float a=Float.parseFloat(request.getParameter("first-operand"));
        float b=Float.parseFloat(request.getParameter("second-operand"));
        String cl=request.getParameter("operator");
        float result=0;
        switch (cl){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
        }
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        writer.println(a+" "+cl+" "+b+" = "+result);
        writer.println("</html>");
    }
}
