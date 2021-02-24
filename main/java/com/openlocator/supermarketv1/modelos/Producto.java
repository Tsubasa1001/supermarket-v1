package com.openlocator.supermarketv1.modelos;

public class Producto {

    private String nombre;
    private int imagen;
    private String descripcion;
    private String estado;
    private String precio;

    public Producto(String nombre, int imagen, String descripcion, String estado, String precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.estado = estado;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
