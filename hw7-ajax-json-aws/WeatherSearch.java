import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WeatherSearch extends HttpServlet {
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/plain"); 
    response.getWriter().write("Hello!");
	}    	
/* We are going to perform the same operations for POST requests as for GET methods, so this method just sends the request to the doGet method.*/
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
		doGet(request, response);
	}
}