package co.edu.uniquindio.poo.figuras;

public class Circulo extends FiguraGeometrica {

    public Double radio;
    public final Double PI = 3.14;
    
    public Circulo(Double raido){
       validarMedida(raido);
       this.radio = raido;
    }

    public Double calcularArea() {
        return PI * Math.sqrt(radio);
    }

}
