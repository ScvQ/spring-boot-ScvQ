package cn.spiderpig.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.spiderpig.demo.domain.ErrorCodeEnum;
import cn.spiderpig.demo.domain.User;
import cn.spiderpig.demo.exception.UserException;
import cn.spiderpig.demo.repository.UserRepository;
import cn.spiderpig.demo.service.UserService;

@Service
@Transactional
public class UserServcieImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Integer id) {
        return userRepository.findOne(id);
    }

    @Override
    public User addUser(User user) {
        
        if("admin".equals(user.getUsername())){
            throw new UserException(ErrorCodeEnum.SUCCESS);
        }
        
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.delete(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

}
