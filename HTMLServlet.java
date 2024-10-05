import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HTMLServlet extends GenericServlet{
	public void service(ServletRequest Req, ServletResponse res) {
		try {
			PrintWriter pw = res.getWriter();
			pw.println("<html><body bgcolor='gray',text='pink'>");
			pw.println("Welcome to the Servlets......");
			pw.println("</body></html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}