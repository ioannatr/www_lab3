import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		

		String n=request.getParameter("username");
		out.print("<style>body {background-image: url(\"eikona.jpg\");}</style>");
		out.print("<h1>Welcome "+n+"!</h1>");
                
        //out.print("<p><img src=\"eikona.jpg\"></p>");
		out.close();
	}

}
