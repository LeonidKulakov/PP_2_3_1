package web.dao;

import web.model.User;

import java.util.List;


public interface UserDao {
     List<User> listUsers();
     void add(User user);

     User find(Long id);

     void updateUser(User user);
     void delete(Long id);
}
