import java.util.Scanner;

public class ChecaPar {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.printf("Digite um valor: ");
        valor = scanner.nextInt();

        boolean cond = valor%2 == 0 ? true : false;

        if(cond == true){
            System.out.println("O valor digitado é par");
        } else {
            System.out.println("O valor digitado é ímpar");
        }

        scanner.close();
    }
}
