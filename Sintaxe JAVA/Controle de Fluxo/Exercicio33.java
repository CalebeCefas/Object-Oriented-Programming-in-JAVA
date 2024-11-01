public class Exercicio33{
    public static void main (String args[]){
        for(int i=100; i>=-95; i-=5){
            if(i%2 != 0){
                continue;
            }
            System.out.printf(i + " ");
        }

        for(int i=-95; i<=100; i+=5){
            if(i%2 != 0){
                continue;
            }
            System.out.printf(i + " ");
        }
    }
}
