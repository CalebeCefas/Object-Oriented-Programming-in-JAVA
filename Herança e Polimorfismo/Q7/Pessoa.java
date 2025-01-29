package Q7;

public class Pessoa{
    public String nome;
    public int ano;

    public Pessoa(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}