package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Svyat", "Pro", (byte) 31);
        userService.saveUser("Tanya", "Pro", (byte) 28);
        userService.saveUser("Dima", "Ivanov", (byte) 35);
        userService.saveUser("Ivan", "Dimov", (byte) 45);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
