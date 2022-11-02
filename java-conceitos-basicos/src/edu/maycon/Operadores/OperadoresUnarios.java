package edu.maycon.Operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
        int valor = 5;
        valor = -valor;
        System.out.println(valor);

        // Para torna-lo positivo basta multiplicar o valor por um número também negativo;
        valor = valor * -1;
        System.out.println(valor);
    }
}