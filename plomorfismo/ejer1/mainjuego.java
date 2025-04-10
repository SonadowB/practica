public class mainjuego {
    public static void main(String[] args) {
        Videojuego v1 = new Videojuego("FIFA 25", "Deportes", 1);
        Videojuego v2 = new Videojuego("Zelda");

        v1.mostrar();
        v2.mostrar();

        v1.agregarJugadores();     
        v2.agregarJugadores(3);      

        System.out.println("\nDespués de agregar jugadores:");
        v1.mostrar();
        v2.mostrar();
    }
}
