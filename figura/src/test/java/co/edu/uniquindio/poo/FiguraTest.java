package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class FiguraTest {

        private static final Logger LOG = Logger.getLogger(FiguraTest.class.getName());
    

    @Test
    public void datosVacios(){
        LOG.info("Inicio datos vacios");
        List<Figura> figuras = new LinkedList<>();
        
        assertThrows(Throwable.class, () -> {ProyectoFigura.ordenarPorArea(figuras);});
        LOG.info("Fin datos vacios");

        
    
    }
    @Test
    public void datosNulos(){
        LOG.info("Inicio datos nulos");
        List<Figura> figuras = new LinkedList<>();
        assertThrows(Throwable.class,()-> {ProyectoFigura.ordenarPorArea(figuras);});
        LOG.info("Fin datos nulos");
    }

}
