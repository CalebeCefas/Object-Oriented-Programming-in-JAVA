package Ex1;

public class AppCalcular {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(2, 4);
        Circulo c = new Circulo(5);

        System.out.println("Área do Retângulo: " + r.calcularArea());
        System.out.println("Perímetro do Retângulo: " + r.calcularPerimetro());
        System.out.println("Área do Círculo: " + c.calcularArea());
        System.out.println("Perímetro do Círculo: " + c.calcularPerimetro());
    }
    
}
