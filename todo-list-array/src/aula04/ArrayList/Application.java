package aula04.ArrayList;


import java.time.LocalDate;
import java.util.ArrayList;


class Task {
    private String descricao;
    private LocalDate data;
    private boolean concluido;

    public Task(String descricao, LocalDate data, boolean concluido) {
        this.descricao = descricao;
        this.data = data;
        this.concluido = concluido;

    }

    @Override
    public String toString() {
        String status = concluido ? "sim" : "não";
        return "Tarefa: " + descricao + ", Data: " + data + ", Concluido? " + status;
    }
}


public class Application {
    public static void main(String[] args) {
        ArrayList<Task> todolist = new ArrayList<>();


        Task tarefa1 = new Task(
                "Ir a academia",
                LocalDate.of(2025, 7, 25),
                true
        );

        Task tarefa2 = new Task(
                "Limpar a casa",
                LocalDate.of(2025, 7, 05),
                false
        );

        Task tarefa3 = new Task(
                "Fazer café",
                LocalDate.of(2025, 7, 27),
                true

        );

        Task tarefa4 = new Task(
                "Estudar java",
                LocalDate.of(2025, 8, 21),
                true
        );


        todolist.add(tarefa1);
        todolist.add(tarefa2);
        todolist.add(tarefa3);
        todolist.add(tarefa4);

        // JEITO DIFERENTES DE CRIAR E ADICIONAR UMA TAREFA
        // todolist.add(new Tarefas("ee", LocalDate.of(2025, 7, 28), true)); Adicionamos, criamos um objeto e ja adicionamos os parametros


        // PERCORRER E IMPRIMIR A LISTA UTILIZANDO FOR ENHANCED
//        for (Tasks t : todolist) {
//            System.out.println(t);
//        }

        // PERCORRER E IMPRIMIR A LISTA UTILIZANDO FOR COMUM
        for (int i = 0; i < todolist.size(); i++) {
            Task tarefa = todolist.get(i);
            System.out.println(i + 1 + " - " + tarefa);
        }
    }
}
