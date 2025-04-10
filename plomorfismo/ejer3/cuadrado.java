public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void mostrar() {
        System.out.println("Cuadrado - Lado: " + lado + ", Área: " + area());
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
