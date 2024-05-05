package co.edu.uniquindio.poo;

public class Ahorros extends CuentaBancaria {

    private final double interes;

    public Ahorros(String nombreTirular, String apellidosTitular, String numeroCuenta, double interes) {
        super(nombreTirular, apellidosTitular, numeroCuenta);
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }

    @Override
    public String toString() {
        return "Ahorro [interes=" + interes + "]";
    }

    @Override
    public void retirar(int valor) {
        assert valor > 0;
        if (getSaldo() >= valor) {
            int saldoNuevo = getSaldo() - valor;
            setSaldo(saldoNuevo);
        } else {
        System.out.print("Saldo insuficiente.");
        }
    }

    public static void crearCuentaCorriente(String nombreTitular, String apellidoTitular, String numeroCuenta,
            int interes) {
        Ahorros cuenta_Ahorro = new Ahorros(nombreTitular, apellidoTitular, numeroCuenta, interes);
        Banco.agregarCuenta(cuenta_Ahorro);
    }



}
    

