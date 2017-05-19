package cn.spiderpig.demo.service;

import java.util.List;

import cn.spiderpig.demo.domain.User;

public interface UserService {

    public User getUserById(Integer id);

    public User addUser(User user);

    public List<User> getAllUser();

    public void deleteById(Integer id);

    public User updateUser(User user);

}
