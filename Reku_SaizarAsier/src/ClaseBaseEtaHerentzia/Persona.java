package ClaseBaseEtaHerentzia;
//Klase abstrakto bat sortu det pertsona izenekoa izena eta edadea erabiltzen dituzten guztiak sortzeko
//eta base bezela erakiltzen dut klase hau
public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
