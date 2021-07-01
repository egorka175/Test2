package by.tms.Homework_TMS_21.Services;

import by.tms.Homework_TMS_21.Storeges.UserStorage;
import by.tms.Homework_TMS_21.entity.User;

import java.util.List;
import java.util.Optional;

public class UserService {
    private final UserStorage userStorage = new UserStorage();

    public boolean add(User user) {
        if (userStorage.existByUsername(user.getUsername())) {
            return false;
        } else {
            userStorage.save(user);
            return true;
        }
    }

    public User findByUsername(String username) {
        if (userStorage.existByUsername(username)) {
            return (User) userStorage.getByUsername(username);
        }
        return null;
    }
}