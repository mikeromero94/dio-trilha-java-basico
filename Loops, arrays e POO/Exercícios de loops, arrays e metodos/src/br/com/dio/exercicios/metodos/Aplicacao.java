package br.com.dio.exercicios.metodos;

import java.sql.Date;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcao;
        System.out.println("-------------");
        System.out.println("Sistema");
        System.out.println("-------------");
        System.out.println("Escolha a aplicação que deseja realizar: ");
        System.out.println("1- Calculadora\n2- Saudação\n3- Empréstimo: ");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
            System.out.println("-------------");
            System.out.println("Sistema");
            System.out.println("-------------");
            System.out.println("Escolha a operação que deseja fazer");
            System.out.println("1- Adição\n2- Subtração\n3- Multiplicação\n4- Divisão: ");
            int operacao = teclado.nextInt();
            switch(operacao) {
                case 1:
                    somarNumeros(); break;
                case 2:
                    subtrairNumeros(); break;
                case 3:
                    multiplicarNumeros(); break;
                case 4: 
                    dividirNumeros(); break;
                default:
                    System.out.println("Número invalido"); break;                
            }

            case 2:
               verificarHoraDoDia(); break;
            case 3:
                calcularValorFinalJurosCompostos(); break;
            default:
                System.out.println("Operação invalida"); break;
        }
        
    }

    public static void somarNumeros() {
        int elemento1, elemento2;
        Scanner teclado = new Scanner(System.in);


        System.out.print("Elemento 1: ");
        elemento1 = teclado.nextInt();

        System.out.println("Elemento 2: ");
        elemento2 = teclado.nextInt();

        int soma = elemento1 + elemento2;
        System.out.println(elemento1+ " + " + elemento2+ " = " + soma);
    }

    public static void subtrairNumeros() {
        int elemento1, elemento2;
        Scanner teclado = new Scanner(System.in);


        System.out.print("Elemento 1: ");
        elemento1 = teclado.nextInt();

        System.out.println("Elemento 2: ");
        elemento2 = teclado.nextInt();

        int subtracao = elemento1 - elemento2;
        System.out.println(elemento1+ " - " + elemento2+ " = " + subtracao);
    }

    public static void multiplicarNumeros() {
        int elemento1, elemento2;
        Scanner teclado = new Scanner(System.in);


        System.out.print("Elemento 1: ");
        elemento1 = teclado.nextInt();

        System.out.println("Elemento 2: ");
        elemento2 = teclado.nextInt();

        int multiplicacao = elemento1 * elemento2;
        System.out.println(elemento1+ " x " + elemento2+ " = " + multiplicacao);
    }

    public static void dividirNumeros() {
        double elemento1, elemento2;
        Scanner teclado = new Scanner(System.in);


        System.out.print("Elemento 1: ");
        elemento1 = teclado.nextDouble();

        System.out.println("Elemento 2: ");
        elemento2 = teclado.nextDouble();

        while(elemento1 == 0 | elemento2 == 0) {
            System.out.println("Operação invalida. Tente novamente.");
            System.out.print("Elemento 1: ");
            elemento1 = teclado.nextInt();

            System.out.println("Elemento 2: ");
            elemento2 = teclado.nextInt();
        }

        double divisao = elemento1 / elemento2;
        System.out.println((int)elemento1+ " / " + (int)elemento2+ " = " + divisao);
    }

    public static void verificarHoraDoDia() {
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);

        if(hora >= 6 && hora < 12) {
            System.out.println("Bom dia!");
        }
        else if(hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        }
        else if(hora >= 18 && hora < 24) {
            System.out.println("Boa noite!");
        }
        else 
            System.out.println("Boa madrugada!");
    }


    public static void calcularValorFinalJurosCompostos() {

        Scanner teclado = new Scanner(System.in);
        Double montante, capitalAplicado, tempoDeAplicacao;
        DecimalFormat df =  new DecimalFormat("0.00");

        System.out.println("Capital aplicado: ");
        capitalAplicado = teclado.nextDouble();

        System.out.println("Tempo de aplicação: ");
        tempoDeAplicacao = teclado.nextDouble();


        if(capitalAplicado < 1000) {
            Double i = 0.05 + 1;
            Double resultado = Math.pow(i,tempoDeAplicacao);
            montante = capitalAplicado * resultado;
            System.out.println("Valor final R$ " +df.format(montante));
        }

        else if(capitalAplicado >= 1000 && capitalAplicado < 10000) {
            Double i = 0.15 + 1;
            Double resultado = Math.pow(i,tempoDeAplicacao);
            montante = capitalAplicado * resultado;
            System.out.println("Valor final R$ " + df.format(montante));
        }

        else {
            Double i = 0.2 + 1;
            Double resultado = Math.pow(i,tempoDeAplicacao);
            montante = capitalAplicado * resultado;
            System.out.println("Valor final R$ " + df.format(montante));
        }

    }


}