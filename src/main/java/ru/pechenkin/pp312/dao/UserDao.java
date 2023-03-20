package ru.pechenkin.pp312.dao;



import ru.pechenkin.pp312.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User updateUser);

    void removeUserById(Long id);

    List<User> getAllUsers();

    User getUserById(Long id);

}
