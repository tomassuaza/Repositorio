package co.edu.uniquindio.poo;

public class Acudiente extends Estudiante {

    public Acudiente(String nombre, int numeroId, String apellido, int telefono, String direccion){
        super(nombre, numeroId, apellido, telefono, direccion);
    }

    @Override
    public String toString() {
        return "Acudiente []";
    }
    
    
}
