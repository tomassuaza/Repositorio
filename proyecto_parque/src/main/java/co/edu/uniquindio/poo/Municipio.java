package co.edu.uniquindio.poo;

public enum Municipio {

    


    
    ARMENIA("ARMENIA", 0),
    CALARCA("CALARCA", 10000),
    CIRCASIA("CIRCASIA", 18000),
    FILANDIA("FILANDIA", 22000),
    GENOVA("GENOVA", 70000),
    LA_TEBAIDA("LA TEBAIDA", 15000),
    MONTENEGRO("MONTENEGRO", 20000),
    PIJAO("PIJAO", 40000),
    QUIMBAYA("QUIMBAYA", 30000),
    SALENTO("SALENTO", 50000),
    BUENAVISTA("BUENAVISTA", 35000),
    CORDOBA("CORDOBA", 30000);


    private final int sobrecosto;
    private final String nombre;

    Municipio(String nombre, int sobrecosto) {
        this.sobrecosto = sobrecosto;
        this.nombre = nombre;
    }

    public int getSobrecosto() {
        return sobrecosto;
    }
    public String getNombre(){
        return nombre;
    }
    
    
}

// Ejemplo de uso


/* public class Main {
    public static void main(String[] args) {
        Municipio municipio = Municipio.ARMENIA;
        System.out.println("El sobrecosto de Armenia es: $" + municipio.getSobrecosto());
    } 
}

*/

