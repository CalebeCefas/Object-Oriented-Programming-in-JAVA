package Ex2;

public class Carro implements Veiculo {
    public int eixo;

    public Carro(int eixo){
        this.eixo = eixo;
    }

    @Override
    public double calcularPedagio() {
        return eixo * 5;
    }
    
}
