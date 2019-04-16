import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculatorServlet", urlPatterns = "/calculator")
public class DiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String product = request.getParameter("ProductDescription");
      float listPrice = Float.parseFloat(request.getParameter("ListPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));
        double disCountAmount = listPrice * ( discountPercent /100 ) * 0.1;
        double disCountPrice = listPrice - disCountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Product Description: " + product + " </h2>");
        writer.println("<h2>List Price: " + "$" + listPrice + " </h2>");
        writer.println("<h2>Discount Percent: " + discountPercent+ "%" +" </h2>");
        writer.println("<h2>Discount Amount: "+ "$" + disCountAmount + " </h2>");
        writer.println("<h2>Discount Price: "+ "$" + disCountPrice + " </h2>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
