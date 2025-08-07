package SistemaListaProdutos;

public class Application {
    public static void main(String[] args) {

        Produto produto1 = new Produto("0ab1", 29.99, 0);
        Produto produto2 = new Produto("1cd2", 12.95, 5);

        NotaFiscal notaFiscal1 = new NotaFiscal();

        notaFiscal1.adicionarProduto(produto1);
        notaFiscal1.adicionarProduto(produto2);

        notaFiscal1.calcularValorProduto(produto1);
        notaFiscal1.calcularValorProduto(produto2);

        System.out.println("-------- ANTES DE REMOVER DA NF ---------");
        System.out.println("Valor total do produto1: R$ " + notaFiscal1.calcularValorProduto(produto1));
        System.out.println("Valor total do produto2: R$ " + notaFiscal1.calcularValorProduto(produto2));
        System.out.println("Valor total da Nota Fiscal: R$ " + notaFiscal1.calcularValorNotaFiscal());

        System.out.println("");

        System.out.println("-------- DEPOIS DE REMOVER DA NF ---------");
        System.out.println("Removendo produto1....");
        notaFiscal1.removerProdutos("0ab1");
        System.out.println("Valor total do produto1: R$ " + notaFiscal1.calcularValorProduto(produto1));
        System.out.println("Valor total do produto2: R$ " + notaFiscal1.calcularValorProduto(produto2));
        System.out.println("Valor total da Nota Fiscal: R$ " + notaFiscal1.calcularValorNotaFiscal());
    }
}
