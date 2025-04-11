// Clase base abstracta Animal
abstract class Animal {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();
    public abstract void moverse();
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }
    
    public void moverse() {
        System.out.println(nombre + " esta corriendo");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau miau!");
    }
    
    public void moverse() {
        System.out.println(nombre + " esta saltando");
    }
}
class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " dice: Pio pio!");
    }
    
    public void moverse() {
        System.out.println(nombre + " esta volando");
    }
}

public class MainAnimales {
    public static void main(String[] args) {
        Animal perro = new Perro("Rex");
        Animal gato = new Gato("Misi");
        Animal pajaro = new Pajaro("Piolin");

        System.out.println("=== SONIDOS DE ANIMALES ===");
        Animal[] animales = {perro, gato, pajaro};
        for (Animal animal : animales) {
            animal.hacerSonido();
        }

        System.out.println("\n=== MOVIMIENTOS ===");
        for (Animal animal : animales) {
            animal.moverse();
        }
    }
}
