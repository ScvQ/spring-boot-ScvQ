package cn.spiderpig.demo.util;

import cn.spiderpig.demo.domain.ErrorCodeEnum;
import cn.spiderpig.demo.domain.Result;

public class ResultUtil {

    public static Result success(Object object) {
        Result<Object> result = new Result<Object>();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result<Object> result = new Result<Object>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(ErrorCodeEnum errorCodeEnum) {
        Result<Object> result = new Result<Object>();
        result.setCode(errorCodeEnum.getCode());
        result.setMsg(errorCodeEnum.getMsg());
        return result;
    }

}
