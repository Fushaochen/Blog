package com.fsc.blog.exception;

import com.fsc.blog.resultResp.Code;
import lombok.Getter;

/**
 * ClassName:dbSqlException
 * Package:com.fsc.blog.exception
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 16:49
 * @Version: v1.0
 */
@Getter
public class dbSqlException extends RuntimeException{
    private final String errorMsg;
    private final Integer errorCode;

    public dbSqlException(Code code){
        super(code.getMessage());
        this.errorMsg = code.getMessage();
        this.errorCode = code.getCode();
    }
}
