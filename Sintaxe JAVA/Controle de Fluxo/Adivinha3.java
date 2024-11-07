import java.util.Scanner;
public class Adivinha3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 24, resp;

        System.out.printf("Digite um número entre 0 a 100: ");
        resp = scanner.nextInt();

        while(resp != result){
            if(resp>result){
                System.out.println("É MAIOR que o número esperado");
            } else {
                System.out.println("É MENOR que o número esperado");
            }

            resp = scanner.nextInt();
        }

        System.out.println("VOCÊ ACERTOU!!!");

        scanner.close();
    }
}
