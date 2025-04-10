// Clase base Empleado
class Empleado {
    protected String nombre;
    protected double sueldoHora;
    protected int horasTrabajo;

    public Empleado(String nombre, double sueldoHora, int horasTrabajo) {
        this.nombre = nombre;
        this.sueldoHora = sueldoHora;
        this.horasTrabajo = horasTrabajo;
    }

    public double calcularSueldoBase() {
        return sueldoHora * horasTrabajo;
    }
    public double sueldoTotal() {
        return calcularSueldoBase();
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo por hora: " + sueldoHora);
        System.out.println("Horas de trabajo: " + horasTrabajo);
    }
}
class Cocinero extends Empleado {
    private int horasExtra;

    public Cocinero(String nombre, double sueldoHora, int horasTrabajo, int horasExtra) {
        super(nombre, sueldoHora, horasTrabajo);
        this.horasExtra = horasExtra;
    }

    public double sueldoTotal() {
        return calcularSueldoBase() + (horasExtra * sueldoHora * 1.5);
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo total: " + sueldoTotal());
        System.out.println("Puesto: Cocinero");
    }
}

class Mesero extends Empleado {
    private double propina;

    public Mesero(String nombre, double sueldoHora, int horasTrabajo, double propina) {
        super(nombre, sueldoHora, horasTrabajo);
        this.propina = propina;
    }
    public double sueldoTotal() {
        return calcularSueldoBase() + propina;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Propina: " + propina);
        System.out.println("Sueldo total: " + sueldoTotal());
        System.out.println("Puesto: Mesero");
    }
}

class Administrativo extends Empleado {
    private int horasExtra;

    public Administrativo(String nombre, double sueldoHora, int horasTrabajo, int horasExtra) {
        super(nombre, sueldoHora, horasTrabajo);
        this.horasExtra = horasExtra;
    }

    public double sueldoTotal() {
        return calcularSueldoBase() + (horasExtra * sueldoHora * 1.2);
    }
    public void mostrar() {
        super.mostrar();
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo total: " + sueldoTotal());
        System.out.println("Puesto: Administrativo");
    }
}

public class Restaurante {
    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero("Juan Pérez", 15.50, 40, 8);
        Mesero mesero1 = new Mesero("Carlos Gómez", 10.00, 35, 120.50);
        Mesero mesero2 = new Mesero("Ana López", 10.00, 30, 150.75);
        Administrativo admin1 = new Administrativo("María Rodríguez", 12.00, 40, 5);
        Administrativo admin2 = new Administrativo("Pedro Sánchez", 12.00, 38, 3);

        System.out.println("=== Personal del Restaurante ===");
        cocinero.mostrar();
        System.out.println("---------------------");
        mesero1.mostrar();
        System.out.println("---------------------");
        mesero2.mostrar();
        System.out.println("---------------------");
        admin1.mostrar();
        System.out.println("---------------------");
        admin2.mostrar();

        System.out.println("\n=== Demostración de Polimorfismo ===");
        Empleado[] empleados = new Empleado[5];
        empleados[0] = cocinero;
        empleados[1] = mesero1;
        empleados[2] = mesero2;
        empleados[3] = admin1;
        empleados[4] = admin2;

        for (Empleado emp : empleados) {
            System.out.println("Nombre: " + emp.nombre + " - Sueldo Total: " + emp.sueldoTotal());
        }
        System.out.println("\n=== Empleados con sueldo total igual a 500 ===");
        buscarPorSueldo(empleados, 500.0);
    }
    public static void buscarPorSueldo(Empleado[] empleados, double sueldo) {
        for (Empleado emp : empleados) {
            if (Math.abs(emp.sueldoTotal() - sueldo) < 0.01) { // Comparación con margen de error para doubles
                emp.mostrar();
                System.out.println("---------------------");
            }
        }
    }
}
