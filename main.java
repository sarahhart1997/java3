import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InvalidClassException;
import java.io.PrintWriter;

@WebServlet("/formsubmit")
public class main extends HttpServlet {
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Servlet Exception

        RequestDispatcher requestDispatcher;

        httpServletResponse.setContentType(type: "text/html");

        PrintWriter printwriter = httpServletResponse.getWriter();

        String clientFirstName = httpServletRequest.getParameter(first_name: "first_name");
        String clientLastName = httpServletRequest.getParameter(last_name: "last_name");


        if (clientFirstName.isEmpty() || clientLastName.isEmpty()) {
            requestDispatcher = httpServletRequest.getRequestDispatcher(path: "main.html");
            printWriter.printIn(x: "You must complete all fields");
            requestDispatcher.include(httpServletRequest, httpServletResponse);
        } else {
            requestDispatcher = httpServletRequest.getRequestDispatcher(path: "main.html");
            requestDispatcher.forward(httpServletRequest, httpServletResponse);
            printWriter.printIn(x: "You have successfully logged into the store");
        }

}
// Name Entered into value 
// On click "Welcome to my shop" headers 
// "Thank you" dynamic name as the body

// No first and/or last name on submit 
// First or last name non-text data 
// When no radio button is selected on submit