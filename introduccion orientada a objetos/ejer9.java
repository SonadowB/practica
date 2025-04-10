// Clase Computadora

class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false;
    }

    public void encender() {
        encendida = true;
        System.out.println("La computadora está encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("La computadora está apagada.");
    }

    public void mostrarEstado() {
        String estado = encendida ? "Encendida" : "Apagada";
        System.out.println("Computadora " + marca + " " + modelo + " - Estado: " + estado);
    }

    public static void main(String[] args) {
        Computadora pc = new Computadora("HP", "Pavilion 15");
        pc.mostrarEstado();
        pc.encender();
        pc.mostrarEstado();
        pc.apagar();
        pc.mostrarEstado();
    }
}
