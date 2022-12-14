import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InvalidClassException;
import java.io.PrintWriter;

@WebServlet("/main")
public class main extends HttpServlet {
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Servlet Exception

        RequestDispatcher requestDispatcher;

        httpServletResponse.setContentType(type: "text/html");

        PrintWriter printwriter = httpServletResponse.getWriter();

        String clientFirstName = httpServletRequest.getParameter("first_name");
        String clientLastName = httpServletRequest.getParameter("last_name");


        if (clientFirstName.isEmpty() || clientLastName.isEmpty()) {
            requestDispatcher = httpServletRequest.getRequestDispatcher("main.html");
            printWriter.printIn("You must complete all fields");
            requestDispatcher.include(httpServletRequest, httpServletResponse);
        } else if (rbutton.isnotselected?){
// If radio button is not selected 
            printWriter.printIn("You must have a gender button selected in order to continue.")
        } else {
            requestDispatcher = httpServletRequest.getRequestDispatcher("main.html");
            requestDispatcher.forward(httpServletRequest, httpServletResponse);
            printWriter.printIn("You have successfully logged into the store");
        }

}
// Name Entered into value 
// On click "Welcome to my shop" headers 
// "Thank you" dynamic name as the body

// No first and/or last name on submit 
// First or last name non-text data 
// When no radio button is selected on submit