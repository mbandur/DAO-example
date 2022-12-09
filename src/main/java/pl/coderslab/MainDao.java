package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        System.out.println("\nuserDao.create(user1):");
        User user1 = new User();
        user1.setUserName("name1");
        user1.setEmail("email1@coderslab.pl");
        user1.setPassword("password");
        userDao.create(user1);

        System.out.println("\nuserDao.create(user2):");
        User user2 = new User();
        user2.setUserName("name2");
        user2.setEmail("email2@coderslab.pl");
        user2.setPassword("password");
        userDao.create(user2);

        System.out.println("\nuserDao.create(user3):");
        User user3 = new User();
        user3.setUserName("name3");
        user3.setEmail("email2@coderslab.pl");
        user3.setPassword("password");
        userDao.create(user3);

        System.out.println("\nuserDao.read():");
        System.out.println("userDao.read(1): " + userDao.read(1));
        System.out.println("userDao.read(2): " + userDao.read(2));
        System.out.println("userDao.read(91): " + userDao.read(91));

        System.out.println("\nuserDao.update():");
        User user1ToUpdate = userDao.read(1);
        user1ToUpdate.setUserName("name11");
        user1ToUpdate.setEmail("email11@coderslab.pl");
        user1ToUpdate.setPassword("password11");
        userDao.update(user1ToUpdate);
        System.out.println("userDao.read(1): " + userDao.read(1));

        System.out.println("\nuserDao.delete():");
        userDao.delete(2);
        System.out.println("userDao.read(2): " + userDao.read(2));

        System.out.println("\nuserDao.findAll():");
        User[] allUsers = userDao.findAll();
        for (User user : allUsers) {
            System.out.println(user);
        }
    }
}