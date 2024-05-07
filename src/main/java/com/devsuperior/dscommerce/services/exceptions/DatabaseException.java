package com.devsuperior.dscommerce.services.exceptions;

public class DatabaseException extends RuntimeException{ //nao exige o try catch

    public DatabaseException(String msg){
        super(msg);
    }
    
}