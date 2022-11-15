package Exemplo2;

public class ClasseMain {
    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[] {new ClasseFilho1(), new ClasseFilho2(), new ClasseFilho3(), new ClasseMae()};

        // Polimorfismo

        for(ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for(ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        for(ClasseMae classe: classes) {
            classe.metodo3();
        }

        System.out.println("");

        // Sobrescrita

        ClasseFilho2 classeFilho2 = new ClasseFilho2();
        classeFilho2.metodo2();
    }
}
