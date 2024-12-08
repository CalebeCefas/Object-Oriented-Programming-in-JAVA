import java.util.Scanner;

public class ContaBancaria {
    public int numero;
    private double saldo;
    public String titular;

    public ContaBancaria(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public boolean creditarValor(double entrada) {
        if (entrada > 0) {
            saldo += entrada;
            return true;
        }
        return false;
    }

    public boolean debitarValor(double entrada) {
        if (entrada > 0 && entrada <= saldo) {
            saldo -= entrada;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria(101010, 10000.99, "Cefas");

        System.out.println("Bem vindo, " + conta.titular);
        System.out.println("O que desejas fazer?\n[1] - Creditar valor\n[2] - Debitar valor\nOpção: ");
        int op = scanner.nextInt();

        if (op == 1) {
            System.out.println("Qual valor será creditado?: ");
            double entrada = scanner.nextDouble();
            if (conta.creditarValor(entrada)) {
                System.out.println("Operação realizada com sucesso!");
                System.out.printf("Saldo Atual: R$ %.2f%n", conta.getSaldo());
            } else {
                System.out.println("Operação não realizada! Valor inválido.");
            }
        } else if (op == 2) {
            System.out.println("Qual valor será debitado?: ");
            double entrada = scanner.nextDouble();
            if (conta.debitarValor(entrada)) {
                System.out.println("Operação realizada com sucesso!");
                System.out.printf("Saldo Atual: R$ %.2f%n", conta.getSaldo());
            } else {
                System.out.println("O valor debitado é maior que o seu saldo ou é inválido!");
            }
        } else {
            System.out.println("Opção Inválida");
        }

        scanner.close();
    }
}
