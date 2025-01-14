package Ex1;

public class Main {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado(4);
        Retangulo retangulo = new Retangulo(5, 3);
        Triangulo triangulo = new Triangulo(4, 5);

        System.out.printf("Área do Quadrado: " + quadrado.calcularArea() + "\n");
        System.out.printf("Área do Retangulo: " + retangulo.calcularArea() + "\n");
        System.out.printf("Área do Triangulo: " + triangulo.calcularArea() + "\n");
    } 
}
