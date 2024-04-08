package co.edu.uniquindio.poo.figuras;

public class TrianguloR extends FiguraGeometrica {

    public double base;
    public double altura;


public TrianguloR(double base, double altura){
    validarMedida(base);
    validarMedida(altura);
    this.base = base;
    this.altura = altura;

}

public Double calcularArea(){
    return (base * altura)/ 2;
}


}

