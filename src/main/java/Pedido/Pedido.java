/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedido;

import Cliente.Cliente;
import Producto.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarResumen() {
        System.out.println("Resumen del pedido para: " + cliente.getNombre());
        double total = 0;
        for (Producto producto : productos) {
            producto.mostrarDetalles();
            total = producto.getPrecio() * 1.12; 
        }
        System.out.printf("Total del  IVA es : "+total);
    }
    
}
