package br.com.dio.exercicios.array;

import java.util.Scanner;

public class Consoantes {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String[] consoantes = new String[6];
        int contadorDeConsoantes = 0;

        for(int i = 0; i < consoantes.length; i++) {
            System.out.println("Letra: ");
            String letra = teclado.next();

            if( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")) ) {
                    consoantes[i] = letra;
                    contadorDeConsoantes++;
                }
        }
        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println();
        System.out.println("Quantidade de consoantes: " + contadorDeConsoantes);
    }
}
