package Encapsulamento;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("Civic");
        carro.setAno(2025);
        carro.setCor("Prata");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());
    }
}
