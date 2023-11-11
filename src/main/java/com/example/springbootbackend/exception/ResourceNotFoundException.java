package com.example.springbootbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * リソースが見つからない場合はAPIレイヤーから例外をスローする
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
