package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import co.edu.uniquindio.poo.productos.Producto;

public class Pedido {

    public LocalDate fecha;
    public int cantidad;
    public Collection<Pedido> clientePedidos;
    public String productoPedido;

    public Pedido(LocalDate fecha, int cantidad, String productoPedido ){
        this.fecha = fecha;
        this.cantidad = cantidad;
        this. clientePedidos = new LinkedList<>();

    }

    public double calcularCostoTotalPedido(List<Producto> productos) {
    double costoTotal = 0.0;
    for (Producto producto : productos) {
        costoTotal += producto.getPrecio();
    }
    return costoTotal;
}



}
