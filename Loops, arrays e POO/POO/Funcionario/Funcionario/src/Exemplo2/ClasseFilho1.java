package Exemplo2;

public class ClasseFilho1 extends ClasseMae{

    @Override // Sobrescrita
    void metodo1() {
        System.out.println("Método 1 da Classe Filho 1");
    }

    @Override
    void metodo3() {
        System.out.println("Método 3 da Classe Filho 1");
    }
    
}
