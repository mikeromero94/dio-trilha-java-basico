package br.com.dio.exercicios.array;

import java.util.Random;

public class Multidimensional {
    
    public static void main(String[] args) {
        

        int[][] matrizFinal = new int[4][4];
        Random random = new Random();

        for(int i = 0; i < matrizFinal.length; i++) {
            for(int j = 0; j < matrizFinal[i].length; j++) {
                matrizFinal[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha : matrizFinal) { 
            for (int coluna : linha) {             
                System.out.print(coluna);
            }
            System.out.println();
        }

    }

        
    
}
