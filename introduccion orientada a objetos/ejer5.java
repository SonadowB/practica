// Clase Estudiante

class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 6.0;
    }

    public void mostrarResultados() {
        double promedio = calcularPromedio();
        System.out.println("Estudiante: " + nombre + ", Promedio: " + promedio + ", Aprobado: " + aprobo());
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Pedro", 7, 6);
        Estudiante e2 = new Estudiante("Lucia", 5, 6);
        Estudiante e3 = new Estudiante("Marco", 8, 9);

        e1.mostrarResultados();
        e2.mostrarResultados();
        e3.mostrarResultados();
    }
}
