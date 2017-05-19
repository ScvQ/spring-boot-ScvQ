package cn.spiderpig.demo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.spiderpig.demo.domain.ErrorCodeEnum;
import cn.spiderpig.demo.domain.Result;
import cn.spiderpig.demo.exception.UserException;
import cn.spiderpig.demo.util.ResultUtil;

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    /*@ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result ExceptionHandle(Exception e) {
        if (e instanceof UserException) {
            UserException userException = (UserException) e;
            return ResultUtil.error(userException.getCode(), userException.getMessage());
        }
        return ResultUtil.error(ErrorCodeEnum.UNKOWN_ERROR);
    }*/

    @ExceptionHandler(value = UserException.class)
    @ResponseBody
    public Result UserExceptionhandle(UserException e) {
        return ResultUtil.error(e.getCode(), e.getMessage());
    }

}
