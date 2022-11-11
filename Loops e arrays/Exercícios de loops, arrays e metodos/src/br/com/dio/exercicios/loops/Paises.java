package br.com.dio.exercicios.loops;

public class Paises {
    public static void main(String[] args) {
        
        double pais_A = 8000;
        double taxaCrescimento_A = 0.03;
        double pais_B = 20000;
        double taxaCrescimento_B = 0.015;
        int ano = 0;
        

        while(true) {
            double crescimentoPopulacaoA = pais_A * taxaCrescimento_A;
            pais_A += crescimentoPopulacaoA; 
            double crescimentoPopulacaoB = pais_B * taxaCrescimento_B;
            pais_B += crescimentoPopulacaoB;  

            if(pais_A >= pais_B)
                break;
            ano++;
        }

        System.out.println("População A superou a população B em quantidade em " + ano + " anos.");

    }
}
