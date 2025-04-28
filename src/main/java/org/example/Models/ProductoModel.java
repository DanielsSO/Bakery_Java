package org.example.Models;

import java.util.List;

public class ProductoModel {
//    private int id;
    private String nombre;
    private String img;
    private int cantidad;
//    private String cat;
    private double precio;
//    private List<ProductoModel> productos;

    public ProductoModel(String nombre, String img, int cantidad, double precio) {
//        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.cantidad = cantidad;
//        this.cat = cat;
        this.precio = precio;
    }

//    public int getId() {
//        return id;
//    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImg() {
        return img;
    }

//    public String getCat() {
//        return cat;
//    }

    public double getPrecio() {
        return precio;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public void setCat(String cat) {
//        this.cat = cat;
//    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
