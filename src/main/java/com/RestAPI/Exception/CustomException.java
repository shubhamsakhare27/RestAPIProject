package com.RestAPI.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CustomException extends RuntimeException{


    private HttpStatus httpStatus=HttpStatus.BAD_REQUEST;


    public HttpStatus CustomException(ResponseEntity<Object> objectResponseEntity) {
        return httpStatus;

    }

    private HttpStatus getHttpStatus() {
        return httpStatus;
    }


    public CustomException(HttpStatus httpStatus, String message) {

        super(message);
        this.httpStatus = httpStatus;
    }



}
