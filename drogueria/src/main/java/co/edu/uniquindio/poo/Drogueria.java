package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

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
    
    
}
