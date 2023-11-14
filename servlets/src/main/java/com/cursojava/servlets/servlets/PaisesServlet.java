package com.cursojava.servlets.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PaisesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Paises Visitados</title></head><body>");

        // Obtén el parámetro 'paises' del formulario (selección múltiple)
        String[] paises = request.getParameterValues("paises");

        // Responde con los países seleccionados
        out.println("<h2>Países que has visitado:</h2>");
        if (paises != null && paises.length > 0) {
            out.println("<ul>");
            for (String pais : paises) {
                out.println("<li>" + pais + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>No has seleccionado ningún país.</p>");
        }

        out.println("<a href='/tupais.html'>Volver al Formulario</a>");
        out.println("</body></html>");
    }
}
