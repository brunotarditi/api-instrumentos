package com.brunotarditi.api.instrumentos.myexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class InstrumentoNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(InstrumentoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String instrumentoNoEncontrado(InstrumentoException ex){
        return ex.getMessage();
    }
}
