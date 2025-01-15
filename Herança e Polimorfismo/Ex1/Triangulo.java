package Ex1;

public class Triangulo extends Poligono{
    public Triangulo(double base, double altura){
        super(base, altura);
    }

    public double calcularArea(){
        return (base*altura)/2;
    }

    public double calcularPerimetro(){
        return base + 2 * Math.sqrt((base / 2) * (base / 2) + altura * altura);
    }
}
