package ContaCorrente;

public class Solution {
    public static void main(String[] args) {

    }


    static class ContaBancaria {
        public String agencia;
        public String conta;
    }


    static class ContaCorrente extends ContaBancaria {
        boolean possuiChequeEspecial;
        double limiteDoChequeEspecial;

        public ContaCorrente(String agencia, String conta, boolean possuiChequeEspecial) {
            this.agencia = agencia;
            this.conta = conta;
            this.possuiChequeEspecial = possuiChequeEspecial;
            if (this.possuiChequeEspecial) {
                limiteDoChequeEspecial = 500.00;
            } else {
                limiteDoChequeEspecial = 0.00;
            }
        }


        public void modificarLimiteChequeEspecial(double novoLimite) {
            if (possuiChequeEspecial && novoLimite >= 0.00) {
                limiteDoChequeEspecial = novoLimite;
            }
        }
    }
}



