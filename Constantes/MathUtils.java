package Constantes;

public class MathUtils {
    static int sumCounter = 0, multiplyCounter = 0;

    static int sum(int x, int y){
        sumCounter++;
        return x+y;
    }

    static int multiply(int x, int y){
        multiplyCounter++;
        return x*y;
    }

    public static void main(String[] args) {
        System.out.println("4 + 3 = " + sum(5, 3));
        System.out.println("Somas realizadas: " + sumCounter);
        System.out.println("Multiplicações realizadas: " + multiplyCounter);
    }
}
