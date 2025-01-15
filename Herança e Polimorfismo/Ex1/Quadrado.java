package Ex1;

public class Quadrado extends Poligono{
    public Quadrado(double base){
        super(base, base);
    }

    public double calcularArea(){
        return base*base;
    }

    public double calcularPerimetro(){
        return 4*base;
    }
}
