package QuebraRegraDeNegocio;

public class Solution {
    public static void main(String[] args) {

    }

    class ContaCorrente {
        private String agencia;
        private int conta;
        private double saldo;


        public String getAgencia() {
            return this.agencia;
        }

        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }

        public int getConta() {
            return conta;
        }

        public void setConta(int conta) {
            this.conta = conta;
        }

        public double getSaldo() {
            return saldo;
        }


        public String setSaldo(double valor) {
            if (valor > 0) {
                this.saldo = valor;
                return "Saldo atualizado";
            } else {
                return "Saldo insuficiente";
            }
        }
    }
    }
