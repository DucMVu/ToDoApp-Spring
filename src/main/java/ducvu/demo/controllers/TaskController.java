package ducvu.demo.controllers;

import ducvu.demo.models.SearchDTO;
import ducvu.demo.models.Task;
import ducvu.demo.models.User;
import ducvu.demo.services.TaskService;
import ducvu.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAll());
    }

    @PostMapping("/")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
//        User user = task.getUser();
//        List<Task> taskList = List.of(task);
//        user.addTasks(taskList);
        return ResponseEntity.ok(taskService.createNewTask(task));
    }

    @PutMapping("/addUserToTask/{id}")
    public ResponseEntity<Task> addUserToTask(@PathVariable Long id, @RequestBody Task task, @RequestBody Long userId) {
        User user = userService.findById(userId);
        task.setUser(user);
        return ResponseEntity.ok(taskService.updateTask(task));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        return ResponseEntity.ok(taskService.updateTask(task));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteTask(@PathVariable Long id) {
        Task task = taskService.findById(id);
        taskService.deleteTask(task);
        return ResponseEntity.ok(true);
    }

    @DeleteMapping("/all")
    public ResponseEntity<Boolean> deleteAllTasks() {
        taskService.deleteAll();
        return ResponseEntity.ok(true);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Task>> search(@RequestBody SearchDTO searchDTO) {
        String searchTerm = searchDTO.getSearchTerm();
        return ResponseEntity.ok(taskService.search(searchTerm));
    }
}
