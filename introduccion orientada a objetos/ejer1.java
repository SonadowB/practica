// Ejercicio 1: Clase Persona
class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 20, "La Paz");
        Persona p2 = new Persona("Ana", 17, "Cochabamba");
        Persona p3 = new Persona("Luis", 25, "Santa Cruz");

        p1.saludar();
        System.out.println("Mayor de edad: " + p1.esMayorDeEdad());

        p2.saludar();
        System.out.println("Mayor de edad: " + p2.esMayorDeEdad());

        p3.saludar();
        System.out.println("Mayor de edad: " + p3.esMayorDeEdad());
    }
}
