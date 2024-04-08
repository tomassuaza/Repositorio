package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Curso {
    private final String nombre;
    private final Collection<Estudiante> listaEstudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listaEstudiantes = new LinkedList<Estudiante>();

    }

    public String getNombre() {
        return nombre;

    }

    public Collection<Estudiante> getLisEstudiantes() {
        return Collections.unmodifiableCollection(listaEstudiantes);

    }

    public void registrarEstudiante(Estudiante estudiante) {
        assert verificarNumeroIdentificacion(estudiante.numeroIdentificacion()) == false
                : "Ya existe un estududiante con ese ID";
        listaEstudiantes.add(estudiante);
    }

    private boolean verificarNumeroIdentificacion(String numeroIdentificacion) {
        boolean existeEstudiante = false;

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.numeroIdentificacion().equals(numeroIdentificacion)) {
                existeEstudiante = true;
            }
        }

        return existeEstudiante;
    }
}
