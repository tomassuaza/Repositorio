package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import co.edu.uniquindio.poo.productos.Producto;
import co.edu.uniquindio.poo.users.Cliente;
import co.edu.uniquindio.poo.users.Empleado;
import co.edu.uniquindio.poo.users.Persona;

public class Drogueria {

    public final String nombre;
    public final Collection<Cliente> listaClientes;
    public final Collection<Producto> listaProductos;
    public final Collection<Pedido> listaPedidos;
    public final Collection<Empleado> listaEmpleados;




    public Drogueria(String nombre) {
        assert nombre != null && !nombre.isBlank();
        this.nombre = nombre;
        this.listaClientes = new LinkedList<Cliente>();
        this.listaProductos = new LinkedList<Producto>();
        this.listaPedidos = new LinkedList<Pedido>();
        this.listaEmpleados = new LinkedList<Empleado>();
    }
    


    



    public String getNombre() {
        return nombre;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }
    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }
    public Collection<Pedido> getListaPedidos() {
        return listaPedidos;
    }
    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public List<Producto> obtenerProductosStockMayor100(List<Producto> productos) {
        List<Producto> productosStockMayor100 = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getStock() > 100) {
                productosStockMayor100.add(producto);
            }
        }
        return productosStockMayor100;
    }


    
    public void agregarProdcuto(Producto producto, Persona persona){
    assert persona.getClass().getSimpleName() == "Gerente";
     listaProductos.add(producto);
     }


    public void eliminarProducto(Producto producto, Persona persona) {
        assert persona.getClass().getSimpleName() == "Gerente";
        if (!listaProductos.remove(producto)) {   
            System.out.println("El producto no existe en la lista. No se puede eliminar.");  
    }
}
    
    
}
