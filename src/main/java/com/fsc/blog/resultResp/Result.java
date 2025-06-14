package com.fsc.blog.resultResp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName:Result
 * Package:com.fsc.blog.resultResp
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/14 - 15:48
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    /**
     * 返回成功，不带数据
     */
    public static <T> Result<T> ok(){
        Result<T> resp = new Result<>();
        resp.setCode(Code.SUCCESS.getCode());
        resp.setMsg(Code.SUCCESS.getMessage());
        return resp;
    }

    /**
     * 返回成功 带数据体
     */

    public static <T> Result<T> ok(T data){
        Result<T> resp = new Result<>();
        resp.setMsg(Code.SUCCESS.getMessage());
        resp.setCode(Code.SUCCESS.getCode());
        resp.setData(data);
        return resp;
    }

    /**
     * 返回失败
     */
    public static <T> Result<T> fail(){
        Result<T> resp = new Result<>();
        resp.setMsg(Code.INTERNAL_FAIL.getMessage());
        resp.setCode(Code.INTERNAL_FAIL.getCode());
        return resp;
    }

    public static <T> Result<T> fail(Integer errorCode, String errorMessage){
        Result<T> resp = new Result<>();
        resp.setMsg(errorMessage);
        resp.setCode(errorCode);
        return resp;
    }

}
