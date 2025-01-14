package Ex3;

import java.util.Scanner;

public class AppColecao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Quantos livros terão na coleção?: ");
        int quantidadeDeLivros = scanner.nextInt();
        int colecao[] = new int[quantidadeDeLivros];

        for(int i = 0; i<quantidadeDeLivros; i++){
            System.out.printf("Qual será o tipo do livro " + i+1 +":\n");
            System.out.printf("1 - Livro\n 2 - EBook\n 3 - AudioLivro\nDigite: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
