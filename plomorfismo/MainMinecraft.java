// Clase base abstracta Bloque
abstract class Bloque {
    protected String tipo;
    
    public Bloque(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract void accion();
    public abstract void romper();
    
    public void colocar() {
        System.out.println(tipo + " colocado en el suelo");
    }
}

class BloqueCofre extends Bloque {
    public BloqueCofre() {
        super("Cofre");
    }
    
    @Override
    public void accion() {
        System.out.println("Abriendo cofre (aparecen items)");
    }
    
    @Override
    public void romper() {
        System.out.println("Rompiendo cofre (suelta items)");
    }
}

class BloqueTnt extends Bloque {
    public BloqueTnt() {
        super("TNT");
    }
    
    @Override
    public void accion() {
        System.out.println("Activando TNT (¡Cuidado, explotará!)");
    }
    
    @Override
    public void romper() {
        System.out.println("Rompiendo TNT (¡Puede explotar!)");
    }
}

// Clase BloqueHorno
class BloqueHorno extends Bloque {
    public BloqueHorno() {
        super("Horno");
    }
    
    @Override
    public void accion() {
        System.out.println("Encendiendo horno (puedes cocinar)");
    }
    
    @Override
    public void romper() {
        System.out.println("Rompiendo horno (suelta carbón)");
    }
}

public class MainMinecraft {
    public static void main(String[] args) {
        Bloque cofre1 = new BloqueCofre();
        Bloque cofre2 = new BloqueCofre();
        
        Bloque tnt1 = new BloqueTnt();
        Bloque tnt2 = new BloqueTnt();
        
        Bloque horno1 = new BloqueHorno();
        Bloque horno2 = new BloqueHorno();

        System.out.println("=== ACCIONES DE BLOQUES ===");
        Bloque[] bloques = {cofre1, cofre2, tnt1, tnt2, horno1, horno2};
        for (Bloque bloque : bloques) {
            bloque.accion();
        }
        System.out.println("\n=== ROMPER BLOQUES ===");
        for (Bloque bloque : bloques) {
            bloque.romper();
        }
        System.out.println("\n=== COLOCAR BLOQUES ===");
        for (Bloque bloque : bloques) {
            bloque.colocar();
        }
    }
}
