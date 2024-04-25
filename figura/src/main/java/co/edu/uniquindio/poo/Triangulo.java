package co.edu.uniquindio.poo;

public class Triangulo extends Figura {

public final double base;
public final double altura;

public Triangulo(String nombre, int base, int altura){
    super(nombre);
    this.base = base;
    this.altura = altura;

    }

public double calcularArea(){
    return (base * altura) / 2;
}
}