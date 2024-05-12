package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class CentroImpresion {

    private final String nombre;
    private final ArrayList<Publicacion> publicaciones;
    private impresora impresoraConectada;





    public CentroImpresion(String nombre, ArrayList<Publicacion> publicaciones, impresora impresoraConectada) {
        this.nombre = nombre;
        this.publicaciones = publicaciones;
        this.impresoraConectada = impresoraConectada;

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;

    public impresora getImpresoraConectada() {
        return impresoraConectada;
    }


    public void setImpresoraConectada(impresora impresoraConectada) {
        this.impresoraConectada = impresoraConectada;


  public void conectarImpresora(Impresora impresora){
        setImpresoraConectada(impresora);
        impresora.conectarImpresora();

    }

    public void desconectarImpresora(){
        getImpresoraConectada().desconectarImpresora();
        setImpresoraConectada(null);
    }

    public void imprimirPublicacion(Publicacion publicacion){
        if(getImpresoraConectada() != null && getImpresoraConectada().getEstado() == EstadoImpresora)
        getImpresoraConectada()
    }

}

    

