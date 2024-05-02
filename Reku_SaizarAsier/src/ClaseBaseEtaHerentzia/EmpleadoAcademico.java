package ClaseBaseEtaHerentzia;
//Klase abstraktu honek salarioa gehitzen dio langile direnak sortzeko
public abstract class EmpleadoAcademico extends Persona {
    private double salario;

    public EmpleadoAcademico(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    // Getters y Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
