
package com.Form.demo.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends  ResponseEntityExceptionHandler{
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {FormExceptions.class})
    protected ResponseEntity<Object> handleConflict( 
        FormExceptions ex, WebRequest request){
        String bodyOfReponse = ex.getMesagge();
        return handleExceptionInternal( ex, bodyOfReponse, new HttpHeaders(), ex.getHttpStatus(), request);
    }

}
