package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {

        // Obtener parámetro del formulario
        String nombre = request.getParameter("nombre");

        // Guardar en request o session
        request.setAttribute("nombre", nombre);

        // Redirigir al siguiente servlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("/myServlet2");
        dispatcher.forward(request, response);

	}

}