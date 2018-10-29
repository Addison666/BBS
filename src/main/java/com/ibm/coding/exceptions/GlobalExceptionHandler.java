package com.ibm.coding.exceptions;



import com.ibm.coding.util.JsonResponse;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.BindException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(RunTimeException.class)
    @ResponseStatus(HttpStatus.OK)
    public JsonResponse handlerException(RunTimeException e) {
        return new JsonResponse(e.getMessage(), e.getCode());
    }

}
