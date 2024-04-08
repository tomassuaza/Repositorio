package co.edu.uniquindio.poo;

public class Zonas {


    private final String nombre;
    public final Material materialUtlizado;
    private double metrosCuadradosUtilizados;
    

    public Zonas ( String nombre, Material material, double metrosCuadradosUtilizados){
        this.nombre = nombre;
        this.materialUtlizado = material;
        this.metrosCuadradosUtilizados = metrosCuadradosUtilizados;

    }


    
    
    public Material getMaterial() {
        return materialUtlizado;
    }




    public String getNombre(){
        return nombre;
    }


      public double calcularValorTotal() {
        return materialUtlizado.calcularValorTotal(metrosCuadradosUtilizados);
    }





}
