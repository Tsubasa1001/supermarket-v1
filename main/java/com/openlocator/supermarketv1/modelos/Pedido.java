package com.openlocator.supermarketv1.modelos;

public class Pedido {

    private int id;
    private int nit;
    private String nombre;
    private Carrito carrito;
    private int montoTotal;

    public Pedido() {
    }

    public Pedido(int id, int nit, String nombre, Carrito carrito, int montoTotal) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.carrito = carrito;
        this.montoTotal = montoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
}
