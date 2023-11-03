package com.nebula.exception;

import org.springframework.stereotype.Component;


public class NotFoundException extends RuntimeException{

    public NotFoundException(String msg){
        super(msg);
    }
}
