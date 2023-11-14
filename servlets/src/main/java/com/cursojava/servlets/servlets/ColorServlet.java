package com.cursojava.servlets.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Cambio de Color</title></head><body>");

        // Obtén el parámetro 'color' del formulario
        String color = request.getParameter("color");

        // Cambia el fondo de la página al color proporcionado
        if (color != null && !color.isEmpty()) {
            out.println("<style>body { background-color: " + color + "; }</style>");
            out.println("<h2>Fondo de la Página Cambiado</h2>");
        } else {
            out.println("<p>Por favor, introduce un color válido.</p>");
        }

        out.println("<a href='/index.html'>Volver al menú</a>");
        out.println("</body></html>");
    }
}
