package com.cursojava.servlets.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LenguajesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Lenguajes de Programación</title></head><body>");

        // Obtén el parámetro 'lenguaje' del formulario
        String lenguaje = request.getParameter("lenguaje");

        // Responde con los lenguajes seleccionados
        out.println("<h2>Te dusta el lenguaje:</h2>");
        if (lenguaje != null && !lenguaje.isEmpty()) {
            out.println("<p>" + lenguaje + "</p>");
        } else {
            out.println("<p>No has seleccionado ningún lenguaje.</p>");
        }

        out.println("<a href='/index.html'>Volver al menú</a>");
        out.println("</body></html>");
    }
}
