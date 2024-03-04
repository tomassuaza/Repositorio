package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private List<Mascota1> mascotas;

    public Veterinaria(Object object){
        mascotas = new ArrayList<>();

    }

    public void agregarMascota(Mascota1 mascota){
        mascotas.add(mascota);
    }

    public List<Mascota1> obtenerMascotas(){
        return mascotas;
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
