public class Aluno{
	public String nome;
	public int number;
	public int idade;
	public int matricula;

	public Aluno(String nome, int number, int idade, int matricula){
		this.nome = nome;
		this.number = number;
		this.idade = idade;
		this.matricula = matricula;
	}

	public String exibirDetalhes(){
		return "Nome: " + nome + "\nNúmero: " + number + "\nIdade: " + idade + "\nMatrícula: " + matricula;
	}

	public boolean verificarMaioridade(){
		if(idade>=18){
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]){
		Aluno aluno = new Aluno("Cefas", 8, 19, 567735);

		System.out.println(aluno.exibirDetalhes());

		if(aluno.verificarMaioridade()){
			System.out.println("O aluno É maior de idade");
		} else {
			System.out.println("O aluno NÃO É maior de idade");
		}
	}
}