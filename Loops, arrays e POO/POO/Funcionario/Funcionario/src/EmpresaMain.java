public class EmpresaMain {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Funcionario();
        Funcionario vendedor = new Funcionario();
        Funcionario faxineiro = new Funcionario();

        // Evitar de trabalhar com downcasts
        //Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
