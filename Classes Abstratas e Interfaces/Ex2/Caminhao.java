package Ex2;

public class Caminhao implements Veiculo {
    public double tonelada;

    public Caminhao(double tonelada){
        this.tonelada = tonelada;
    }

    @Override
    public double calcularPedagio() {
        return tonelada * 10;
    }
    
}
