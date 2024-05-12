package co.edu.uniquindio.poo;

public abstract class Impresora extends EquipoElectronico implements Imprimible{
    private String modelo;
    private EstadoImpresora estadoImpresora;


    public Impresora(String modelo, EstadoImpresora estadoImpresora) {
        this.modelo = modelo;
        this.estadoImpresora = estadoImpresora;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public EstadoImpresora getEstadoImpresora() {
        return estadoImpresora;
    }


    public void setEstadoImpresora(EstadoImpresora estadoImpresora) {
        this.estadoImpresora = estadoImpresora;
    }

    

    
}
