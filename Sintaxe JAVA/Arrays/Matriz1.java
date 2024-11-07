import java.util.Scanner;
public class Matriz1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int usuario[][] = new int[2][2];
        int identidade[][] = new int[2][2];
        int resultado[][] = new int[2][2];

        for(int i = 0; i<usuario.length; i++){
            for(int j = 0; j<usuario.length; j++){
                System.out.printf("Digite o dado da linha %d coluna %d: ", i+1, j+1);
                usuario[i][j] = scanner.nextInt();

                if(i == j){
                    identidade[i][j] = 1;
                } else {
                    identidade[i][j] = 0;
                }

                resultado[i][j] = usuario[i][j] + identidade[i][j];
            }
        }

        System.out.println("Matriz resultante");

        for(int i = 0; i<usuario.length; i++){
            for(int j = 0; j<2; j++){
                System.out.print(resultado[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}