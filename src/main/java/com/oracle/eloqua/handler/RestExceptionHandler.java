package com.oracle.eloqua.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.oracle.eloqua.controller.EmailController;
import com.oracle.eloqua.exception.EntityNotFoundException;
import com.oracle.eloqua.exception.ApiException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import org.springframework.http.ResponseEntity;



@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{
	
	private static final Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);
	
	/**
     * Handles EntityNotFoundException. Created to encapsulate errors with more detail than javax.persistence.EntityNotFoundException.
     *
     * @param ex the EntityNotFoundException
     * @return the ApiException object
     */
    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException ex) {
        ApiException apiException = new ApiException(NOT_FOUND);
        apiException.setMessage(ex.getMessage());
        return buildResponseEntity(apiException);
    }
    
    private ResponseEntity<Object> buildResponseEntity(ApiException apiException) {
        return new ResponseEntity<>(apiException, apiException.getStatus());
    }

}
