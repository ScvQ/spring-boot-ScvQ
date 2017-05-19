package cn.spiderpig.demo.validater;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class Uservalidater implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        // TODO Auto-generated method stub

    }

}
