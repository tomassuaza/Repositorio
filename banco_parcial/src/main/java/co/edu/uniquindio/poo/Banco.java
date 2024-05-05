package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Banco {
     private final String nombre;
    private  Collection<CuentaBancaria> listaCuentaBancarias;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.listaCuentaBancarias = new LinkedList<CuentaBancaria>();
    }

    public String getNombre() {
        return nombre;
    }

    public  Collection<CuentaBancaria> getListaCuentaBancarias() {
        return listaCuentaBancarias;
    }

    public void setListaCuentaBancarias(Collection<CuentaBancaria> listaCuentaBancarias) {
        this.listaCuentaBancarias = listaCuentaBancarias;
    }

    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", listaCuentaBancarias=" + listaCuentaBancarias + "]";
    }

    public  void agregarCuenta(CuentaBancaria cuenta) {
        listaCuentaBancarias.add(cuenta);
    }

    public static void crearBanco(String nombre){
        new Banco(nombre);
        System.out.println("banco creado");
    }





}
    