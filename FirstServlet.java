import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{
	public void service (ServletRequest req, ServletResponse res) {
		PrintWriter pw;
		try {
			pw = res.getWriter();
			pw.println("Welocme to Servlets");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
