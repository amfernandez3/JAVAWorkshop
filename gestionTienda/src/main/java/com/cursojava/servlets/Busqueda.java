package com.cursojava.servlets;

import com.cursojava.model.Producto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Busqueda extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        // Obtener parámetros de búsqueda
        String seccion = request.getParameter("seccion");

        // Obtener la sesión
        HttpSession session = request.getSession();

        // Obtener la lista de productos de la sesión
        List<Producto> listaProductos = (List<Producto>) session.getAttribute("listaProductos");

        // Filtrar productos por sección
        List<Producto> resultados = new ArrayList<>();
        if (listaProductos != null && seccion != null && !seccion.isEmpty()) {
            for (Producto producto : listaProductos) {
                if (seccion.equalsIgnoreCase(producto.getSeccion())) {
                    resultados.add(producto);
                }
            }
        }

        // Guardar resultados en la sesión
        session.setAttribute("resultadosBusqueda", resultados);

        // Redirigir a la página de resultados de búsqueda
        response.sendRedirect("/busqueda.html");
    }
}
