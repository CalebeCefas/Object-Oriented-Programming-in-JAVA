package Q7;

public class Professor extends Pessoa{
    public double salario;

    public Professor(String nome, int ano, double salario){
        super(nome, ano);
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + ", Ano: " + ano + ", Salário: " + salario;
    }
}
