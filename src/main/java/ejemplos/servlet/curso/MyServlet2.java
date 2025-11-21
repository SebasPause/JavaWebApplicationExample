package ejemplos.servlet.curso;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

        // Obtener datos del formulario
        String nombre = request.getParameter("nombre");

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Formulario</title></head>");

        // ESTILOS
        out.println("<style>");
        out.println("body {");
        out.println("  display: flex;text-align:center;justify-content: center;align-items: center;");
        out.println("  height: 100vh;margin: 0;");
        out.println("}");
        out.println(".contenedor {");
        out.println("  border: 2px solid black;padding: 30px;text-align: center;");
        out.println("  width: 300px;border-radius: 10px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");

		out.println("<body>");
        out.println("<div class='contenedor'>");
		out.println("<h1>Bienvenid@ " + nombre + "!!</h1>");

        out.println("<form action='/myServlet' method='GET'>");
        out.println("<input type='submit' value='Cerrar sesión' " +
                "style='padding:10px 20px; font-size:16px;'>");
        out.println("</form>");

        out.println("</div>");
	}

}