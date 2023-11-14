package com.cursojava.servlets.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TablaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Tabla 10x10</title></head><body>");
        out.println("<h2>Tabla 10x10</h2>");
        out.println("<table border='1'>");

        for (int i = 1; i <= 10; i++) {
            out.println("<tr>");
            for (int j = 1; j <= 10; j++) {
                out.println("<td>" + i + "x" + j + "</td>");
            }
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("<a href='/index.html'>Volver al menú</a>");
        out.println("</body></html>");
    }
}
