package view;

import controller.TaskController;
import dao.TaskDAOImpl;
import java.util.Scanner;

public class TaskView {
    private TaskController controller;
    private Scanner scanner;

    public TaskView() {
        controller = new TaskController(new TaskDAOImpl());
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int option;
        do {
            System.out.println("\n1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar como Concluída");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1 -> addTask();
                case 2 -> listTasks();
                case 3 -> marcarComoConcluida();
            }
        } while (option != 0);
    }

    private void addTask() {
        System.out.print("Título: ");
        String title = scanner.nextLine();
        System.out.print("Descrição: ");
        String description = scanner.nextLine();
        controller.addTask(title, description);
    }

    private void listTasks() {
        var tasks = controller.listTasks();
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + " - " + tasks.get(i));
            }
        }
    }

    private void marcarComoConcluida() {
        System.out.print("Número da tarefa: ");
        int index = scanner.nextInt();
        controller.marcarComoConcluida(index);
    }

    public static void main(String[] args) {
        new TaskView().displayMenu();
    }
}
