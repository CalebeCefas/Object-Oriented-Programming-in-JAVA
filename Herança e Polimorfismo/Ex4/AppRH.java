package Ex4;

public class AppRH {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Calebe", 20, 10.50, "Gerencia", 1, 10);
        Assistente assistente = new Assistente("Cefas", 30, 8.75, "Assistência", 5, 10);

        System.out.println(gerente);
        System.out.println(gerente.calcularSalario());
        System.out.println(assistente);
        System.out.println(assistente.calcularSalario());
    }
}
