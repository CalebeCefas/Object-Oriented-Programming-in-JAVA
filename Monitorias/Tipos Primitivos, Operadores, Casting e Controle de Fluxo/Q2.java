import java.util.Scanner;
public class Q2 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, num4, media;

        System.out.println("Digite a nota 1:");
        num1 = scanner.nextDouble();
        System.out.println("Digite a nota 2:");
        num2 = scanner.nextDouble();
        System.out.println("Digite a nota 3:");
        num3 = scanner.nextDouble();
        System.out.println("Digite a nota 4:");
        num4 = scanner.nextDouble();

        media = (num1+num2+num3+num4)/4;

        if(media>=7){
            System.out.println("Aprovado!");
        } else if(media<7 && media>=5){
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}