package ClaseEspezifikoak;

import ClaseBaseEtaHerentzia.EmpleadoAcademico;

public class Profesor extends EmpleadoAcademico {
    private String departamento;

  //Irakasleak sortzeko konstruktorea
    public Profesor(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    // Getters y Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
