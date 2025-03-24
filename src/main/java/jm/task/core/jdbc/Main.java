package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {

        Util.getSessionFactory();

        UserService service = new UserServiceImpl();
        service.createUsersTable();

        service.saveUser("natalia", "faritova", (byte) 30);
        service.saveUser("natalia1", "faritova1", (byte) 31);
        service.saveUser("natalia2", "faritova2", (byte) 32);
        service.saveUser("natalia3", "faritova3", (byte) 33);

        service.removeUserById(2);
        service.getAllUsers();
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}

