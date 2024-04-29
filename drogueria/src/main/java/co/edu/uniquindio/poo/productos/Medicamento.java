package co.edu.uniquindio.poo.productos;

public class Medicamento extends Producto {

    public double dosis;

    
        
    

    public Medicamento(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proveedor, double dosis) {
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor);
        this.dosis = dosis;
    }

    

    public double getDosis() {
        return dosis;
    }

    public int getStock() {
        return stock;
    }






    
}
