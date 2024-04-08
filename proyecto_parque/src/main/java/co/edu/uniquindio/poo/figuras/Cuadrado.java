package co.edu.uniquindio.poo.figuras;

public class Cuadrado extends FiguraGeometrica {

    public double lado;

    public Cuadrado(double lado){
        validarMedida(lado);
        this.lado = lado;
    }

    public Double calcularArea(){
        return lado * lado;
    }

    
}

  