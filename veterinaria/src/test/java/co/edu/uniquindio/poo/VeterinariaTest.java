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
    public void datosCompletos(){
        LOG.info("Inicio Prueba datos completos");
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");
        assertEquals("Amigos Peludos", veterinaria.getNombre());
        LOG.info("Fin de la prueba datos completos");
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
        LOG.info("Inicio Prueba datos nulos");
        assertThrows(Throwable.class,()-> new Veterinaria(null));
        LOG.info("Fin de la prueba datos nulos");
    }

    


    @Test

    public void agregarMascotaRepetida(){
        LOG.info("Inicio agregarMascotaRepetida");
        Veterinaria veterinaria = new Veterinaria("Amigos peludos");
        Mascota1 mascota1 = new Mascota1("1109198124", "Toby", "Perro", "Pitbull", 4, "macho", "cafe", 9);
        veterinaria.agregarMascota(mascota1);
        Mascota1 mascota2 = new Mascota1("1109198124", "Lucas", "Perro", "Pincher", 6, "macho", "gris", 5);
        veterinaria.agregarMascota(mascota2);
        LOG.info("Finalizacion agregarMascotaRepetida");
    }

   
   
}

