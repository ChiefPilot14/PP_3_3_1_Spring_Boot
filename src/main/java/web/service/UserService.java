package web.service;

import web.dao.UserDao;
import web.model.User;

import java.util.List;



public interface UserService {
    final UserDao userDao = null;

    public void createUser(User user);

    public void updateUser(User user);

    void deleteUser(long id);

    public User getUserOrCreateIfNotExists(long id);

    List<User> getAllUsers();

}
