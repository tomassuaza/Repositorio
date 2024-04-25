package co.edu.uniquindio.poo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProyectoFigura {

    
        public static List<Figura> ordenarPorArea(List<Figura> figuras) {
            assert ordenarPorArea(figuras) != null;
            Collections.sort(figuras, Comparator.comparing(Figura::calcularArea));
            return figuras;
        }
    }




    