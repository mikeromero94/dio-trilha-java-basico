package br.com.dio.exercicios.array;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        
        
        Random random = new Random();
        int[] aleatorio = new int[5];
        int[] sucessor = new int[5];
        int soma;

        System.out.println("Números aleatórios: ");
        for(int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = random.nextInt(100); // Define um range de 0 a 100 números
            soma = aleatorio[i];                      // para escolher
            System.out.print(aleatorio[i]+ " ");
            sucessor[i] = soma + 1;
  
        }
        System.out.println();

        System.out.println("Sucessores: ");
        for(int i = 0; i < sucessor.length; i++) {
            System.out.print(sucessor[i] + " ");
        }
    }
}
