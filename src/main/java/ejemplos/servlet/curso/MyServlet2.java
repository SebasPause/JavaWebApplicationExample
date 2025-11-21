package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {

        // Recuperar el dato de MyServlet
        String nombre = (String) request.getAttribute("nombre");

        // Enviar a JSP final
        RequestDispatcher dispatcher = request.getRequestDispatcher("bienvenido.jsp");
        dispatcher.forward(request, response);
	}

}