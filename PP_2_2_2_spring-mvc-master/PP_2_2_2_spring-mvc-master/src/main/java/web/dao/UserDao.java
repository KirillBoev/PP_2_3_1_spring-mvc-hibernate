package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public void save(User user);

    public List<User> showUsers();

    public User getUser(Long id);

    public void delete(Long id);

    public void update(User user);
}
