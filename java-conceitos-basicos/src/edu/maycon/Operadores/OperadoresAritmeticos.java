package edu.maycon.Operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double soma_numero1 = 10.5;
        double soma_numero2 = 15.7;
        double somaFinal = somar(soma_numero1,soma_numero2);
        System.out.println(somaFinal);

        int subtracao1 = 113;
        int subtracao2 = 25;
        int resultado = subtracao1 - subtracao2;
        System.out.println(resultado);

        int multiplicacao = 20 * 7;
        System.out.println(multiplicacao);

        //Concatenação de strings

        String nomeCompleto = "JAVA" + " " + "COMPLETO";
        System.out.println(nomeCompleto);
    }

    public static double somar(double soma_numero1, double soma_numero2) {
        return soma_numero1 + soma_numero2;
    }
}
