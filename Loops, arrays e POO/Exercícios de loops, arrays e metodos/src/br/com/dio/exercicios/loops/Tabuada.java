package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int fator;
        int resultado;

        System.out.println("Digite a tabuada que deseja calcular de 1 a 10: ");
        fator = teclado.nextInt();

        while(fator < 0 | fator > 10) {
            System.out.println("Tabuada invalida. Digite novamente: ");
            fator = teclado.nextInt();
        }
       
        for(int i = 0; i <= 10; i++) { 
            resultado = fator * i;
            System.out.println(fator + " x " + i + " = " +resultado);
        }
            
        
    }
}
