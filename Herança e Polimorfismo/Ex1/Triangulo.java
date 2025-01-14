package Ex1;

public class Triangulo extends Poligono{
    public Triangulo(double base, double altura){
        super(base, altura);
    }

    public double calcularArea(){
        return (base*altura)/2;
    }
}
