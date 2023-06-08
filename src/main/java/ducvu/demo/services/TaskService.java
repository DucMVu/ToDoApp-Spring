package ducvu.demo.services;

import ducvu.demo.models.Task;
import ducvu.demo.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createNewTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public Task findById(Long id) {
        return taskRepository.getById(id);
    }

    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }

    public void deleteAll() {
        taskRepository.deleteAll();
    }

    public List<Task> search(String searchTerm) {
        return taskRepository.search(searchTerm);
    }
}
