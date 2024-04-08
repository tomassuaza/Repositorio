package co.edu.uniquindio.poo;

public enum Material {
    

    ARENA(10000),
    GRAMA_SINTETICA(35000),
    GRAMA_NATURAL(2000),
    ASFALTO(40000);

    private final int metroCuadrado;

    Material(int metroCuadrado) {
        this.metroCuadrado = metroCuadrado;
    }

    public int getMetroCuadrado() {
        return metroCuadrado;
    }
 
}




