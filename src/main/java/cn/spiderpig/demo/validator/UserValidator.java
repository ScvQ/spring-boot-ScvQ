package cn.spiderpig.demo.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import cn.spiderpig.demo.domain.User;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        User user = (User) target;

        if (user == null) {
            errors.rejectValue("user", "111", "用户名为空");
        }
        if ("root".equals(user.getUsername())) {
            // 参数：第一个为验证的属性名，第二个为errorcode，第三个为返回的信息errormsg
            errors.rejectValue("username", "222", "用户名不能为root");
        }

    }

}
