import java.util.Scanner;

public class Calendario{
	public int dia, mes, ano;
	public boolean feriado;

	public static final String US = "US";
    public static final String BR = "BR";

	public int getDia() {
        	return dia;
    	}

    	public void setDia(int dia) {
        	if (dia >= 1 && dia <= 31) {
            		this.dia = dia;
        	} else {
            		System.out.println("Dia inválido. Insira um valor entre 1 e 31.");
        	}
    	}

    	public int getMes() {
        	return mes;
    	}

    	public void setMes(int mes) {
        	if (mes >= 1 && mes <= 12) {
            	this.mes = mes;
        	} else {
            		System.out.println("Mês inválido. Insira um valor entre 1 e 12.");
        	}
    	}

	public int getAno(){
		return ano;
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	public boolean getFeriado(){
		return feriado;
	}

	public void setFeriado(boolean feriado){
		this.feriado = true;
	}

	public String exibirDataUs(){
		return ano + "/" + mes + "/" + dia;
	}

	public String exibirDataBr(){
		return dia + "/" + mes + "/" + ano;
	}

	public void exibirData(String op){
		if (op.equals(US)) {
			System.out.println(exibirDataUs());
		} else if (op.equals(BR)) {
			System.out.println(exibirDataBr());
		} else {
			System.out.println("Opção inválida. Use 'US' ou 'BR'.");
		}
	}

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Calendario data = new Calendario();
		
		data.setDia(25);
		data.setMes(12);
		data.setAno(2024);
		data.setFeriado(true);

		System.out.printf("Digite a forma de exibição da data(US/BR): ");
		String op = scanner.next();

		data.exibirData(op);

		scanner.close();
	}
}