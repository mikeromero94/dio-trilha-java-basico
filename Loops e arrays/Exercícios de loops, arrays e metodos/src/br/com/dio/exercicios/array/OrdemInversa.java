package br.com.dio.exercicios.array;

public class OrdemInversa {
    
    public static void main(String[] args) {

        int[] vetor = {4,10,-25,31,40,-100};

        System.out.println("Vetor: ");
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }

        System.out.println("\nVetor: ");

        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
