package cn.spiderpig.demo.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.spiderpig.demo.domain.Result;
import cn.spiderpig.demo.domain.User;
import cn.spiderpig.demo.service.UserService;
import cn.spiderpig.demo.util.ResultUtil;

@RestController
public class UserResoure {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getOne/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

    /*
     * @GetMapping(value="/getOne") public User
     * getUserById(@RequestParam("id")Integer id){ return
     * userService.getUserById(id); }
     */

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping(value = "/addUser")
    public Result<User> addUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(userService.addUser(user));
    }

    @GetMapping(value = "/delById/{id}")
    public void delById(@PathVariable("id") Integer id) {
        userService.delById(id);
    }

    @PutMapping(value = "/updateUser/{id}")
    public User updateUser(@PathVariable("id") Integer id, @RequestParam("username") String username,
            @RequestParam("password") String password) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        return userService.updateUser(user);
    }

}
