package Ex1;

public class Poligono{
    public double base, altura;
    
    public Poligono(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro(){
        return 2*base+2*altura;
    }
}