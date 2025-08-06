package aula05.Exercicios.AtualizarSenha;

    import java.util.ArrayList;
    import java.util.List;

public class Solution {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Senha123");
        System.out.println(usuario1.alterarSenha("Senha321"));
        System.out.println(usuario1.alterarSenha("Senha111"));
        System.out.println(usuario1.alterarSenha("Senha123"));
        System.out.println(usuario1.alterarSenha("Senha222"));
        System.out.println(usuario1.alterarSenha("Senha123"));


        usuario1.listarSenhas();

    }
}

class Usuario {
    private static List<String> senhas;

    public Usuario(String senhaInicial) {
        this.senhas = new ArrayList<>();
        this.senhas.add(senhaInicial);
    }


    public String alterarSenha(String novaSenha) {
        int inicio = Math.max(0, senhas.size() - 3); //retorna o maior número entre, no caso, o tamanho da lista -3 elementos (ultimos 3)
        for (int i = inicio; i < senhas.size(); i++) {
            if (novaSenha.equalsIgnoreCase(senhas.get(i))) {
                return "Senha não pode ser igual as três últimas utilizadas";
            }

        }
        senhas.add(novaSenha);
        return "Senha alterada com sucesso";
    }


    public void listarSenhas() {
        System.out.println(senhas);
    }
}
