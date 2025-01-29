package Q10;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Robson", 101010, 10000);
        ContaCorrenteEspecial e1 = new ContaCorrenteEspecial("Josué", 909090, 10000);

        c1.sacarDinheiro(100);
        e1.sacarDinheiro(100);

        System.out.println(c1);
        System.out.println(e1);
    }
}
