package co.edu.uniquindio.poo.figuras;

abstract class  FiguraGeometrica {

    public abstract Double calcularArea();

    public void validarMedida(Double medida){
        assert medida >= 0;
    }
}