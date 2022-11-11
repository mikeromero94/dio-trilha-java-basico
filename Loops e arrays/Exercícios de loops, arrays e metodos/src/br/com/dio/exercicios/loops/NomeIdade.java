package br.com.dio.exercicios.loops;
import java.util.Scanner;

public class NomeIdade {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {

            System.out.println("Informe seu nome:");
            nome = teclado.next();

            if(nome.equals("0"))
                break;
            
            System.out.println("Informe sua idade");
            idade = teclado.nextInt();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
           
        }

    }
}
