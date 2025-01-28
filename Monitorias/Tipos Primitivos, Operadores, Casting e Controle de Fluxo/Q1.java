import java.util.Scanner;

public class Q1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number1, sumI;
        double number2, sumD;

        System.out.println("Digite um valor int:");
        number1 = scanner.nextInt();

        System.out.println("Digite um valor double:");
        number2 = scanner.nextDouble();

        sumD = number1+number2;
        sumI = (int) (number1+number2);

        System.out.print(sumI);
        System.out.print("\n" + sumD);

        scanner.close();
    }
}