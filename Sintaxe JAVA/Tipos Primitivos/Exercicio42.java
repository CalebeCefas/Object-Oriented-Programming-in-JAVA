public class Exercicio42 {
    public static void main(String args[]){
        boolean operandoA = true, operandoB = false;

        if(operandoA && operandoB){
            System.out.println("AND");
        }if(operandoA || operandoB){
            System.out.println("OR");
        }if(operandoA ^ operandoB){
            System.out.println("XOR");
        }if(!operandoA && !operandoB){
            System.out.println("AND");
        }if(!operandoA || !operandoB){
            System.out.println("OR");
        }if(!operandoA ^ !operandoB){
            System.out.println("XOR");
        }
    }
}
