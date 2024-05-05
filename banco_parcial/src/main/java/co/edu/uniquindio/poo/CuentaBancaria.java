package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public abstract class CuentaBancaria {

    private final String nombreTirular;
    private final String apellidosTitular;
    private final String numeroCuenta;
    public int saldo;
    private boolean estado;
    private Collection<Transaccion> listaTransacciones;
    protected Object getNumeroCuenta;

    public CuentaBancaria(String nombreTirular, String apellidosTitular, String numeroCuenta) {
        this.nombreTirular = nombreTirular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.estado = true;
        this.listaTransacciones = new LinkedList<Transaccion>();
    }

    public String getNombreTirular() {
        return nombreTirular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Collection<Transaccion> getListaTransaccions() {
        return listaTransacciones;
    }

    public void setListaTransaccions(Collection<Transaccion> listaTransaccions) {
        this.listaTransacciones = listaTransaccions;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [nombreTirular=" + nombreTirular + ", apellidosTitular=" + apellidosTitular
                + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", estado=" + estado + ", listaTransaccions="
                + listaTransacciones + "]";
    }

    public abstract void retirar(int valor);

    public void depositar(int valor) {
        assert valor > 0 : "Deposita un valor positivo";
        saldo = saldo + valor;
        estado = true;
    }

    public void agregarTransaccion(Transaccion transaccion) {
    listaTransacciones.add(transaccion);
    }


    public boolean verificarEstado(){
        boolean estado = false;
        if(saldo > 0){
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }


    public double consultarSaldo(){
        assert estado == true;
        return saldo;

    }


    

    
        
}











    

