package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;


public class Parque {

    public final Collection<Zonas> zonas;
    public final String nombre;
    public final Municipio municipio;

    public Parque(String nombre) {
        this.nombre = nombre;
        this.zonas = new LinkedList<>();
        this.municipio = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Zonas> addZona(Zonas newZona) {
        boolean existe = zonas.stream().anyMatch(zona -> zona.getClass().equals(newZona.getClass()));
        if (existe)
            return zonas;
        zonas.add(newZona);
        return zonas;
    }




   
     public double calcularValorTotal() {
        double valorTotalParque = 0.0;
        for (Zonas zona : zonas) {
            valorTotalParque += zona.calcularValorTotal();
        }

        return valorTotalParque;
    }

    public Collection<Zonas> getZonas() {
        return zonas;
        
    }


   

    
    

}
