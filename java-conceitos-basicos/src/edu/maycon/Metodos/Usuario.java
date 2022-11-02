package edu.maycon.Metodos;

public class Usuario {
    
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        /*
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);

        */

        smartTv.ligar();
        System.out.println("Novo status - TV ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - TV ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);


        
    }
}
