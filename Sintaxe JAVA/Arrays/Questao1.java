import java.util.Scanner;
public class Questao1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5], sum = 0;
        
        for(int i = 0; i<4; i++){
            System.out.printf("Digite o dado %d de 4: ", i+1);
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        array[4] = sum;

        System.out.printf("Soma dos dados: " + sum);
        scanner.close();
    }
}