package dao;

	
	import model.Task;
	import java.util.ArrayList;
	import java.util.List;

	public class TaskDAOImpl implements TaskDAO {
	    private List<Task> tasks = new ArrayList<>();

	    @Override
	    public void addTask(Task task) {
	        tasks.add(task);
	    }

	    @Override
	    public List<Task> listTasks() {
	        return tasks;
	    }

	    @Override
	    public void marcarComoConcluida(int index) {
	        if (index >= 0 && index < tasks.size()) {
	            Task task = tasks.get(index);
	            task.setStatus(true);
	        }
	    }
	}

