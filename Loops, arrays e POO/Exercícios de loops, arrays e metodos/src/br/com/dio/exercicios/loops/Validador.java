package br.com.dio.exercicios.loops;

import java.io.IOException;
import java.lang.ref.Cleaner;
import java.nio.Buffer;
import java.util.Scanner;

public class Validador {
    
    public static void main(String[] args) throws IOException {
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        int contadorNome;
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = teclado.next();
        contadorNome = nome.length();

        System.out.println("Idade: ");
        idade = teclado.nextInt();

        System.out.println("Salário:");
        salario = teclado.nextDouble();

        System.out.println("Sexo M/F: ");
        sexo = teclado.next();

        System.out.println("Estado civil S/C/V/D:");
        estadoCivil = teclado.next();

        while(contadorNome <= 3) {
            System.out.println("Nome pequeno. Tente novamente.");
            System.out.println("Nome: ");
            nome = teclado.next();
            contadorNome = nome.length();
        }

        while(idade < 0 | idade > 150) {
            System.out.println("Idade invalida. Tente novamente.");
            System.out.println("Idade: ");
            idade = teclado.nextInt();
        }

        while(salario < 0) {
            System.out.println("Salario inválido. Tente novamente.");
            System.out.println("Salário: ");
            salario = teclado.nextDouble();
        }

        while(!(sexo.equalsIgnoreCase("m")) | (sexo.equalsIgnoreCase("f"))) {
            System.out.println("Sexo inválido. Tente novamente");
            System.out.println("Sexo: ");
            sexo = teclado.next();
        }

        while(!(estadoCivil.equalsIgnoreCase("s")) | (estadoCivil.equalsIgnoreCase("c")) | (estadoCivil.equalsIgnoreCase("v")) | (estadoCivil.equalsIgnoreCase("d"))) {
            System.out.println("Estado civil inválido. Tente novamente");
            System.out.println("Estado civil: ");
            estadoCivil = teclado.next();
        }

    }
        
}

