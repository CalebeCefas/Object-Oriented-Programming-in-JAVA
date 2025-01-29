package Q10;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(3);
        Circulo c1 = new Circulo(2);

        System.out.println("Área do quadrado: " + q1.calcularArea());
        System.out.println("Perimetro do quadrado: " + q1.calcularPerimetro());
        System.out.println("Área do círculo: " + c1.calcularArea());
        System.out.println("Perimetro do círculo: " + c1.calcularPerimetro());
    }
}
