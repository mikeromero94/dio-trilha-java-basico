package br.com.dio.exercicios.loops;
import java.util.Scanner;

public class MaiorEMedia {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Double numero;
        int contador = 0;
        Double soma = 0.0;
        Double maior = 0.0;
        Double media;


        do {
            System.out.println("Digite um numero: ");
            numero = teclado.nextDouble();
            contador++;
            soma = numero + soma;
            
            if(numero > maior) {
                maior = numero;
            }


        }while(contador < 5);

        media = soma/contador;

        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + media);
    }
}
