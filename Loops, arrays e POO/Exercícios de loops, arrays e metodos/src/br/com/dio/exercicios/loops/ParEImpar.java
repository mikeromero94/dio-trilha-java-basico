package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ParEImpar {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numerosInteiros;
        int quantidade;
        int numeroDeExecucoes = 0;
        int contadorDeImpar = 0;
        int contadorDePar = 0;


        System.out.println("Quantidade de vezes que deseja calcular: ");
        quantidade = teclado.nextInt();
        
        do {

            System.out.println("Insira o valor de um numero inteiro:");
            numerosInteiros = teclado.nextInt();
            if(numerosInteiros % 2 == 0) 
                contadorDePar++;
            else 
                contadorDeImpar++;
            numeroDeExecucoes++;
        }while(numeroDeExecucoes < quantidade);

        System.out.println("Quantidade de pares: " + contadorDePar);
        System.out.println("Qunatidade de impares: " + contadorDeImpar);
    }
    
}
