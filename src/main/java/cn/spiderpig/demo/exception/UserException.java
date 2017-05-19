package cn.spiderpig.demo.exception;

import cn.spiderpig.demo.domain.ErrorCodeEnum;

public class UserException extends RuntimeException {

    private Integer code;

    public UserException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.code = errorCodeEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
