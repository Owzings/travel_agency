package fr.lernejo.travelsite;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private final List<User> listUser = new ArrayList<User>();

    public List<User> getUser() {
        return listUser;
    }

    public void addUser(User user) {
        listUser.add(user);
    }

    public User getUserFromUserName(String userName) {
        return listUser.stream().filter(user -> user.getUserName().equals(userName)).findFirst().get();
    }
}
