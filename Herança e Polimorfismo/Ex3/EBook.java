package Ex3;

public class EBook extends Livro{
    public double tamanhoDoArquivo;
    
    public EBook(String titulo, String autor, double preco, double tamanhoDoArquivo){
        super(titulo, autor, preco);
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    public double getPreco(){
        return preco;
    }
}
