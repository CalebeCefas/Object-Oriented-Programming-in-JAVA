package Ex4;

public class Funcionario {
    public String nome, departamento;
    public double horasTrabalhadas, valorDaHora;

    public Funcionario(String nome, double horasTrabalhadas, double valorDaHora, String departamento){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorDaHora = valorDaHora;
        this.departamento = departamento;
    }

    public double calcularSalario(){
        return horasTrabalhadas*valorDaHora;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", departamento=" + departamento + ", horasTrabalhadas=" + horasTrabalhadas
                + ", valorDaHora=" + valorDaHora + "]";
    }

    
}
