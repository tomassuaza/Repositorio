package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class ImpresoraCartucho extends Impresora {

    public void imprimir(Publicacion publicacion){
        JOptionPane.showMessageDialog(null, "Imprimiendo Publicacion " + publicacion.getTexto() + );
    }


    
}
