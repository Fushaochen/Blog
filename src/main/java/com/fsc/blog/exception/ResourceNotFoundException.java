package com.fsc.blog.exception;

/**
 * ClassName:ResourceNotFoundException
 * Package:com.fsc.blog.exception
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 14:59
 * @Version: v1.0
 */
public class ResourceNotFoundException extends RuntimeException{

    private String msg;

    public ResourceNotFoundException(String msg){
        super(msg);
        this.msg = msg;
    }
}
