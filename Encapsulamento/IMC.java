package Encapsulamento;

public class IMC {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Cefas", 19, 1.73, 71.5);

        pessoa.setNome("Cefas");
        pessoa.setIdade(19);
        pessoa.setAltura(1.73);
        pessoa.setPeso(71.5);

        System.out.println(pessoa.toString());

        System.out.printf("IMC: " + pessoa.calcularImc());
    }
}