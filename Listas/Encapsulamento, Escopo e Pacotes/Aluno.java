import java.util.Scanner;

public class Aluno{
	public String nome;
	protected int sala;
	public double nota1, nota2, nota3, media;

	public int getSala(){
		return sala;
	}

	public void setSala(int sala){
		this.sala = sala;
	}

	public void calcularMedia(double nota1, double nota2, double nota3){
		this.media = (nota1 + nota2 + nota3)/3;
	}

	public String exibirDetalhes(){
		return "Aluno: "+nome +"\nSala: "+sala +"\nMedia: "+media;
	}

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.print("Digite o nome do aluno: ");
        	aluno.nome = scanner.nextLine();

        	System.out.print("Digite a sala do aluno: ");
        	aluno.setSala(scanner.nextInt());

        	System.out.print("Digite a primeira nota: ");
        	aluno.nota1 = scanner.nextDouble();

       		System.out.print("Digite a segunda nota: ");
        	aluno.nota2 = scanner.nextDouble();

        	System.out.print("Digite a terceira nota: ");
        	aluno.nota3 = scanner.nextDouble();

		aluno.calcularMedia(aluno.nota1, aluno.nota2, aluno.nota3);

		System.out.println("\nDetalhes do Aluno:");
        	System.out.println(aluno.exibirDetalhes());

		scanner.close();
	}
}