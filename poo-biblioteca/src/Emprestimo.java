import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

    Pessoa pessoa;
    List<Livro> livrosList = new ArrayList<>();
    LocalDate dataInicio;
    LocalDate dataEsperada;
    LocalDate dataDevolucao;


    public Emprestimo(Pessoa pessoa, List<Livro> livrosList) {
        this.pessoa = pessoa;
        this.livrosList = livrosList;
        this.dataInicio = LocalDate.now();
        //TODO calcular a data esperado pra devolucao
    }
}
