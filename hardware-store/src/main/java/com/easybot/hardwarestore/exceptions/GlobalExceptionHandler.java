package com.easybot.hardwarestore.exceptions;

import com.easybot.hardwarestore.api.dto.response.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDTO> handleException(Exception e) {
        return new ResponseEntity<>(new ResponseDTO(String.join(": ", e.getClass().getSimpleName(), e.getMessage())), INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ProjectException.class)
    public ResponseEntity<ResponseDTO> handleProjectException(ProjectException e) {
        return new ResponseEntity<>(new ResponseDTO(e.getMessage()), BAD_REQUEST);
    }
}
