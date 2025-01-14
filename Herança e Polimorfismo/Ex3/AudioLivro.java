package Ex3;

public class AudioLivro extends Livro{
    public double tempoDeDuracao;

    public AudioLivro(String titulo, String autor, double preco, double tempoDeDuracao){
        super(titulo, autor, preco);
        this.tempoDeDuracao = tempoDeDuracao;
    }
}
