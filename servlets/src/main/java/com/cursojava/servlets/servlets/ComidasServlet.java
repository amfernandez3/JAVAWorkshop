package com.cursojava.servlets.servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ComidasServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Comidas Seleccionadas</title></head><body>");
        out.println("<h2>Comidas que te gustan:</h2>");

        String[] comidas = request.getParameterValues("comidas");

        if (comidas != null && comidas.length > 0) {
            out.println("<ul>");
            for (String comida : comidas) {
                out.println("<li>" + comida + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>No has seleccionado ninguna comida.</p>");
        }

        out.println("<a href='/index.html'>Volver al Formulario</a>");
        out.println("</body></html>");
    }
}
