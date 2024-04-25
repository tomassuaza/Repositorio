package co.edu.uniquindio.poo.figuras;

public class Rectangulo extends FiguraGeometrica {

    public double ancho;
    public double alto;

    public Rectangulo(double ancho, double alto){
        validarMedida(ancho);
        validarMedida(alto);
        this.ancho = ancho;
        this.alto = alto;
    }


    public Double calcularArea(){
        return ancho * alto;



    }


    public double getAncho() {
        return ancho;
    }


    public double getAlto() {
        return alto;
    }



}
