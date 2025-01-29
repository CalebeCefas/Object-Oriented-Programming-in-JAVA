package Q7;

public class Estudante extends Pessoa{
    public String especializacao;

    public Estudante(String nome, int ano, String especializacao){
        super(nome, ano);
        this.especializacao = especializacao;
    }

    public String getEspecializacao(){
        return especializacao;
    }

    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return "Estudante: " + nome + ", Ano: " + ano + ", Especialização: " + especializacao;
    }
}
