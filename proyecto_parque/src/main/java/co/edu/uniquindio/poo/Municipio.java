package co.edu.uniquindio.poo;

public enum Municipio {

    


    
 
    ARMENIA("ARMENIA", 0),
    CALARCA(10000),
    CIRCASIA(18000),
    FILANDIA(22000),
    GENOVA(70000),
    LA_TEBAIDA(15000),
    MONTENEGRO(20000),
    PIJAO(40000),
    QUIMBAYA(30000),
    SALENTO(50000),
    BUENAVISTA(35000),
    CORDOBA(30000);

    private final int sobrecosto;
    private final String nombre;

    Municipio(int sobrecosto) {
        this.sobrecosto = sobrecosto;
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



  



