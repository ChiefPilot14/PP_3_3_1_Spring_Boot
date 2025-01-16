package web.service;

import web.dao.UserDao;
import web.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    final UserDao userDao = null;

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    void saveUserById(long id, String name, String lastName, byte age);

    Optional<User> getUserById(long id);

    List<User> getAllUsers();

    public void addUser(String name, String lastName, byte age);

}
