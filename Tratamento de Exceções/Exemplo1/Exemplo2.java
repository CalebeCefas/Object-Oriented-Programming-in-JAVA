package Exemplo1;

public class Exemplo2 {
   public int a, b;

    public Exemplo2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int soma(){
        if (a<0||b<0) {
            try {
                throw new Exemplo1Excepiton("os  valores devem ser maior que 0");
            } catch (Exemplo1Excepiton e) {
                
                System.out.println("Erro: "+e.getMessage());
            }
        }
        return a+b;
    } 
}
