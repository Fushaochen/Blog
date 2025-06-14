package com.fsc.blog.exception;

import com.fsc.blog.resultResp.Code;
import lombok.Data;
import lombok.Getter;

/**
 * ClassName:ResourceNotFoundException
 * Package:com.fsc.blog.exception
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 14:59
 * @Version: v1.0
 */
@Getter
public class ResourceNotFoundException extends RuntimeException{

    private final String errorMsg;
    private final Integer errorCode;

    public ResourceNotFoundException(Code code){
        super(code.getMessage());
        this.errorMsg = code.getMessage();
        this.errorCode = code.getCode();
    }

}
