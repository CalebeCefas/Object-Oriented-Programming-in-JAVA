public class Livro{
    char titulo;
    char autor;
    char editora;
    int anoPublicacao;

    void mudarEditora(char editora){
        this.editora = editora;
    }

    int calcularIdade(int anoPublicacao){
        return 2024-anoPublicacao;
    }

    void imprimeInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Ano da publicação: " + anoPublicacao);
    }
}