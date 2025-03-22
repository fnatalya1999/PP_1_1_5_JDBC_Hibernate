package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {

        Util.getSessionFactory();

        UserDao daoHibernateImpl = new UserDaoHibernateImpl();
        daoHibernateImpl.createUsersTable();

        daoHibernateImpl.saveUser("natalia", "faritova", (byte) 30);
        daoHibernateImpl.saveUser("natalia1", "faritova1", (byte) 31);
        daoHibernateImpl.saveUser("natalia2", "faritova2", (byte) 32);
        daoHibernateImpl.saveUser("natalia3", "faritova3", (byte) 33);

        daoHibernateImpl.removeUserById(2);
        daoHibernateImpl.getAllUsers();
        daoHibernateImpl.cleanUsersTable();
        daoHibernateImpl.dropUsersTable();
    }
}

