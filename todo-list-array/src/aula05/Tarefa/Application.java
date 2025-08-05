package aula05.Tarefa;


import java.time.LocalDate;

//TAREFA 30/7
//Crie uma classe Usuario com os atributos: nome, email. Cada Tarefa deve estar associada a um Usuario.
//Faça os ajustes na classe Tarefa, se necessário, e adicione uma funcionalidade para listar todas as Tarefas de um Usuario

class Task {

    private String descricao;
    private LocalDate date;
    private boolean concluido;
    private User user;


    public Task(String descricao, LocalDate date, boolean concluido, User user) {
        this.descricao = descricao;
        this.date = date;
        this.concluido = concluido;
        this.user = user;
        user.adicionarTask(this);

    }

    public String getDescricao() {

        return descricao;
    }


    public LocalDate getDate() {

        return date;
    }


    public boolean isConcluido() {

        return concluido;
    }




    @Override
    public String toString() {
        String status = "";
        if (concluido = true) {
            status = "sim";
        } else {
            status = "não";
        }
        return ("Tarefa: " + descricao + " | Data do evento: " + date + " | Concluida? " + status + "\n");


    }
}


public class Application {
    public static void main(String[] args) {

        User joao = new User("Joao", "joao@email.com");
        User bruna = new User("Bruna", "bruna@email.com");

        Task tarefa1 = new Task("Ir a academia", LocalDate.of(2025, 7, 25), true, joao);

        Task tarefa2 = new Task("Limpar a casa", LocalDate.of(2025, 7, 05), false, bruna);

        Task tarefa3 = new Task("Fazer café", LocalDate.of(2025, 7, 27), true, bruna);

        Task tarefa4 = new Task("Estudar java", LocalDate.of(2025, 8, 21), true, joao);

        joao.listarTasks();


    }
}
