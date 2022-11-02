package edu.maycon.Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        String nome1 = "Maycon";
        String nome2 = new String("Maycon");
        System.out.println(nome1.equals(nome2));


        
        int numero1 = 1;
        int numero2 = 2;

        boolean validacao = numero1 == numero2;
        System.out.println(numero1 + " é igual ao " +numero2 + "?\n" + validacao);

        validacao = numero1 != numero2;
        System.out.println(numero1 + " é é diferente de " +numero2 + "?\n" + validacao);

        

    }
}
