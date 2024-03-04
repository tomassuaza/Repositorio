package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    @Test

    public void datosCompletos (){
        LOG.info("Inicio datosCompletos");


        Mascota1 mascota = new Mascota1("1109198124", "Toby", "Perro", "Pitbull", 4, "macho", "cafe", 9);


        assertEquals("1109198124", mascota.numeroId());
        assertEquals("Toby", mascota.nombre());
        assertEquals("Perro", mascota.especie());
        assertEquals("Pitbull", mascota.raza());
        assertEquals(4, mascota.edad());
        assertEquals("macho", mascota.genero());
        assertEquals("cafe", mascota.color());
        assertEquals(9, mascota.peso());


    }

    @Test

   

    

    public void agregarMascota() {
        LOG.info("Inicio agregarMascota");
    
        
        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        Mascota1 mascota1 = new Mascota1("1109198124", "Toby", "Perro", "Pitbull", 4, "macho", "cafe", 9);
        veterinaria.agregarMascota(mascota1);
        List<Mascota1> mascotasRegistradas = veterinaria.obtenerMascotas();
        assertTrue(mascotasRegistradas.contains(mascota1), "La mascota no se agregó correctamente");

    }

    @Test
    public void datosNulos(){
        LOG.info("Inicio datosNulos");
        assertThrows(Throwable.class, ()-> new Veterinaria(null));
        LOG.info("Finalizacion datosNulos");

    }


    @Test

    public void agregarMascotaRepetida(){
        LOG.info("Inicio agregarMascotaRepetida");
        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        Mascota1 mascota1 = new Mascota1("1109198124", "Toby", "Perro", "Pitbull", 4, "macho", "cafe", 9);
        veterinaria.agregarMascota(mascota1);
        Mascota1 mascota2 = new Mascota1("1109876189", "Lucas", "Perro", "Pincher", 6, "macho", "gris", 5);
        veterinaria.agregarMascota(mascota2);
        LOG.info("Finalizacion agregarMascotaRepetida");
    }

   
   
}
