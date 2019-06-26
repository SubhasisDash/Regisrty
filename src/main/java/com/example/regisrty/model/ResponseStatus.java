package com.example.regisrty.model;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

//@JsonInclude(Include.NON_NULL)
public class ResponseStatus {

	private String message;
	private List<String> details;
	private HttpStatus statusCode;

	public ResponseStatus() {
		super();
	}

	public ResponseStatus(String message, List<String> details, HttpStatus statusCode) {
		super();
		this.message = message;
		this.details = details;
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

}
