package com.example.regisrty.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFound extends Exception {

	 public RecordNotFound(String exception) {
	        super(exception);
	    }
}
