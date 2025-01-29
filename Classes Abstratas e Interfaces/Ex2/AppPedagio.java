package Ex2;

import java.util.Scanner;

public class AppPedagio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] veiculos = new double[5];

        System.out.printf("Quantos veículos serão registrados?: ");
        int q = sc.nextInt();

        for (int i=0; i<q; i++) {
            System.out.printf("\nQual o tipo de veículo?\n1 - Carro\n2 - Caminhão\nOpção: ");
            int op = sc.nextInt();
            
            if (op == 1) {
                System.out.print("Quantos eixos possue?: ");
                int eixo = sc.nextInt();
                Carro carro = new Carro(eixo);
                veiculos[i] = carro.calcularPedagio();
                System.out.println("Veículo adicionado");
            } else if (op == 2) {
                System.out.print("Quantas tonaladas pesa?: ");
                int tonelada = sc.nextInt();
                Caminhao caminhao = new Caminhao(tonelada);
                veiculos[i] = caminhao.calcularPedagio();
                System.out.println("Veículo adicionado");
            } else {
                System.out.println("Opção Inválida");
            }
        }

        System.out.println("Veículos Registrados:");

        for(int i=0; i<q; i++) {
            System.out.printf("Veículo %d: R$%.2f\n", i+1, veiculos[i]);
        }

        sc.close();
    }
}