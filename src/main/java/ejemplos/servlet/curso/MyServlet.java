package ejemplos.servlet.curso;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

        // INICIO
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

        // BODY
		out.println("<body>");
        out.println("<div class='contenedor'>");
		out.println("<h1>Login</h1>");

        // FORMULARIO
        out.println("<form action='/myServlet2' method='GET'>");
        out.println("Nombre: <input type='text' name='nombre' required><br><br>");
        out.println("<input type='submit' value='Iniciar sesión'>");
        out.println("</form>");

        out.println("</div>");
		out.println("</body></html>");
	}

}