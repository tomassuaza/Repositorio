package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Veterinaria {
    private  final Collection<Mascota1> mascotas;
    private final String nombre;
    
  
    public Veterinaria (String nombre){
        assert nombre != null && !nombre.isBlank();
        this.nombre = nombre;
        this.mascotas = new LinkedList <Mascota1>();
    }

    public String getNombre() {
        return nombre;
    }



    public void agregarMascota(Mascota1 mascota) {
        assert !verificarNumeroId(mascota.numeroId()) : "Ya existe una mascota con ese ID " + mascota.numeroId();
        mascotas.add(mascota);
    }
    

    private boolean verificarNumeroId(String numeroId) {
        boolean exiteMascota = false;
        for (Mascota1 mascota : mascotas){
            if (mascota.numeroId().equals(numeroId)){
                exiteMascota = true;
            } 
        }
        return exiteMascota;
    }

       

    public List<Mascota1> obtenerMascotas(){
        return (List<Mascota1>) mascotas;
    }
    

    public List<Mascota1> obtenerMascotasMayoresDe10Años(){
        List<Mascota1> mascotasMayores = new ArrayList<> ();
           for (Mascota1 mascota : mascotas) {
            if(mascota.edad() > 10){
                mascotasMayores.add(mascota);
            }
        }

           
           return mascotasMayores ;
           


    }
}
