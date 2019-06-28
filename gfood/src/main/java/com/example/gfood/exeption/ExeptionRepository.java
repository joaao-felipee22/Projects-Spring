package com.example.gfood.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExeptionRepository extends Exception {

    public ExeptionRepository (String massage){
        super(massage);
    }
}
