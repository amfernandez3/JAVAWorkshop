package com.cursojava.servlets.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TablaServletEntrada extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Generador de Tablas</title></head><body>");

        // Obtén el parámetro 'numero' del formulario
        String numeroStr = request.getParameter("numero");
        int numero = (numeroStr != null && !numeroStr.isEmpty()) ? Integer.parseInt(numeroStr) : 0;

        // Genera la tabla
        if (numero > 0) {
            out.println("<h2>Tabla " + numero + "x" + numero + "</h2>");
            out.println("<table border='1'>");

            for (int i = 1; i <= numero; i++) {
                out.println("<tr>");
                for (int j = 1; j <= numero; j++) {
                    out.println("<td>" + i * j + "</td>");
                }
                out.println("</tr>");
            }

            out.println("</table>");
        } else {
            out.println("<p>Por favor, introduce un número válido.</p>");
        }
        out.println("<a href='/index.html'>Volver al menú</a>");
        out.println("</body></html>");
    }
}
