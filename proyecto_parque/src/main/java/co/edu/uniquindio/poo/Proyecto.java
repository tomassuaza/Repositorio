package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Proyecto {

    public final Collection<Parque>parques;
    public Collection<Parque> getParques() {
        return parques;
    }

    private final String nombre;


    public Proyecto(String nombre){
        assert nombre != null && !nombre.isBlank();
        this.nombre = nombre;
        this.parques = new LinkedList<Parque>();


    }

    public String getNombre(){
        return nombre;
    }

    public void agregarParque(Parque parque) {
        parques.add(parque);
    }


    public Parque obtenerParquePorNombre(String nombreParque){
        for(Parque parque : parques){
            if (parque.getNombre().equals(nombreParque)){
                return parque;

            }
        }
        return null;

    }

  public List<Parque> getParques(String nombreMunicipio) {
        return parques.stream().filter( parque -> parque.municipio.getNombre().equals(nombreMunicipio.toUpperCase())).toList();

    }   


    public List<Parque> listarParquesOrdenadosPorValorTotal() {
        List<Parque> parquesOrdenados = new LinkedList<>(parques);

        
        Collections.sort(parquesOrdenados, new Comparator<Parque>() {
            @Override
            public int compare(Parque parque1, Parque parque2) {
                return Double.compare(parque1.calcularValorTotal(), parque2.calcularValorTotal());
            }
        });

        return parquesOrdenados;
    }

    public double calcularValorTotal() {
        double valorTotalProyecto = 0.0;
        
        for (Parque parque : parques) {
            for (Zonas zona : parque.getZonas()) {
                valorTotalProyecto += zona.calcularValorTotal();
            }
        }
        return valorTotalProyecto;


    
    }

}
