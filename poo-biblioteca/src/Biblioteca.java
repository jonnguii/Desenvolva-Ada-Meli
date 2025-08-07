import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livrosList = new ArrayList<>();
    List<Emprestimo> historicoEmprestimosList = new ArrayList<>();
    List<Pessoa> pessoaList = new ArrayList<>();


    public Livro cadastrarLivro(Livro novoLivro) {
        livrosList.add(novoLivro);
        return novoLivro;
    }

    public Pessoa cadastrarPessoa(Pessoa novaPessoa) {
        pessoaList.add(novaPessoa);
        return novaPessoa;
    }

    public Emprestimo realizarEmprestimo(Emprestimo novoEmprestimo) {
        this.historicoEmprestimosList.add(novoEmprestimo);
        return novoEmprestimo;
    }

    public Emprestimo devolverEmprestimo(Emprestimo emprestimoEmAndamento) {

        return emprestimoEmAndamento;
    }
}
