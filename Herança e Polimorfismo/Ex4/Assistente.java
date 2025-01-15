package Ex4;

public class Assistente extends Funcionario{
    public double numeroDeHorasExtrasTrabalhadas, valorHoraExtra;

    public Assistente(String nome, double horasTrabalhadas, double valorDaHora, 
                    String departamento, double numeroDeHorasExtrasTrabalhadas,double valorHoraExtra){
        super(nome, horasTrabalhadas, valorDaHora, departamento);
        this.numeroDeHorasExtrasTrabalhadas = numeroDeHorasExtrasTrabalhadas;
        this.valorHoraExtra = valorHoraExtra;
    }

    public double calcularSalario(){
        return horasTrabalhadas*valorDaHora + 
                numeroDeHorasExtrasTrabalhadas*valorHoraExtra;
    }
}
