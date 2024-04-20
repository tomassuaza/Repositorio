package co.edu.uniquindio.poo;

public abstract class Persona {
    

    public final String apellidos;
    public final String nombre;
    public final String dni;
    public final String direccion ;
    public final String telefono;

    public Persona(String nombre, String apellidos, String dni, String direccion, String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        
        
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

}