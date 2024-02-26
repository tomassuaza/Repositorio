package co.edu.uniquindio.poo.mascota;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    @Test
    public void datosCompletos(){
        LOG.info("Inicio de la prueba datos completos");
        Mascota mascota = new Mascota("toby", "perro", "pincher", 4, "cafe", 5);
        assertEquals("toby", mascota.getNombre());
        assertEquals("perro", mascota.getEspecie());
        assertEquals("pincher", mascota.getRaza());
        assertEquals(4 , mascota.getEdad());
        assertEquals("cafe", mascota.getColor());
        assertEquals(5, mascota.getPeso());
    }

    @Test
    public void datosNulos(){
        LOG.info("Inicio de la prueba datos nulos");
        Mascota mascota = new Mascota(null, null, null, 0, null, 0);
        assertNull(mascota.getNombre());
        assertNull(mascota.getEspecie());
        assertNull(mascota.getRaza());
        assertEquals(0 , mascota.getEdad());
        assertNull(mascota.getColor());
        assertEquals(0, mascota.getPeso());
    }
}
