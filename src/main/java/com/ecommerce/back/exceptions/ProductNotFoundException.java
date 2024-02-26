package com.ecommerce.back.exceptions;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message){
        super(message);
    }

}
