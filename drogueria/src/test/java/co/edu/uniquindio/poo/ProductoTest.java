package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.productos.Medicamento;
import co.edu.uniquindio.poo.productos.Producto;

public class ProductoTest {
    private static final Logger LOG =Logger.getLogger(ProductoTest.class.getName());



@Test
public void productoSinStock(){
    LOG.info("Inicio prueba de produto sin stcok");
    var medicamento = new Medicamento("001", "advil", null, 0, 10, null, 0);
    assertThrows(IllegalArgumentException.class, () -> new Pedido(null, 100, null));

    LOG.info("Fin prueba de producto sin stock");
}



@Test
 public void testObtenerProductosStockMayor100() {
        
        List<Producto> productos = new ArrayList<>();
        productos.add(new Medicamento("001", "advil", null,  0, 100, null, 0));
        productos.add(new Medicamento("002", "acetaminofen", null, 0, 200, null, 0));
        productos.add(new Medicamento("003", "loratadina", null, 0, 150, null, 0));
        
        
        List<Producto> productosConStockMayor100 = obtenerProductosStockMayor100(productos);
        assertEquals(2, productosConStockMayor100.size());
        for (Producto producto : productosConStockMayor100) {
            assertTrue(producto.getStock() > 100);
        }
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


    





    

}
