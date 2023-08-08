package com.example.backendwebshopmain.service;


import com.example.backendwebshopmain.repository.UserRepository;
import com.example.backendwebshopmain.model.User;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    private static final String EMAIL_TEST = "test@test.com";

    private static final String ANOTHER_TEST = "admin@test.com";

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByUsername(String username) {
        if (EMAIL_TEST.equalsIgnoreCase(username)) {
            var user = new User();
            user.setId(1L);
            user.setUsername(EMAIL_TEST);
            user.setPassword("$2a$12$B9fsHf7abv.K.j86WuhXk.nOCiZcb7IMbXAeZjQPiwYhkra0vICn2");//test
            user.setRole("ADMIN");
            return Optional.of(user);
        } else if (ANOTHER_TEST.equalsIgnoreCase(username)) {
            var user = new User();
            user.setId(99L);
            user.setUsername(ANOTHER_TEST);
            user.setPassword("$2a$12$B9fsHf7abv.K.j86WuhXk.nOCiZcb7IMbXAeZjQPiwYhkra0vICn2");//test
            user.setRole("USER");
            return Optional.of(user);
        }
        return Optional.empty();
    }
}
