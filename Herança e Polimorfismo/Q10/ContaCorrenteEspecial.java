package Q10;

public class ContaCorrenteEspecial extends ContaCorrente{
    public ContaCorrenteEspecial(String nomeCliente, int numConta, double saldo){
        super(nomeCliente, numConta, saldo);
    }

    public void sacarDinheiro(double saque){
        this.saldo = saldo - saque - (saque*0.1);
    }

    @Override
    public String toString() {
        return "ContaCorrente [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
    }
}
