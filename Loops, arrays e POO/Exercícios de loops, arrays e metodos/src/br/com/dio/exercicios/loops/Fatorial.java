package br.com.dio.exercicios.loops;
import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int fator;
        int resultado = 1;


        System.out.println("Fatorial calculado: ");

        for(fator = teclado.nextInt(); fator >= 1; fator--) {
            resultado *= fator;
        }

        System.out.println("Fatorial: " + resultado);
    }
}
