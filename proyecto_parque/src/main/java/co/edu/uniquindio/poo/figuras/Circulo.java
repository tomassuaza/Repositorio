package co.edu.uniquindio.poo.figuras;

public class Circulo extends FiguraGeometrica {

    public Double radio;
    public final Double PI = 3.14;
    
    public Circulo(Double radio){
       validarMedida(radio);
       this.radio = radio;
    }

    public Double calcularArea() {
        return Math.PI * radio *radio;
    }

}
