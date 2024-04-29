package co.edu.uniquindio.poo;

public class Nota {

    public int numeroNotas;
    public static int valorNota;
    public int promedio;


    public int getNumeroNotas() {
        return numeroNotas;
    }
    public void setNumeroNotas(int numeroNotas) {
        this.numeroNotas = numeroNotas;
    }
    public static int getValornota() {
        return valorNota;
    }
    public int getPromedio() {
        return promedio;
    }
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    
    public static int calcularPromedio(int[] notas){
        int suma = 0;
        for(int nota : notas ){
            suma += nota;
        }
        int promedio = suma / notas.length;
        return promedio;


    }

    public static void main(String[] args) {
    
        int[] notas = {7, 8, 6, 9, 7};
        double promedio = calcularPromedio(notas);
        System.out.println("El promedio es: " + promedio);
    }
}

