package com.ttn.RestAssignment.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    static List<User> userList=new ArrayList<>();
    static {
        userList.add(new User("tarun","tarun@123",56,"banaras"));
        userList.add(new User("ayush","ayush@123",56,"galgotia"));
        userList.add(new User("abhishek","abhishek@123",56,"jabalpur"));

    }
    public User saveUser(User user) {
        userList.add(user);

        return user;
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
