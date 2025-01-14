package Ex1;

public class Retangulo extends Poligono{
    public Retangulo(double base, double altura){
        super(base, altura);
    }

    public double calcularArea(){
        return base*altura;
    }
}
