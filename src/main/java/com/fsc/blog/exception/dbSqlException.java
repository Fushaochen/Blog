package com.fsc.blog.exception;

/**
 * ClassName:dbSqlException
 * Package:com.fsc.blog.exception
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 16:49
 * @Version: v1.0
 */
public class dbSqlException extends RuntimeException{
    private String msg;

    public dbSqlException(String msg){
        super(msg);
        this.msg = msg;
    }
}
