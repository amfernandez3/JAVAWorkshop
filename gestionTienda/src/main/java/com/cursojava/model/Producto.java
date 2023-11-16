package com.cursojava.model;


public class Producto {

    private String nombre;

    private String seccion;


    private Double precio;


    private Integer stock;

    // Constructor, getters y setters

    public Producto() {
        // Constructor vacío necesario para Thymeleaf y formularios
    }

    public Producto(String nombre, String seccion, Double precio, Integer stock) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
