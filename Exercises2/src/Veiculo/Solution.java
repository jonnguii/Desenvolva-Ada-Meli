package Veiculo;

public class Solution {
    public static void main(String[] args) {

        Carro c1 = new Carro("diesel");
        System.out.printf(c1.ligar());
        System.out.println();
        System.out.printf(c1.desligar());
        System.out.println();
        System.out.printf(c1.desligar());
        System.out.println();
        System.out.printf(c1.desligar());

    }

    static class Veiculo {
        public boolean estaLigado;

    }

    static class Carro extends Veiculo {
        String tipoDeCombustivel;

        public Carro(String tipoDeCombustivel) {
            this.tipoDeCombustivel = tipoDeCombustivel;
        }


        public String ligar() {
            if (this.estaLigado) {
                return "carro já está ligado";
            } else {
                this.estaLigado = true;
                return "ligado";
            }
        }

        public String desligar() {
            if (!this.estaLigado) {
                return "carro já está desligado";
            } else {
                this.estaLigado = false;
                return "desligado";
            }
        }

    }

}
