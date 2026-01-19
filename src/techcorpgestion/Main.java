/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techcorpgestion;

/**
 *
 * @author Informatica
 */

public class Main {
    private static java.util.ArrayList<Empleado> empleados = new java.util.ArrayList<>();
    private static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        inicializarDatos();
        mostrarMenu();
    }

    // Datos de prueba
    public static void inicializarDatos() {
        empleados.add(new Desarrollador("Ana López", "DEV001", 4500, "Java","Desarrollador"));
        empleados.add(new Gerente("Carlos Ruiz", "MGR001", 7000, "Tecnología","Gerente"));
        empleados.add(new Disenador("Lucía Méndez", "DES001", 4000, "Figma","Diseñador"));
    }

    public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== TECHCORP S.A. - Gestión de Empleados ===");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Buscar empleado por ID");
            System.out.println("3. Agregar nuevo empleado");
            System.out.println("4. Simular trabajo (polimorfismo)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            switch (opcion) {
                case 1:
                    mostrarEmpleados();
                    break;
                case 2:
                    buscarEmpleado();
                    break;
                case 3:
                    agregarEmpleado();
                    break;
                case 4:
                    simularTrabajo();
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static void mostrarEmpleados() {
        System.out.println("\nLista de Empleados:");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado e : empleados) {
                e.mostrarInformacion();
                
                System.out.println("Bono (10%): $ " + e.calcularBono(10));
                System.out.println("Rol: " + e.obtenerDetallesRol());
                System.out.println("---------------------------");
            }
            System.out.println("Total empleado: " + Empleado.getTotalEmpleado());
        }
    }
    public static void buscarEmpleado() {
        System.out.print("Ingrese el ID del empleado: ");
        String id = sc.nextLine();
        boolean encontrado = false;
        for (Empleado e : empleados) {
            if (e.getIdEmpleado().equalsIgnoreCase(id)) {
                System.out.println("Empleado encontrado:");
                e.mostrarInformacion();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un empleado con ID: " + id);
        }
    }

    public static void agregarEmpleado() {
        System.out.println("¿Qué tipo de empleado desea agregar?");
        System.out.println("1. Desarrollador  2. Gerente  3. Diseñador");
        int tipo = sc.nextInt();
        sc.nextLine(); // limpiar

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();
        System.out.print("Cargo: ");
        String cargo = "";

        switch (tipo) {
            case 1:
                System.out.print("Lenguaje principal: ");
                String lenguaje = sc.nextLine();
                empleados.add(new Desarrollador(nombre, id, salario,cargo, lenguaje));
                System.out.println("Desarrollador agregado.");
                break;
            case 2:
                System.out.print("Departamento: ");
                String depto = sc.nextLine();
                empleados.add(new Gerente(nombre, id, salario,cargo, depto));
                System.out.println("Gerente agregado.");
                break;
            case 3:
                System.out.print("Herramienta favorita: ");
                String herramienta = sc.nextLine();
                empleados.add(new Disenador(nombre, id, salario,cargo, herramienta));
                System.out.println("Diseñador agregado.");
                break;
            default:
                System.out.println("Tipo no válido.");
        }
    }
    
    public static void simularTrabajo() {
        System.out.println("\nSimulando trabajo de empleados...");
        for (Empleado e : empleados) {
            e.trabajar(); // Aquí se aplica el polimorfismo
        }
    }
}
