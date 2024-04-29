package co.edu.uniquindio.poo;

public abstract class Estudiante {

    private String nombre;
    private int numeroId;
    private String apellido;
    public int telefono;
    public String direccion;

    public Estudiante(String nombre, int numeroId, String apellido, int telefono, String direccion){
        this.nombre = nombre;
        this.numeroId = numeroId;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    public String getNombre(){
        return nombre;

    }

    public int getNumeroId(){
        return numeroId;
    }  
    
    public String getApellido(){
        return apellido;
    }

    public int getTelefono(){
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", numeroId=" + numeroId + ", apellido=" + apellido + ", telefono="
                + telefono + ", direccion=" + direccion + "]";
    }

    

    
}
