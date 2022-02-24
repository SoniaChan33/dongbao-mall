package com.msb.dongbao.common.base.enums;

import lombok.Data;

/**
 * 100-199: 用户业务的。
 * 200-299: 支付业务的。
 * 依次类推。上面是例子。
 * @author 马士兵教育:chaopengfei
 * @date 2021/1/12
 */
public enum StateCodeEnum {

    /**
     * 请求成功
     */
    SUCCESS(200,"请求成功"),


    /**
     * 请求失败
     */
    FAIL(200,"请求失败");


    private  int code;
    private String msg;


    StateCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
