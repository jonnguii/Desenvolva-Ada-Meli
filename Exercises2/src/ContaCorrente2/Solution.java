package ContaCorrente2;

public class Solution {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente("212", "123", 100.00);
        System.out.println(c1.getSaldo());
    }

    public static class ContaBancaria {
        public String agencia;
        public String conta;
    }


    public static class ContaCorrente extends ContaBancaria {
        private double saldo;

        public ContaCorrente(String agencia, String conta) {
            this.agencia = agencia;
            this.conta = conta;
        }

        public ContaCorrente(String agencia, String conta, double saldoInicial) {
            this.agencia = agencia;
            this.conta = conta;
            if (saldoInicial < 0) {
                saldoInicial = 0;
            }
            this.saldo = saldoInicial;

        }

        public double getSaldo() {
            return saldo;
        }


    }

}
