package ClaseEspezifikoak;


import java.util.ArrayList;
import java.util.List;

import ClaseBaseEtaHerentzia.Persona;

//Ikasleak sortzeko konstruktorea
public class Estudiante extends Persona {
    private String id;
    private List<String> cursosMatriculados;

    public Estudiante(String nombre, int edad, String id) {
        super(nombre, edad);
        this.id = id;
        this.cursosMatriculados = new ArrayList<>();
    }

    // Métodos
    public void matricularEnCurso(String codigoCurso) {
        cursosMatriculados.add(codigoCurso);
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getCursosMatriculados() {
        return cursosMatriculados;
    }
}
