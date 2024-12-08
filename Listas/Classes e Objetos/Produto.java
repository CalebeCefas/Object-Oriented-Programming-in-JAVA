public class Produto{
	public String codigo, nome;
	public double preco;
	public boolean natural;

	public Produto(String codigo, String nome, double preco, boolean natural){
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.natural = natural;
	}

	public String exibirDetalhes(){
		return "codigo: "+codigo +"\nnome: "+nome +"\npreço: R$"+preco +"\nnatural: "+natural;
	}

	public static void main(String args[]){
		Produto produto = new Produto("XYZ", "Arroz", 1.00, true);

		System.out.println(produto.exibirDetalhes());
	}
}