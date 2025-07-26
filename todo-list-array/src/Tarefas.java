import java.time.LocalDate;

public class Tarefas {

    private String descricao;
    private LocalDate date;
    private boolean concluido;
    String reescritaConcluido;

    public Tarefas(String descricao, LocalDate date, boolean concluido) {
        this.descricao = descricao;
        this.date = date;
        this.concluido = concluido;
        if (concluido == true) {
            reescritaConcluido = "sim";
        } else {
            reescritaConcluido = "não";
        }

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return ("Tarefa: " + descricao + " | Data do evento: " + date + " | Concluida? " + reescritaConcluido);


    }
}
