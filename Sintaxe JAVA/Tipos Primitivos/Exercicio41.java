public class Exercicio41 {
    public static void main (String args[]){
        double operandoA = 3, operandoB = 42, maior, menor;

        if(operandoA != operandoB){
            System.out.printf("\nOs operandos são diferentes\n");
            
            if(operandoA>operandoB){
                maior = operandoA;
                menor = operandoB;
            } else {
                maior = operandoB;
                menor = operandoA;
            }
    
            System.out.printf("O operando %.2f é maior que o operando %.2f", maior, menor);
            
        } else {
            System.out.printf("\nOs operandos são iguais\n");
        }
    }
}
