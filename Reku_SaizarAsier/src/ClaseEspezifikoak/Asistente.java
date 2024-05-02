package ClaseEspezifikoak;

import ClaseBaseEtaHerentzia.EmpleadoAcademico;
//Asistenteak sortzeko konstruktorea
public class Asistente extends EmpleadoAcademico {
    private String cursoMatriculado;

    public Asistente(String nombre, int edad, double salario, String cursoMatriculado) {
        super(nombre, edad, salario);
        this.cursoMatriculado = cursoMatriculado;
    }

    // Getters y Setters
    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }
}
