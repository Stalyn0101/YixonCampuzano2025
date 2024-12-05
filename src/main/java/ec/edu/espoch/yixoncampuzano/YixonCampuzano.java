/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.yixoncampuzano;

import Cliente.Cliente;
import Pedido.Pedido;
import Producto.Producto;

/**
 *
 * @author USER
 */
public class YixonCampuzano {

    public static void main(String[] args) {
        // Crear productos
        Producto cafe = new Producto("Café", 1.50, pedido.BEBIDA);
        Producto pastel = new Producto("Pastel", 2.00, pedido.POSTRE);
        Producto sandwich = new Producto("Sandwich", 3.50, pedido.ALIMENTO);

        // Crear cliente
        Cliente cliente = new Cliente("Yixon Campuzano", "010");

        // Crear pedido y asociar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(cafe);
        pedido.agregarProducto(pastel);
        pedido.agregarProducto(sandwich);

        // Mostrar detalles del pedido
        pedido.mostrarResumen();
        
    }
}
