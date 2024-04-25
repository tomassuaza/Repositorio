package co.edu.uniquindio.poo;

public class Rectangulo extends Figura{


public final double ancho;
public final double alto;

    public Rectangulo(String nombre, int ancho, int alto ) {
        super(nombre);
        this.ancho= ancho;
        this.alto = alto;

    }

    public double calcularArea(){
        return ancho * alto;
        
    }
    public double getAncho(){
        return ancho;
    }

    public double getAlto(){
        return ancho;
    }
    
}
