package Gestioa;

import java.util.ArrayList;
import java.util.List;

import ClaseEspezifikoak.Profesor;

public class Departamento {
	//Departamentuen atributuak
    private String nombre;
    private List<Profesor> profesoresAsociados;

    //Departamentuak sortzeko konstruktorea
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.profesoresAsociados = new ArrayList<>();
    }

    // Métodos
    public void agregarProfesor(Profesor profesor) {
        profesoresAsociados.add(profesor);
    }

    public void eliminarProfesor(Profesor profesor) {
        profesoresAsociados.remove(profesor);
    }

    public void listarProfesores() {
        for (Profesor profesor : profesoresAsociados) {
            System.out.println(profesor.getNombre());
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesoresAsociados() {
        return profesoresAsociados;
    }
}
