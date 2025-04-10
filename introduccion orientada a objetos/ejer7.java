// Clase Celular

import java.util.ArrayList;

class Aplicacion {
    private String nombre;
    private int pesoMb;

    public Aplicacion(String nombre, int pesoMb) {
        this.nombre = nombre;
        this.pesoMb = pesoMb;
    }

    public int getPesoMb() {
        return pesoMb;
    }

    public String getNombre() {
        return nombre;
    }
}

class Celular {
    private ArrayList<Aplicacion> apps;
    private final int maxApps = 20;
    private final int maxEspacio = 1024; // en MB
    private int espacioOcupado;
    private double bateria;

    public Celular() {
        apps = new ArrayList<>();
        espacioOcupado = 0;
        bateria = 100.0;
    }

    public void instalarApp(Aplicacion app) {
        if (apps.size() < maxApps && (espacioOcupado + app.getPesoMb()) <= maxEspacio) {
            apps.add(app);
            espacioOcupado += app.getPesoMb();
            System.out.println("Aplicación instalada: " + app.getNombre());
        } else {
            System.out.println("No se puede instalar la aplicación: " + app.getNombre());
        }
    }

    public void usarApp(String nombreApp, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado por batería baja");
            return;
        }

        for (Aplicacion app : apps) {
            if (app.getNombre().equalsIgnoreCase(nombreApp)) {
                int peso = app.getPesoMb();
                double consumo = 0;

                if (peso > 250) {
                    consumo = 0.05 * (minutos / 10);
                } else if (peso > 100) {
                    consumo = 0.02 * (minutos / 10);
                } else {
                    consumo = 0.01 * (minutos / 10);
                }

                bateria -= consumo * 100;
                if (bateria < 0) bateria = 0;

                System.out.println("Usando " + nombreApp + " por " + minutos + " min. Batería restante: " + bateria + "%");
                return;
            }
        }
        System.out.println("Aplicación no encontrada: " + nombreApp);
    }

    public void mostrarBateria() {
        System.out.println("Batería restante: " + bateria + "%");
    }

    public static void main(String[] args) {
        Celular miCelular = new Celular();

        Aplicacion whatsapp = new Aplicacion("WhatsApp", 50);
        Aplicacion juegoPesado = new Aplicacion("Juego3D", 300);
        Aplicacion facebook = new Aplicacion("Facebook", 120);

        miCelular.instalarApp(whatsapp);
        miCelular.instalarApp(juegoPesado);
        miCelular.instalarApp(facebook);

        miCelular.usarApp("WhatsApp", 30);
        miCelular.usarApp("Facebook", 30);
        miCelular.usarApp("Juego3D", 30);
        miCelular.mostrarBateria();
    }
}
