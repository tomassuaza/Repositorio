package co.edu.uniquindio.poo;



public abstract class Figura {
    
    public String nombre;

    public Figura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;

    }

    public abstract double calcularArea();



    /*public List<Figura> ordenarPorArea(List<Figura> figuras) {
        Collections.sort(figuras, new Comparator<Figura>() {
            @Override
            public int compare(Figura figura1, Figura figura2) {
                return Double.compare(figura1.calcularArea(), figura2.calcularArea());
            }
        });
        var comparador= Collections.sort(figuras, Comparator.comparing(Figura::calcularArea));
        return figuras.stream().sorted(comparador).toList();
        
    }
    */

    

    
}
