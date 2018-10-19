import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DepositRateServlet", urlPatterns = "/calculator")
public class DepositRateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float amount = Float.parseFloat(request.getParameter("Amount"));
        float month = Float.parseFloat(request.getParameter("Month"));
        float rate = Float.parseFloat(request.getParameter("Rate"));
        float interest = amount*rate*month/100/12;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Amount: " + amount+ "</h1>");
        writer.println("<h1>Rate: " + rate+ "</h1>");
        writer.println("<h1>Month: " + month+ "</h1>");
        writer.println("<h1>Interest: " + interest+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
