package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Proyecto {

    public final Collection<Parque> parques;

    public Collection<Parque> getParques() {
        return parques;
    }

    private final String nombre;

    public Proyecto(String nombre) {
        assert nombre != null && !nombre.isBlank();
        this.nombre = nombre;
        this.parques = new LinkedList<Parque>();

    }

    public String getNombre() {
        return nombre;
    }

    public void agregarParque(Parque parque) {
        parques.add(parque);
    }

    public Parque obtenerParquePorNombre(String nombreParque) {

        return parques.stream().filter(parque -> parque.getNombre().equals(nombreParque)).findFirst().orElse(null);

    }

    public List<Parque> getParques(String nombreMunicipio) {

        return parques.stream().filter(parque -> parque.municipio.getNombre().equals(nombreMunicipio.toUpperCase()))
                .toList();

    }

    public List<Parque> listarParquesOrdenadosPorValorTotal() {

        return parques.stream().sorted(
                (parque1, parque2) -> Double.compare(parque1.calcularValorTotal(), parque2.calcularValorTotal()))
                .toList();
    }

    public double calcularValorTotalProyecto() {
        double valorTotalProyecto = 0.0;

        for (Parque parque : parques) {
            valorTotalProyecto += parque.calcularValorTotal();
        }
        return valorTotalProyecto;

    }

}
