package taskSpringPlusHibernate.dao;

import taskSpringPlusHibernate.model.User;

import java.util.List;

public interface UserDao {


    List<User> getAllUsers();

    User getUserById(long id);

    void saveUser(User user);

    void updateUser(User user);

    void removeUserById(long id);


}