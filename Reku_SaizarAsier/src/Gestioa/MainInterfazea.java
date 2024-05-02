package Gestioa;
import java.util.Scanner;  // Erabiltzailearen sarrerak irakurtzeko
import ClaseEspezifikoak.Profesor;  // Ziurtatu klase hauek egokiak direla zure paketean
import ClaseEspezifikoak.Asistente;
import ClaseEspezifikoak.Estudiante;
import java.util.HashMap;  // Datuak memorian gordetzeko
import java.util.Map;      // Map mota erabiltzeko

public class MainInterfazea {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Profesor> profesores = new HashMap<>();
    private static Map<String, Asistente> asistentes = new HashMap<>();
    private static Map<String, Estudiante> estudiantes = new HashMap<>();
    private static Map<String, Curso> cursos = new HashMap<>();
    private static Map<String, Departamento> departamentos = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de gestión de la universidad.");
        String opcion;
        //Hasieran aukera guztiak ematen ditut eta aukera bakoitzean horrelako beste bat jarri det 
        do {
            System.out.println("\nMenú Principal");
            System.out.println("1. Gestionar Profesores");
            System.out.println("2. Gestionar Asistentes");
            System.out.println("3. Gestionar Estudiantes");
            System.out.println("4. Gestionar Cursos");
            System.out.println("5. Gestionar Departamentos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    gestionarProfesores();
                    break;
                case "2":
                    gestionarAsistentes();
                    break;
                case "3":
                    gestionarEstudiantes();
                    break;
                case "4":
                    gestionarCursos();
                    break;
                case "5":
                    gestionarDepartamentos();
                    break;
                case "0":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (!opcion.equals("0"));
        scanner.close();
    }

    private static void gestionarProfesores() {
    	//Irakasleak gestionatzeko aukerak
        String opcion;
        do {
            System.out.println("\nGestión de Profesores");
            System.out.println("1. Agregar Profesor");
            System.out.println("2. Modificar Profesor");
            System.out.println("3. Eliminar Profesor");
            System.out.println("4. Listar Profesores");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarProfesor();
                    break;
                case "2":
                    modificarProfesor();
                    break;
                case "3":
                    eliminarProfesor();
                    break;
                case "4":
                    listarProfesores();
                    break;
                case "0":
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (!opcion.equals("0"));
    }

    private static void agregarProfesor() {
    	//Irakasle bat sortzen du sartutako datukin
        System.out.print("Ingrese nombre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad del profesor: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese salario del profesor: ");
        double salario = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese departamento del profesor: ");
        String departamento = scanner.nextLine();

        Profesor profesor = new Profesor(nombre, edad, salario, departamento);
        profesores.put(nombre, profesor);
        System.out.println("Profesor agregado exitosamente.");
    }

    private static void modificarProfesor() {
    	//Irakasle bat editatzen du sartutako datukin
        System.out.print("Ingrese nombre del profesor a modificar: ");
        String nombre = scanner.nextLine();
        if (profesores.containsKey(nombre)) {
            System.out.print("Ingrese nueva edad del profesor: ");
            int nuevaEdad = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese nuevo salario del profesor: ");
            double nuevoSalario = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese nuevo departamento del profesor: ");
            String nuevoDepartamento = scanner.nextLine();

            Profesor profesor = profesores.get(nombre);
            profesor.setEdad(nuevaEdad);
            profesor.setSalario(nuevoSalario);
            profesor.setDepartamento(nuevoDepartamento);
            System.out.println("Profesor modificado exitosamente.");
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }

    private static void eliminarProfesor() {
    	//Irakasle bat borratzen du sartutako datukin
        System.out.print("Ingrese nombre del profesor a eliminar: ");
        String nombre = scanner.nextLine();
        if (profesores.remove(nombre) != null) {
            System.out.println("Profesor eliminado exitosamente.");
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }

    private static void listarProfesores() {
    	//Irakasle lista erakusten du
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            System.out.println("\nLista de Profesores:");
            for (Profesor profesor : profesores.values()) {
                System.out.println("Nombre: " + profesor.getNombre() + ", Edad: " + profesor.getEdad() + ", Salario: " + profesor.getSalario() + ", Departamento: " + profesor.getDepartamento());
            }
        }
    }

    private static void gestionarAsistentes() {
    	//Asistenteak gestionatzeko aukerak
        String opcion;
        do {
            System.out.println("\nGestión de Asistentes");
            System.out.println("1. Agregar Asistente");
            System.out.println("2. Modificar Asistente");
            System.out.println("3. Eliminar Asistente");
            System.out.println("4. Listar Asistentes");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarAsistente();
                    break;
                case "2":
                    modificarAsistente();
                    break;
                case "3":
                    eliminarAsistente();
                    break;
                case "4":
                    listarAsistentes();
                    break;
                case "0":
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (!opcion.equals("0"));
    }

    private static void agregarAsistente() {
    	//Asistentea gehitzen du sartutako datukin
        System.out.print("Ingrese nombre del asistente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad del asistente: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese salario del asistente: ");
        double salario = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese el curso en el que está matriculado el asistente: ");
        String cursoMatriculado = scanner.nextLine();

        Asistente asistente = new Asistente(nombre, edad, salario, cursoMatriculado);
        asistentes.put(nombre, asistente);
        System.out.println("Asistente agregado exitosamente.");
    }

    private static void modificarAsistente() {
    	//Asistentea editatzen du sartutako datukin
        System.out.print("Ingrese nombre del asistente a modificar: ");
        String nombre = scanner.nextLine();
        if (asistentes.containsKey(nombre)) {
            System.out.print("Ingrese nueva edad del asistente: ");
            int nuevaEdad = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese nuevo salario del asistente: ");
            double nuevoSalario = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese nuevo curso matriculado del asistente: ");
            String nuevoCurso = scanner.nextLine();

            Asistente asistente = asistentes.get(nombre);
            asistente.setEdad(nuevaEdad);
            asistente.setSalario(nuevoSalario);
            asistente.setCursoMatriculado(nuevoCurso);
            System.out.println("Asistente modificado exitosamente.");
        } else {
            System.out.println("Asistente no encontrado.");
        }
    }

    private static void eliminarAsistente() {
    	//Asistentea borratzen du sartutako datukin
        System.out.print("Ingrese nombre del asistente a eliminar: ");
        String nombre = scanner.nextLine();
        if (asistentes.remove(nombre) != null) {
            System.out.println("Asistente eliminado exitosamente.");
        } else {
            System.out.println("Asistente no encontrado.");
        }
    }

    private static void listarAsistentes() {
    	//Asistenteen lista erakusten du
        if (asistentes.isEmpty()) {
            System.out.println("No hay asistentes registrados.");
        } else {
            System.out.println("\nLista de Asistentes:");
            for (Asistente asistente : asistentes.values()) {
                System.out.println("Nombre: " + asistente.getNombre() + ", Edad: " + asistente.getEdad() + ", Salario: " + asistente.getSalario() + ", Curso Matriculado: " + asistente.getCursoMatriculado());
            }
        }
    }

    private static void gestionarEstudiantes() {
    	//Ikasleak gestionatzeko aukerak
        String opcion;
        do {
            System.out.println("\nGestión de Estudiantes");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Modificar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Listar Estudiantes");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarEstudiante();
                    break;
                case "2":
                    modificarEstudiante();
                    break;
                case "3":
                    eliminarEstudiante();
                    break;
                case "4":
                    listarEstudiantes();
                    break;
                case "0":
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (!opcion.equals("0"));
    }

    private static void agregarEstudiante() {
    	//Ikasleak gehitzen du sartutako datukin
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad del estudiante: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese ID único del estudiante: ");
        String id = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, id);
        estudiantes.put(id, estudiante);
        System.out.println("Estudiante agregado exitosamente.");
    }

    private static void modificarEstudiante() {
    	//Ikasleak editatzeko du sartutako datukin
        System.out.print("Ingrese ID del estudiante a modificar: ");
        String id = scanner.nextLine();
        if (estudiantes.containsKey(id)) {
            System.out.print("Ingrese nuevo nombre del estudiante: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese nueva edad del estudiante: ");
            int nuevaEdad = Integer.parseInt(scanner.nextLine());

            Estudiante estudiante = estudiantes.get(id);
            estudiante.setNombre(nuevoNombre);
            estudiante.setEdad(nuevaEdad);
            System.out.println("Estudiante modificado exitosamente.");
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static void eliminarEstudiante() {
    	//Ikasleak borratzen du sartutako datukin
        System.out.print("Ingrese ID del estudiante a eliminar: ");
        String id = scanner.nextLine();
        if (estudiantes.remove(id) != null) {
            System.out.println("Estudiante eliminado exitosamente.");
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static void listarEstudiantes() {
    	//Ikasleen lista erakusten du
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\nLista de Estudiantes:");
            for (Estudiante estudiante : estudiantes.values()) {
                System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad() + ", ID: " + estudiante.getId());
            }
        }
    }

    private static void gestionarCursos() {
    	//Kursoak gestionatzeko aukerak
        String opcion;
        do {
            System.out.println("\nGestión de Cursos");
            System.out.println("1. Agregar Curso");
            System.out.println("2. Modificar Curso");
            System.out.println("3. Eliminar Curso");
            System.out.println("4. Listar Cursos");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarCurso();
                    break;
                case "2":
                    modificarCurso();
                    break;
                case "3":
                    eliminarCurso();
                    break;
                case "4":
                    listarCursos();
                    break;
                case "0":
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (!opcion.equals("0"));
    }

    private static void agregarCurso() {
    	//Kurtsoa gehitzen du sartutako datukin
        System.out.print("Ingrese nombre del curso: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese código del curso: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese nombre del profesor encargado: ");
        String nombreProfesor = scanner.nextLine();

        Profesor profesor = profesores.get(nombreProfesor);
        if (profesor == null) {
            System.out.println("Profesor no encontrado.");
            return;
        }

        Curso curso = new Curso(nombre, codigo, profesor);
        cursos.put(codigo, curso);
        System.out.println("Curso agregado exitosamente.");
    }

    private static void modificarCurso() {
    	//Kurtsoa editatzen du sartutako datukin
        System.out.print("Ingrese código del curso a modificar: ");
        String codigo = scanner.nextLine();
        if (cursos.containsKey(codigo)) {
            System.out.print("Ingrese nuevo nombre del curso: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese nuevo nombre del profesor encargado: ");
            String nuevoNombreProfesor = scanner.nextLine();

            Profesor profesor = profesores.get(nuevoNombreProfesor);
            if (profesor == null) {
                System.out.println("Profesor no encontrado.");
                return;
            }

            Curso curso = cursos.get(codigo);
            curso.setNombre(nuevoNombre);
            curso.setProfesorEncargado(profesor);
            System.out.println("Curso modificado exitosamente.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    private static void eliminarCurso() {
    	//Kurtsoa kentzen du sartutako datukin
        System.out.print("Ingrese código del curso a eliminar: ");
        String codigo = scanner.nextLine();
        if (cursos.remove(codigo) != null) {
            System.out.println("Curso eliminado exitosamente.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    private static void listarCursos() {
    	//Kurtsoen lista erakusten du
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        } else {
            System.out.println("\nLista de Cursos:");
            for (Curso curso : cursos.values()) {
                System.out.println("Nombre: " + curso.getNombre() + ", Código: " + curso.getCodigo() + ", Profesor Encargado: " + curso.getProfesorEncargado().getNombre());
            }
        }
    }

    private static void gestionarDepartamentos() {
    	//Departamentuak gestionatzeko aukerak
        String opcion;
        do {
            System.out.println("\nGestión de Departamentos");
            System.out.println("1. Agregar Departamento");
            System.out.println("2. Modificar Departamento");
            System.out.println("3. Eliminar Departamento");
            System.out.println("4. Listar Departamentos");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarDepartamento();
                    break;
                case "2":
                    modificarDepartamento();
                    break;
                case "3":
                    eliminarDepartamento();
                    break;
                case "4":
                    listarDepartamentos();
                    break;
                case "0":
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (!opcion.equals("0"));
    }

    private static void agregarDepartamento() {
    	//Departamentuak gehitzen du sartutako datukin
        System.out.print("Ingrese nombre del departamento: ");
        String nombre = scanner.nextLine();

        Departamento departamento = new Departamento(nombre);
        departamentos.put(nombre, departamento);
        System.out.println("Departamento agregado exitosamente.");
    }

    private static void modificarDepartamento() {
    	//Departamentuak editatzen du sartutako datukin
        System.out.print("Ingrese nombre del departamento a modificar: ");
        String nombre = scanner.nextLine();
        if (departamentos.containsKey(nombre)) {
            System.out.print("Ingrese nuevo nombre del departamento: ");
            String nuevoNombre = scanner.nextLine();

            Departamento departamento = departamentos.get(nombre);
            departamento.setNombre(nuevoNombre);
            departamentos.put(nuevoNombre, departamento);
            departamentos.remove(nombre);  // Remove the old entry if the name changes
            System.out.println("Departamento modificado exitosamente.");
        } else {
            System.out.println("Departamento no encontrado.");
        }
    }

    private static void eliminarDepartamento() {
    	//Departamentuak kentzen du sartutako datukin
        System.out.print("Ingrese nombre del departamento a eliminar: ");
        String nombre = scanner.nextLine();
        if (departamentos.remove(nombre) != null) {
            System.out.println("Departamento eliminado exitosamente.");
        } else {
            System.out.println("Departamento no encontrado.");
        }
    }

    private static void listarDepartamentos() {
    	//Departamentuen lista erakusten du
        if (departamentos.isEmpty()) {
            System.out.println("No hay departamentos registrados.");
        } else {
            System.out.println("\nLista de Departamentos:");
            for (Departamento departamento : departamentos.values()) {
                System.out.println("Nombre: " + departamento.getNombre());
            }
        }
    }

}
