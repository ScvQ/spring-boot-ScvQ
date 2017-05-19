package cn.spiderpig.demo.domain;

public enum ErrorCodeEnum {

    SUCCESS(0, "test success"), UNKOWN_ERROR(-1, "unkown error");

    private Integer code;

    private String msg;

    private ErrorCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
