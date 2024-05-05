package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CuentaTest {

     private static final Logger LOG = Logger.getLogger(AppTest.class.getName());


     @Test
     public void testDepositar(){
        LOG.info("inicio test");
        int valorDeposito = 100;
        int saldoInicial = 0;
        CuentaBancaria cuentaBancaria = new Corriente(null, null, null, saldoInicial);

        cuentaBancaria.depositar(valorDeposito);
        int saldoFinal = cuentaBancaria.getSaldo();

        assertEquals(saldoInicial + valorDeposito, saldoFinal);

        LOG.info("fin test");

     }

     @Test
     public void testRetirar(){
        LOG.info("inicio test");
        int saldoInicial = 500;
        int sobregiroInicial = 100;
        int valorRetiro = 300;
        var cuenta = new Corriente(null, null, null, sobregiroInicial);
        cuenta.setSaldo(saldoInicial);


        cuenta.retirar(valorRetiro);
        int saldoFinal = cuenta.getSaldo();
        int sobregiroFinal = cuenta.getSobregiro();

        
        assertEquals(saldoInicial - valorRetiro, saldoFinal);
        assertEquals(sobregiroInicial, sobregiroFinal); // Sobregiro no debe cambiar si hay suficiente saldo

        LOG.info("fin test");
    }

    @Test
    public void crearBanco(){
        LOG.info("inicio test");
        Banco bancolombia = new Banco("Bancolombia");
        assertEquals("Bancolombia", bancolombia.getNombre());
        LOG.info("fin test");

    }

    @Test
    public void datosNull(){
        LOG.info("inicio test");
        assertThrows(IllegalArgumentException.class, () -> new Banco(null));
        assertThrows(IllegalArgumentException.class, () -> new Ahorros(null, null, null, 0));
        LOG.info("fin test");

    }



    @Test
    public void agregarSaldoNegativo() {
        LOG.info("inico test");
        CuentaBancaria cuentaBancaria = new Corriente("juan", "lopez", "109902543", 0);
        Banco.agregarCuenta(cuentaBancaria);
        assertThrows(Throwable.class, () -> cuentaBancaria.depositar(-50000)); 
        LOG.info("fin test");
}




}




