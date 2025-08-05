package aula03;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] todolist = new String[4];

        todolist[0] = "Ir a academia";
        todolist[1] = "Limpar a casa";
        todolist[2] = "Fazer café";
        todolist[3] = "Estudar java";

        int j = 0;

        for (int i = 0; i < todolist.length; i++) {
            System.out.println(todolist[i]);
            if (todolist[i] != null) {
                j++;
            }
        }

        System.out.println("Digite o nome da tarefa: ");
        String nomeTarefa = scanner.nextLine();
        boolean encontrado = false;

        for (int k = 0; k < todolist.length; k++) {
            if (todolist[k].equalsIgnoreCase(nomeTarefa )) {
                System.out.println("Tarefa encontrada na posição " + k);
                encontrado = true;
            }

            }
        if (!encontrado)  {
            System.out.println("Tarefa não encontrada"); //criado pq o else so rodaria dentro do loop, o que imprimiria muitas mensagens
        }

        System.out.println("Voce tem: " + j + " tarefas cadastradas");
    }
}
