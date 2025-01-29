package Q10;

public class ContaCorrente {
    public String nomeCliente;
    public int numConta;
    public double saldo;

    public ContaCorrente(String nomeCliente, int numConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double obterSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void depositarDinheiro(double deposito){
        this.saldo = saldo + deposito;
    }

    public void sacarDinheiro(double saque){
        this.saldo = saldo - saque - (saque*0.5);
    }

    @Override
    public String toString() {
        return "ContaCorrente [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
    }
}
