public class Carro extends Veiculo {

    String modelo;
    int quantidadeDePortas;
    int anoDeLancamento;
    String cor;
    int capacidadeDoTanque;

    Carro() {

    }

    Carro(String modelo, int quantidadeDePortas, int anoDeLancamento, String cor, int capacidadeDoTanque) {
        this.modelo = modelo;
        this.quantidadeDePortas = quantidadeDePortas;
        this.anoDeLancamento = anoDeLancamento;
        this.cor = cor;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }
    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }
    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeDoTanque * valorCombustivel;
    }
}

