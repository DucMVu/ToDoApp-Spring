package ducvu.demo.repositories;

import ducvu.demo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAll();
    Task getById(Long id);
    void delete(Task task);

    @Query
    ("SELECT t FROM Task t WHERE t.task LIKE %:searchTerm%")
    List<Task> search(String searchTerm);
}
