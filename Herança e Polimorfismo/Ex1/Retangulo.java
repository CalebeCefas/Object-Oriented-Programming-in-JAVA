package Ex1;

public class Retangulo extends Poligono{
    public Retangulo(double base, double altura){
        super(base, altura);
    }

    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return 2*base+2*altura;
    }
}
