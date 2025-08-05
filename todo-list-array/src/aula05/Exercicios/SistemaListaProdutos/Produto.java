package aula05.Exercicios.SistemaListaProdutos;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    public String codigo;
    public double precoUnitario;
    public int quantidade;

    public Produto(String codigo, double precoUnitario, int quantidade) {
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.quantidade = Math.max(0, quantidade); //retorna o maior dos dois valores.
    }
}

class NotaFiscal {
    private static List<Produto> produtos = new ArrayList<>();

    public static void adicionarProduto(Produto produto) {
        produtos.add(produto); //adiciona na lista produtos um objeto do tipo Produto
    }

    public static void removerProdutos(String codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);   //percorre a lista de produtos, os encontra e se o codigo for igual ao informado, remove
            if (p.codigo.equalsIgnoreCase(codigo)) {
                produtos.remove(p);
            }
        }
    }

    public static double calcularValorProduto(Produto produto) {
        return produto.precoUnitario * produto.quantidade; //recebe um objeto do tipo Produto e pega seus atributos para calcular
    }

    public static double calcularValorNotaFiscal() {
        double soma = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i); //percorre a lista produtos, pega os elementos e os passa pra uma variavel, pegando o retorno do metodo calcularValorProduto e somando
        soma+= NotaFiscal.calcularValorProduto(p);
        }
        return soma;
    }
}


