package Ex4;

public class Gerente extends Funcionario{
    public int numeroDeFuncionariosGerenciados;
    public double porcentagemBonus;

    public Gerente(String nome, double horasTrabalhadas, double valorDaHora, 
                    String departamento, int numeroDeFuncionariosGerenciados,double porcentagemBonus){
        super(nome, horasTrabalhadas, valorDaHora, departamento);
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
        this.porcentagemBonus = porcentagemBonus;
    }

    public double calcularSalario(){
        return (horasTrabalhadas*valorDaHora)+
                (horasTrabalhadas*valorDaHora)*porcentagemBonus/100;
    }
}
