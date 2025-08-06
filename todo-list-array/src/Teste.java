public class Teste {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        b = 10;

        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("p1.nome = " + p1.nome);
        System.out.println("p2.nome = " + p2.nome);
    }
}

class Pessoa {
    String nome;
}
