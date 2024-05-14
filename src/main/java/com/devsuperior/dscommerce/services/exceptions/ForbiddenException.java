package com.devsuperior.dscommerce.services.exceptions;

public class ForbiddenException extends RuntimeException{ //nao exige o try catch

    public ForbiddenException(String msg){
        super(msg);
    }
    
}