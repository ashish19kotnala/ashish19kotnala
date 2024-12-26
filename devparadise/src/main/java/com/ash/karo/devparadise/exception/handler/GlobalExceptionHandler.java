package com.ash.karo.devparadise.exception.handler;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(Exception.class)
	//@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<Object> handleBadRequest(Exception ex) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(ex.toString(	), ex.getMessage() + " Custom Message ");
		
		//return new ResponseEntity<>("Error occurred",new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
		return ResponseEntity.status(500).body(ex.getMessage());
	}
	

}
