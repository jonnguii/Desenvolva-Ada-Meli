package SaldoConta;

public class Solution {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        System.out.printf(c1.setSaldo(500.00));
        System.out.println();
        System.out.println(c1.getSaldo());
        System.out.printf(c1.setSaldo(-200.00));
        System.out.println();
        System.out.println(c1.getSaldo());

    }
}

class ContaBancaria {
    public String agencia;
    public int conta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public String setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
            return "Saldo atualizado";
        } else {
            return "Saldo insuficiente";
        }
    }
}
