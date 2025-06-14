package com.fsc.blog.advice;

import com.fsc.blog.resultResp.ErrorResponse;
import com.fsc.blog.exception.ResourceNotFoundException;
import com.fsc.blog.exception.dbSqlException;
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
    public ResponseEntity<ErrorResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
        ErrorResponse errorResponse = new ErrorResponse(404, ex.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(dbSqlException.class)
    public ResponseEntity<ErrorResponse> handlerResourceNotFoundException(dbSqlException ex){
        ErrorResponse errorResponse = new ErrorResponse(409, ex.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }
}
