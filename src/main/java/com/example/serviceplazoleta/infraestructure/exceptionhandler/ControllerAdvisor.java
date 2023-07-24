package com.example.serviceplazoleta.infraestructure.exceptionhandler;

import com.amazonaws.services.migrationhubrefactorspaces.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
//@ControllerAdvice
@RestControllerAdvice
public class ControllerAdvisor {

//    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Map<String,String> handleValidateException(MethodArgumentNotValidException ex){
//        Map<String,String> errors=new HashMap<String,String >();
//        ex.getBindingResult().getAllErrors().forEach((error)->{
//            String fielName=((FieldError)error).getField();
//            String message=error.getDefaultMessage();
//            errors.put(fielName,message);
//        });
//        return errors;
//    }
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorResponse handleRuntimeException(RuntimeException ex) {
        return new ErrorResponse();
    }
}
