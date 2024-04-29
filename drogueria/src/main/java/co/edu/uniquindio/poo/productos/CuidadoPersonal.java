package co.edu.uniquindio.poo.productos;

public class CuidadoPersonal extends Producto{


    public String ingredientes;

    public CuidadoPersonal(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proveedor, String ingredientes) {
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor);
        this.ingredientes = ingredientes;
    
    }

    

    public String getIngredientes() {
        return ingredientes;
    }

    
    
}
