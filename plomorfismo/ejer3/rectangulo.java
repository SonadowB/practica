public class Rectangulo extends Figura {
    private double largo, ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public void mostrar() {
        System.out.println("Rectángulo - Largo: " + largo + ", Ancho: " + ancho + ", Área: " + area());
    }

    @Override
    public double area() {
        return largo * ancho;
    }
}
