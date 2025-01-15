package Ex3;

import java.util.Scanner;

public class AppColecao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Quantos livros terão na coleção?: ");
        int quantidadeDeLivros = scanner.nextInt();
        Livro colecao[] = new Livro[quantidadeDeLivros];
        double precoTotal = 0;

        for (int i = 0; i < quantidadeDeLivros; i++) {
            System.out.printf("\nQual será o tipo do livro %d:\n", i + 1);
            System.out.printf("1 - Livro\n2 - EBook\n3 - Audiolivro\nDigite: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o titulo do livro: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite o autor do livro: ");
            String autor = scanner.nextLine();
            System.out.print("Digite o preço do livro: ");
            double preco = scanner.nextDouble();

            switch (op) {
                case 1:
                    colecao[i] = new Livro(titulo, autor, preco);
                    break;
                case 2:
                    System.out.print("Digite o tamanho do arquivo (em MB): ");
                    double tamanhoDoArquivo = scanner.nextDouble();
                    colecao[i] = new EBook(titulo, autor, preco, tamanhoDoArquivo);
                    break;
                case 3:
                    System.out.print("Digite o tempo de duração (em horas): ");
                    double tempoDeDuracao = scanner.nextDouble();
                    colecao[i] = new AudioLivro(titulo, autor, preco, tempoDeDuracao);
                    break;
                default:
                    System.out.println("Opção Inválida! Livro não adicionado.");
                    i--;
                    break;
            }
            scanner.nextLine();

            if (colecao[i] != null) {
                precoTotal += colecao[i].getPreco();
            }
        }

        System.out.println("\nColeção de Livros:");
        for (Livro livro : colecao) {
            if (livro != null) {
                System.out.println(livro);
            }
        }

        System.out.printf("\nPreço total da coleção: R$ %.2f\n", precoTotal);
        scanner.close();
    }
}
