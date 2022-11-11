package br.com.dio.exercicios.metodoArea;

public class Main {
    
    public static void main(String[] args) {
        
        Area area = new Area();

        int resultado;
        double resultado1;

        resultado = area.calcularArea(9);
        System.out.println("Area do quadrado é: " + resultado);

        
        resultado = area.calcularArea(3,4);
        System.out.println("Area do retangulo é: " + resultado);

        resultado1 = area.calcularArea(7, 14, 10);
        System.out.println("Area do trapezio é: " + resultado1 );
    }
}
