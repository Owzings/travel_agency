package fr.lernejo.travelsite;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @PostMapping(value = "/api/inscription", consumes = {"application/json"})
    public void createUser(@RequestBody User signUp) {
        userRepository.addUser(signUp);
    }
}
