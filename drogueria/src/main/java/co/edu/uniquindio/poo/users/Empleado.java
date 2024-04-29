package co.edu.uniquindio.poo.users;

public class Empleado extends Persona {

    public double salario;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, telefono);
        this.salario = salario;
        


        
    }

    public double getSalario() {
        return salario;
    }

    

    
   
}
