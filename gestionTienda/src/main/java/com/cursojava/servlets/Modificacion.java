package com.cursojava.servlets;
import com.cursojava.model.Producto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class Modificacion extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros de modificación
        int indice = Integer.parseInt(request.getParameter("indice"));
        double nuevoPrecio = Double.parseDouble(request.getParameter("nuevoPrecio"));

        // Obtener la sesión
        HttpSession session = request.getSession();

        // Obtener la lista de productos de la sesión
        @SuppressWarnings("unchecked")
        List<Producto> listaProductos = (List<Producto>) session.getAttribute("listaProductos");

        // Modificar el precio del producto en la posición indicada
        if (listaProductos != null && indice >= 0 && indice < listaProductos.size()) {
            listaProductos.get(indice).setPrecio(nuevoPrecio);
            session.setAttribute("listaProductos", listaProductos);
        }

        // Redirigir a la página principal
        response.sendRedirect("/index.html");
    }
}
