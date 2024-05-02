package Gestioa;

import ClaseEspezifikoak.Profesor;
import ClaseEspezifikoak.Asistente;
import ClaseEspezifikoak.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class Curso {
	//Kurstoen atributuak
    private String nombre;
    private String codigo;
    private Profesor profesorEncargado;
    private List<Estudiante> estudiantesMatriculados;
    private Asistente asistente;

  //Kurtsoak sortzeko konstruktorea
    public Curso(String nombre, String codigo, Profesor profesorEncargado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesorEncargado = profesorEncargado;
        this.estudiantesMatriculados = new ArrayList<>();
    }

    // Métodos
    public void asignarAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public void matricularEstudiante(Estudiante estudiante) {
        estudiantesMatriculados.add(estudiante);
    }

    public void listarEstudiantes() {
        for (Estudiante estudiante : estudiantesMatriculados) {
            System.out.println(estudiante.getNombre());
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profesor getProfesorEncargado() {
        return profesorEncargado;
    }

    public void setProfesorEncargado(Profesor profesorEncargado) {
        this.profesorEncargado = profesorEncargado;
    }

    public Asistente getAsistente() {
        return asistente;
    }
}
