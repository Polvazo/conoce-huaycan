package com.droidpe.init.conocehuaycan.model;

public class Lugar {

    private String nombre;
    private String ubicacion;
    private String giroComercial;
    private Integer numeroCelular;
    private Integer cantidadVisitas;
    private String imagen;

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidadVisitas() {
        return cantidadVisitas;
    }

    public Lugar(String nombre, String ubicacion, String giroComercial, Integer numeroCelular, Integer cantidadVisitas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.giroComercial = giroComercial;
        this.numeroCelular = numeroCelular;
        this.cantidadVisitas = cantidadVisitas;
    }

    public void setCantidadVisitas(Integer cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getGiroComercial() {
        return giroComercial;
    }

    public void setGiroComercial(String giroComercial) {
        this.giroComercial = giroComercial;
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}
