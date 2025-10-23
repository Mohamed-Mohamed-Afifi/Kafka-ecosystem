package com.ecomm.handler.handlers;

import com.ecomm.handler.customExceptions.RecordNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ErrorsHander {

    @ExceptionHandler(RecordNotFound.class)
    public ResponseEntity<Map<String,String>> handelRecordNotFound(Exception ex){
        HashMap<String,String> errorRes=new HashMap<>();
        errorRes.put("Error Massege", ex.getMessage());
        errorRes.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorRes);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,String>> handelGeneralException(Exception ex){
        HashMap<String,String> errorRes=new HashMap<>();
        errorRes.put("Error Massege", ex.getMessage());
        errorRes.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorRes);
    }

}
