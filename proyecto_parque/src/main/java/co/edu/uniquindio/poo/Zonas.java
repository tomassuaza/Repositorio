package co.edu.uniquindio.poo;
import co.edu.uniquindio.poo.figuras.FiguraGeometrica;

public abstract class Zonas {


    private final String nombre;
    public final Material materialUtlizado;
    public final FiguraGeometrica figuraGeometrica;

    public Zonas ( String nombre, Material material, FiguraGeometrica figuraGeometrica){
        this.nombre = nombre;
        this.materialUtlizado = material;
        this.figuraGeometrica = figuraGeometrica;

    }


    public Material getMaterial() {
        return materialUtlizado;
    }




    public String getNombre(){
        return nombre;
    }


      public double calcularValorTotal() {
        return materialUtlizado.getMetroCuadrado() * figuraGeometrica.calcularArea() ;
    }





}
