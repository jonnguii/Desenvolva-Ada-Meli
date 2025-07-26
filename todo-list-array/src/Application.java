import java.time.LocalDate;
import java.util.ArrayList;



public class Application {
    public static void main(String[] args) {

//        String[] todolist = new String[10];
//
//        todolist[0] = "Ir a academia";
//        todolist[1] = "Limpar a casa";
//        todolist[2] = "Fazer café";
//        todolist[3] = "Estudar java";
//
//        for (int i = 0; i < todolist.length; i++ ) {
//            if (todolist[i] != null) {
//
//            }
//        }


        ArrayList<Tarefas> todolist = new ArrayList<>();


        Tarefas tarefa1 = new Tarefas(
                "Ir a academia",
                LocalDate.of(2025, 07, 25),
                true
        );

        Tarefas tarefa2 = new Tarefas(
                "Limpar a casa",
                LocalDate.of(2025, 07, 25),
                false
        );

        Tarefas tarefa3 = new Tarefas(
                "Fazer café",
                LocalDate.of(2025, 07, 25),
                true

        );

        Tarefas tarefa4 = new Tarefas(
                "Estudar java",
                LocalDate.of(2025, 07, 25),
                true
        );

todolist.add(tarefa1);
todolist.add(tarefa2);
todolist.add(tarefa3);
todolist.add(tarefa4);


        for (int i = 0; i < todolist.size(); i++) {
            Tarefas tarefa = todolist.get(i);
            System.out.println(i + 1 + " - " + tarefa);
        }

        }

    }

