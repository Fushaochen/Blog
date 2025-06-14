package com.fsc.blog.advice;

import com.fsc.blog.resultResp.ErrorResponse;
import com.fsc.blog.exception.ResourceNotFoundException;
import com.fsc.blog.exception.dbSqlException;
import com.fsc.blog.resultResp.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

/**
 * ClassName:GlobalExceptionHandler
 * Package:com.fsc.blog.advice
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 15:03
 * @Version: v1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public Result<Void> handlerResourceNotFoundException(ResourceNotFoundException ex){
        return Result.fail(ex.getErrorCode(), ex.getMessage());
    }

    @ExceptionHandler(dbSqlException.class)
    public Result<Void> handlerResourceNotFoundException(dbSqlException ex){
        return Result.fail(ex.getErrorCode(), ex.getMessage());
    }
}
