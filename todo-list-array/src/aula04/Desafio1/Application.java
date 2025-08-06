package aula04.Desafio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


//DESAFIO 1
//Liste todos as Tarefas ordenados por data e agrupados por conclusão.
//Busque por titulo e data

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Task> todolist = new ArrayList<>();


        Task tarefa1 = new Task("Ir a academia", LocalDate.of(2025, 7, 05), false);
        todolist.add(tarefa1);

        Task tarefa2 = new Task("Limpar a casa", LocalDate.of(2025, 7, 18), false);
        todolist.add(tarefa2);

        Task tarefa3 = new Task("Fazer café", LocalDate.of(2025, 7, 27), true);
        todolist.add(tarefa3);


        Task tarefa4 = new Task("Estudar java", LocalDate.of(2025, 8, 21), true);
        todolist.add(tarefa4);

        Task tarefa5 = new Task("Sair com cao", LocalDate.of(2025, 7, 05), true);
        todolist.add(tarefa5);


        //ORDENAÇÃO POR NAO CONCLUIDAS E CONCLUIDAS


//        final var oldComparator = new Comparator<Task>() {
//            @Override
//            public int compare(Task t1, Task t2) {
//                int status = Boolean.compare(t2.isConcluido(), t1.isConcluido());
//                if (status != 0) return status;
//                return t1.getDate().compareTo(t2.getDate()); //se t1 > t2 (vir depois) = 1. O Java vai organizar por crecente
//            }
//
//        };

        Comparator<Task> comparatorModern = Comparator
                .comparing(Task::isConcluido, Comparator.reverseOrder())        // 1º critério: status (false antes de true)
                .thenComparing(Task::getDate);                                  // 2º critério: data (ordem crescente)


        todolist.sort(comparatorModern);

        for (Task t : todolist) {
            System.out.println(t);
        }


//        BUSCA POR DATA
        System.out.println("-------- INSIRA A DATA PARA BUSCA ex: 0000y-00m-00d--------");
        LocalDate dateBusca = LocalDate.parse(scanner.next());
        System.out.println("-------- TAREFAS DATADAS EM " + dateBusca + ": --------");
        for (Task t : todolist) {
            if (dateBusca.equals(t.getDate())) {
                System.out.println(t);
            }
        }


        //BUSCA POR NOME
        String descBusca = "fazer café";
        System.out.println("-------- BUSCA POR DESCRIÇÃO: " + descBusca + " --------");
        for (Task t : todolist) {
            if (descBusca.equalsIgnoreCase(t.getDescricao())) {
                System.out.println(t);
            }
        }


    }


}


class Task {
    Scanner scanner = new Scanner(System.in);

    private String descricao;
    private LocalDate date;
    private boolean concluido;


    public Task(String descricao, LocalDate date, boolean concluido) {
        this.descricao = descricao;
        this.date = date;
        this.concluido = concluido;

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
        String status = concluido ? "sim" : "não";
        return ("Tarefa: " + descricao + " | Data do evento: " + date + " | Concluida? " + status + "\n");

    }
}
