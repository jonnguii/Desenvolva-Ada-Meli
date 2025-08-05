package aula06.Desafio2;

//DESAFIO 2
//Além do Usuario "dono" da Tarefa, permita adicionar convidados à Tarefa, ou seja, outros Usuarios
//Verifique se há conflitos na agenda do Usuario principal ou dos convidados. Caso haja, lance uma exceção, mas sem encerrar o programa.

import org.w3c.dom.ls.LSOutput;

import java.io.FilterOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args) {


        User joao = new User("joao", "joao@email.com");
        User natalia = new User("natalia", "nat@email.com");
        User Pedro = new User("Pedro", "pedro@email.com");
        User Jesse = new User("Jesse", "jesse@email.com");

        Task task1 = new Task("Comprar creme pra cabelo", LocalDate.of(2025, 7, 21), false, joao);
        Task task2 = new Task("Pagar wifi", LocalDate.of(2025, 7, 21), false, joao);
        Task task3 = new Task("Buscar encomenda", LocalDate.of(2025, 7, 22), false, joao);
        Task task4 = new Task("Correr", LocalDate.of(2025, 7, 22), false, natalia);



        try {
            System.out.println("Criando task 1 do usuario " + joao.getNome() + "...");
            joao.adicionarTask(task1);

            System.out.println("Convidando usuario pra task 1 de " + joao.getNome() + "...");
            task1.adicionarConvidados(natalia);
        } catch (ConflitoTarefaException c) {
            System.out.println(">>> Erro: " + c.getMessage());
        }


        System.out.println("---------------------------------------------------------------------");

        try {
            System.out.println("Criando task 2 do usuario " + natalia.getNome() + "...");
            natalia.adicionarTask(task2);

            System.out.println("Convidando usuario pra task 2 de " + natalia.getNome() + "...");
            task2.adicionarConvidados(joao);

        } catch (ConflitoTarefaException c) {
            System.out.println("Erro: " + c.getMessage());
        }

        System.out.println("---------------------------------------------------------------------");
        try {
        System.out.println("# Criando task2 do Jesse...");
        Jesse.adicionarTask(task2);
        System.out.println("# Convidando joao para task2...");
        task2.adicionarConvidados(joao);
    } catch (ConflitoTarefaException e) {
        System.out.println(">> Erro: " + e.getMessage());
    }

    }
}

class Task {

    private String descricao;
    private LocalDate date;
    private boolean concluido;
    public User dono;
    public List<User> convidados = new ArrayList<>();


    public Task(String descricao, LocalDate date, boolean concluido, User dono) {
        this.descricao = descricao;
        this.date = date;
        this.concluido = concluido;
        this.dono = dono;

    }

    public void adicionarConvidados(User convidado) {
        this.convidados.add(convidado);
        convidado.adicionarTask(this);
        System.out.println("Convidado adicionado com sucesso! Usuario: " + convidado.getNome());
    }

    public boolean isConcluido() {
        return concluido;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        String status = concluido ? "sim" : "não";
        return "Tarefa: " + descricao + " | " + "Data: " + date + " | " + "Concluida? " + status + " | " + "Dono da tarefa: " + dono.getNome() + " email: " + dono.getEmail() + " | Convidados: " + convidados;
    }
}

class User {
    private String nome;
    private String email;
    public List<Task> tasks = new ArrayList<>();

    public User(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }


    public void adicionarTask(Task tarefaNova) {
        for (Task t : tasks) {
            if (!t.isConcluido() && t.getDate().isEqual(tarefaNova.getDate())) {
                if (tarefaNova.convidados.contains(this)) {
                    tarefaNova.convidados.remove(this);
                    System.out.println("Convidado removido por conflito!");
                }
                throw new ConflitoTarefaException("Conflito nas tarefas do " + this + ". Entre: " + t.getDescricao() + " - não concluída e nova tarefa: " + tarefaNova.getDescricao());

            }

        }
        tasks.add(tarefaNova);
        System.out.println("Tarefa adicionada com sucesso! " + tarefaNova);

    }


    public void listarTasks() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("O usuario " + this.getNome() + " possui as seguintes tarefas: ");
        tasks.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public void listarTasksDono() {
        int count = 0;
        for (Task t : tasks) {
            if (t.dono.equals(this)) {
                count++;

            }

        }

        if (count == 0) {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Este usuário não é dono de nenhuma tarefa");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("O usuario " + this.getNome() + " possui as seguintes tarefas: ");
            tasks.forEach(System.out::println);
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
    }

    @Override
    public String toString() {
        return "User: " + nome + ", email: " + email;
    }
}

class ListarConflitoException extends RuntimeException {
    public ListarConflitoException(String mensagemFormatada) {
        super(mensagemFormatada);
    }
}

class ConflitoTarefaException extends RuntimeException {

    public ConflitoTarefaException(String mensagemFormatada) {
        super(mensagemFormatada);
    }
}


//pra gerenciar os conflitos dos convidados, antes de adicionar na lista, verifico se ele nao tem uma tarefa na mesma data (adicionado por outro usuario dono)
//logica pra se a data da tarefa estiver igual a de outra

// pra gerenciar os conflitos do dono, preciso