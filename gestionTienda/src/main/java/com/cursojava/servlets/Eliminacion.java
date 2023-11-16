package com.cursojava.servlets;

import com.cursojava.model.Producto;
import jakarta.servlet.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

public class Eliminacion extends HttpServlet implements Servlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Obtener el índice del producto a eliminar
        int indice = Integer.parseInt(request.getParameter("indice"));

        // Obtener la sesión
        HttpSession session = request.getSession();

        // Obtener la lista de productos de la sesión

        List<Producto> listaProductos = (List<Producto>) session.getAttribute("listaProductos");

        // Si la lista no existe o el índice está fuera de rango, redirigir a la página principal
        if (listaProductos == null || indice < 0 || indice >= listaProductos.size()) {
            response.sendRedirect("/index.html");
            return;
        }

        // Eliminar el producto de la lista
        listaProductos.remove(indice);

        // Actualizar la lista en la sesión
        session.setAttribute("listaProductos", listaProductos);

        // Redirigir a la página principal
        response.sendRedirect("/index.html");
    }

}
