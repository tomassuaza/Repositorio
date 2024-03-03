package co.edu.uniquindio.poo;

public record Estudiante(String nombres, String apellidos, String numeroIdentificacion, String correo, String telefono, int edad) {

    public Estudiante {
        assert nombres != null && !nombres.isBlank() :"El nombre debe ser diferente de null";
        assert apellidos != null && !apellidos.isBlank() : "El apellido debe ser diferente de null";
        assert numeroIdentificacion != null && !numeroIdentificacion.isBlank() : "El numero de identificacion debe ser diferente de null";
        assert correo != null && correo.contains("@") : "El correo electronico debe conteer el simbolo @";
        assert telefono != null : "El telefono no puede ser null";
        assert edad > 0 : "La edad debe ser mayor a cero";
        
    }
    
}
