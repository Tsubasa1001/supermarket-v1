package com.openlocator.supermarketv1.modelos;

public class Carrito {

    public String nombreC;
    private String estadoC;
    private String precioC;


    public Carrito() {
    }

    public Carrito(String nombreC, String estadoC, String precioC) {
        this.nombreC = nombreC;
        this.estadoC = estadoC;
        this.precioC = precioC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }

    public String getPrecioC() {
        return precioC;
    }

    public void setPrecioC(String precioC) {
        this.precioC = precioC;
    }
}
