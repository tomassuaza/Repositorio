package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class OficinaPublicaciones {

    private final String nombre;
    private EquipoElectronico[] listaEquiposElectronicos;
    private CentroImpresion CentroImpresion;
    private ArrayList<Publicacion> solicitudes;


    public OficinaPublicaciones(String nombre, EquipoElectronico[] listaEquiposElectronicos,
            co.edu.uniquindio.poo.CentroImpresion centroImpresion, ArrayList<Publicacion> solicitudes) {
        this.nombre = nombre;
        this.listaEquiposElectronicos = new EquipoElectronico [5];
        this.CentroImpresion = new centroImpresion("Centro de impresion");
        this.solicitudes = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }


    public EquipoElectronico[] getListaEquiposElectronicos() {
        return listaEquiposElectronicos;
    }


    public void setListaEquiposElectronicos(EquipoElectronico[] listaEquiposElectronicos) {
        this.listaEquiposElectronicos = listaEquiposElectronicos;
    }


    public CentroImpresion getCentroImpresion() {
        return CentroImpresion;
    }


    public void setCentroImpresion(CentroImpresion centroImpresion) {
        CentroImpresion = centroImpresion;
    }


    public ArrayList<Publicacion> getSolicitudes() {
        return solicitudes;
    }


    public void setSolicitudes(ArrayList<Publicacion> solicitudes) {
        this.solicitudes = solicitudes;
    }


    @Override
    public String toString() {
        return "OficinaPublicaciones [nombre=" + nombre + ", listaEquiposElectronicos="
                + Arrays.toString(listaEquiposElectronicos) + ", CentroImpresion=" + CentroImpresion + ", solicitudes="
                + solicitudes + "]";
    }
    
    public void imprimirPublicacion(Publicacion publicacion){
        
    }
    
}
