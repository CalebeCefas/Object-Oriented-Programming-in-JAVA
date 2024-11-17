package Encapsulamento;
import java.util.Scanner;

public class Usuario {
    private String login;
    private String senha;

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean checarSenha(String loginTeste, String senhaTeste) {
        return this.login.equals(loginTeste) && this.senha.equals(senhaTeste);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        usuario.setLogin("Cefas");
        usuario.setSenha("123");

        System.out.print("Digite o Login: ");
        String loginTeste = scanner.nextLine();

        System.out.print("Digite a Senha: ");
        String senhaTeste = scanner.nextLine();

        if (usuario.checarSenha(loginTeste, senhaTeste)) {
            System.out.println("Bem-Vindo!!!");
        } else {
            System.out.println("Login ou Senha incorretos");
        }

        scanner.close();
    }
}

