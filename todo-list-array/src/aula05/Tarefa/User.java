package aula05.Tarefa;


import java.util.ArrayList;
import java.util.List;


//TAREFA 30/7
//Crie uma classe Usuario com os atributos: nome, email. Cada Tarefa deve estar associada a um Usuario.
//Faça os ajustes na classe Tarefa, se necessário, e adicione uma funcionalidade para listar todas as Tarefas de um Usuario

public class User {
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

    public void adicionarTask(Task t) {
        tasks.add(t);
    }

    public void listarTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            System.out.println(t);
        }

    }


}


