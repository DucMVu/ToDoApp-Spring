package ducvu.demo.services;

import ducvu.demo.models.User;
import ducvu.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createNewUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.getById(id);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
