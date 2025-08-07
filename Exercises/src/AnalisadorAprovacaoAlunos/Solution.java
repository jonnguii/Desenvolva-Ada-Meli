package AnalisadorAprovacaoAlunos;

public class Solution {
    public static double calcularMediaFinal(String matricula, double nota1, double nota2, double nota_trabalho) {
        return (nota1 + nota2 + nota_trabalho)/3;
    }
    public static String verificarPromocaoAluno(String matricula, double nota1, double nota2, double nota_trabalho) {
        double media = (nota1 + nota2 + nota_trabalho) / 3;
        String mensagem;
        if (media >= 7) {
             mensagem = String.format("Aluno aprovado com média %.1f", media);
        } else {
             mensagem = String.format("Aluno reprovado com média %.1f", media);
        }
        return mensagem;
    }
}

//Poderia fazer sem formatar os pontos flutuantes:

//double media = (nota1 + nota2 + nota_trabalho) / 3;
//String mensagem;
//        if (media >= 7) {
//mensagem = "Aluno aprovado com média: " + media;
//        } else {
//mensagem = "Aluno reprovado com média: " + media);
//        }
//        return mensagem;
//    }
