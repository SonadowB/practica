public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void mostrar() {
        System.out.printf("Círculo - Radio: %.2f, Área: %.2f\n", radio, area());
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
