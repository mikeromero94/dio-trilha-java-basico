package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class UsuarioESenha {

    public static void main(String[] args) {
        
        String usuario;
        String senha;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        usuario = teclado.next();

        System.out.println("Digite a senha do usuário: ");
        senha = teclado.next();

        while(usuario.equals(senha)) {
            System.out.println("Erro. Senha igual nome de usuario.");
            System.out.println("Tente novamente. Senha: ");
            senha = teclado.next();
        }
    }
}