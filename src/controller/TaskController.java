package controller;

import dao.TaskDAO;
import model.Task;
import java.util.List;

public class TaskController {
    private TaskDAO taskDAO;

    public TaskController(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    public void addTask(String title, String description) {
        taskDAO.addTask(new Task(title, description));
    }

    public List<Task> listTasks() {
        return taskDAO.listTasks();
    }

    public void marcarComoConcluida(int index) {
        taskDAO.marcarComoConcluida(index);
    }
}