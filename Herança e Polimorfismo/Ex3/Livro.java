package Ex3;

public class Livro {
    public String titulo, autor;
    public double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }
}
