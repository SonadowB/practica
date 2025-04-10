public class Videojuego {
    String nombre;
    String genero;
    int jugadores;

    public Videojuego() {
        this.nombre = "Sin nombre";
        this.genero = "Desconocido";
        this.jugadores = 0;
    }

    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.genero = "Desconocido";
        this.jugadores = 0;
    }

    public Videojuego(String nombre, String genero, int jugadores) {
        this.nombre = nombre;
        this.genero = genero;
        this.jugadores = jugadores;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Género: " + genero + ", Jugadores: " + jugadores);
    }

    public void agregarJugadores() {
        this.jugadores += 1;
    }

    public void agregarJugadores(int cantidad) {
        this.jugadores += cantidad;
    }
}
