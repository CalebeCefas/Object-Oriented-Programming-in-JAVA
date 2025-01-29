package Q10;

public class Quadrado implements Geometrico{
    public double base;

    public Quadrado(double base){
        this.base = base;
    }

    public double calcularArea(){
        return Math.pow(base, 2);
    }

    public double calcularPerimetro(){
        return 4*base;
    }
}