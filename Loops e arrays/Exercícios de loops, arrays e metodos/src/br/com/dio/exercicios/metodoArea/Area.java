package br.com.dio.exercicios.metodoArea;

public class Area {
    
    public static int calcularArea(int lado) {
      
        return lado*lado;
        
    }

    public static int calcularArea(int base, int altura) {
        
        return base * altura;
    }

    public static double calcularArea(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor)*altura)/2;
    }
}
