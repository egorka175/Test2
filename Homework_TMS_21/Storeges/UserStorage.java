package by.tms.Homework_TMS_21.Storeges;

import by.tms.Homework_TMS_21.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserStorage {
    private static List<User> userList = new ArrayList<>();

    public void save(User user){
        userList.add(user);
    }

    public User getByUsername(String username){
        for (User user : userList) {
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    public boolean existByUsername(String username){
        for (User user : userList) {
            if (user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
}

