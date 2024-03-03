package co.edu.uniquindio.poo;



import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.logging.Logger;


public class CursoTest {
    private static final Logger LOG = Logger.getLogger(CursoTest.class.getName());

    public void datosCompletos(){
        LOG.info("Inicio datos completos");
        Curso curso1 = new Curso("Programacion 1");
        assertEquals("Programacion 1", curso1.getNombre());
        LOG.info("Fin de pruebas datos completos");

    }

    @Test
    public void registrarEstudiante(){
        LOG.info("Inicio registro estudiantes");
        Curso curso1 = new Curso("Programacion 1");
        Estudiante estudiante = new Estudiante("Daniel", "Alzate", "1109187127", "danielalzate@gmail.com", "3013368137", (byte)20);
        curso1.registrarEstudiante(estudiante);
        LOG.info("Fin registro estudiante");



    }
    


}