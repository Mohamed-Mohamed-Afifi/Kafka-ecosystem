package com.ecomm.handler.customExceptions;

public class RecordNotFound extends RuntimeException{
    public RecordNotFound(String message) {
        super(message);
    }
}
