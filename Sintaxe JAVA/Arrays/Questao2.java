public class Questao2{
    public static void main(String args[]){
        int array[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49}, maior=-10000000, menor=1000000;
        for(int i = 0; i<10; i++){
            if(array[i]>maior){
                maior = array[i];
            } if(array[i]<menor){
                menor = array[i];
            }
        }

        System.out.printf("Maior valor do array: " + maior + "\n");
        System.out.printf("Menor valor do array: " + menor);
    }
}