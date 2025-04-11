// Clase base abstracta Ambiente
abstract class Ambiente {
    protected String nombre;
    
    public Ambiente(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void mostrar();
    public abstract int cantidadMuebles();
}

class Oficina extends Ambiente {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;
    
    public Oficina(String nombre, int sillas, int escritorios, int estanterias) {
        super(nombre);
        this.nroSillas = sillas;
        this.nroEscritorios = escritorios;
        this.nroEstanterias = estanterias;
    }
    
    public void mostrar() {
        System.out.println("Oficina: " + nombre);
        System.out.println("Sillas: " + nroSillas);
        System.out.println("Escritorios: " + nroEscritorios);
        System.out.println("Estanterías: " + nroEstanterias);
    }
    
    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
}
class Aula extends Ambiente {
    private int capacidad;
    private int nroPupitres;
    
    public Aula(String nombre, int capacidad, int pupitres) {
        super(nombre);
        this.capacidad = capacidad;
        this.nroPupitres = pupitres;
    }
    
    public void mostrar() {
        System.out.println("\nAula: " + nombre);
        System.out.println("Capacidad: " + capacidad + " estudiantes");
        System.out.println("Pupitres: " + nroPupitres);
    }
    
    public int cantidadMuebles() {
        return nroPupitres;
    }
}

class Laboratorio extends Ambiente {
    private int capacidad;
    private int nroMesas;
    private int nroSillas;
    
    public Laboratorio(String nombre, int capacidad, int mesas, int sillas) {
        super(nombre);
        this.capacidad = capacidad;
        this.nroMesas = mesas;
        this.nroSillas = sillas;
    }
    
    public void mostrar() {
        System.out.println("\nLaboratorio: " + nombre);
        System.out.println("Capacidad: " + capacidad + " estudiantes");
        System.out.println("Mesas: " + nroMesas);
        System.out.println("Sillas: " + nroSillas);
    }
    
    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }
}

public class Main {
    public static void main(String[] args) {
        Oficina oficina = new Oficina("Dirección", 5, 3, 4);
        Aula aula1 = new Aula("Aula 101", 30, 25);
        Aula aula2 = new Aula("Aula 102", 25, 20);
        Laboratorio laboratorio = new Laboratorio("Lab. Computación", 20, 10, 20);

        System.out.println("=== MOSTRAR DATOS ===");
        oficina.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        laboratorio.mostrar();

        System.out.println("\n=== CANTIDAD DE MUEBLES ===");
        System.out.println("Muebles en Oficina: " + oficina.cantidadMuebles());
        System.out.println("Muebles en Aula 101: " + aula1.cantidadMuebles());
        System.out.println("Muebles en Aula 102: " + aula2.cantidadMuebles());
        System.out.println("Muebles en Laboratorio: " + laboratorio.cantidadMuebles());

        System.out.println("\n=== TOTAL DE MUEBLES (POLIMORFISMO) ===");
        Ambiente[] ambientes = {oficina, aula1, aula2, laboratorio};
        
        int totalMuebles = 0;
        for (Ambiente ambiente : ambientes) {
            totalMuebles += ambiente.cantidadMuebles();
        }
        System.out.println("Total de muebles en todos los ambientes: " + totalMuebles);
    }
}
