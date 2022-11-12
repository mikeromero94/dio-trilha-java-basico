public class CarroMain {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.setModelo("Chevrolet");
        carro.setQuantidadeDePortas(4);
        carro.setAnoDeLancamento(2015);
        carro.setCor("Preto");
        carro.setCapacidadeDoTanque(10);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Quantidade de portas: " + carro.getQuantidadeDePortas());
        System.out.println("Ano de lançamento: " + carro.getAnoDeLancamento());
        System.out.println("Cor: " + carro.cor);
        System.out.println("Capacidade do tanque: " + carro.getCapacidadeDoTanque());
        System.out.println("Valor total do tanque: " + carro.totalValorTanque(3.00));
        System.out.println("\n");

        Carro carro1 = new Carro("Mercedes-Benz", 4,2020,"cinza",50);

        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Quantidade de portas: " + carro1.getQuantidadeDePortas());
        System.out.println("Ano de lançamento: " + carro1.getAnoDeLancamento());
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Capacidade do tanque: " + carro1.getCapacidadeDoTanque());
        System.out.println("Valor total do tanque: " + carro1.totalValorTanque(3.00));
    }
}
