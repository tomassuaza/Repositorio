package co.edu.uniquindio.poo;

public abstract class Producto {

    public final String codigoProducto;
    public final String nombre;
    public final String descripcion;
    public final double precio;
    public final int stock;
    public final String proveedor;

    public Producto(String codigoProducto, String nombre, String descripcion, double precio, int stock, String proveedor){
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
        
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getProveedor() {
        return proveedor;
    }

}



