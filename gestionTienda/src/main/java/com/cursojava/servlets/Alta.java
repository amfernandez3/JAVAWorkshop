package com.cursojava.servlets;

import com.cursojava.model.Producto;
import jakarta.servlet.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;
import java.util.*;

public class Alta extends HttpServlet implements Servlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        String seccion = request.getParameter("seccion");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int stock = Integer.parseInt(request.getParameter("stock"));

        // Crear un nuevo producto
        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre(nombre);
        nuevoProducto.setSeccion(seccion);
        nuevoProducto.setPrecio(precio);
        nuevoProducto.setStock(stock);

        // Obtener o crear la sesión
        HttpSession session = request.getSession(true);

        // Obtener la lista de productos de la sesión
        List<Producto> listaProductos = (List<Producto>) session.getAttribute("listaProductos");

        // Si la lista no existe en la sesión, crear una nueva
        if (listaProductos == null) {
            listaProductos = new ArrayList<>();
        }

        // Agregar el nuevo producto a la lista
        listaProductos.add(nuevoProducto);

        // Actualizar la lista en la sesión
        session.setAttribute("listaProductos", listaProductos);

        // Redirigir a la página principal o mostrar un mensaje de éxito
        response.sendRedirect("/index.html");
    }

}
