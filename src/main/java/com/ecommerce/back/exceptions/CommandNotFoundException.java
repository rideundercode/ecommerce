package com.ecommerce.back.exceptions;

public class CommandNotFoundException extends Exception {
    public CommandNotFoundException(String message){
        super(message);
    }
}
