/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

import Pedido.Pedido;

/**
 *
 * @author USER
 */
public class Producto {
     private String nombre;
    private double precio;
    private Pedido pedido;

    public Producto(String nombre, double precio, Pedido categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.pedido = pedido;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
     public void mostrarDetalles() {
        double precioConIVA = precio * 1.12; 
        System.out.printf("Producto:  Pedido:  Precio:  Precio con IVA: "+nombre+pedido + precio +precioConIVA);
                
     }
}
