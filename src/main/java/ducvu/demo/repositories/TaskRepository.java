package ducvu.demo.repositories;

import ducvu.demo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    public List<Task> findAll();
    public Task getById(Long id);
    public void delete(Task task);
}
