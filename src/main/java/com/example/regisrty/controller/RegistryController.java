package com.example.regisrty.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.regisrty.model.FileRegisterModel;
import com.example.regisrty.model.ResponseStatus;


@RestController
@RequestMapping("/registry")
public class RegistryController {

	@PostMapping("/save")
	public ResponseEntity<ResponseStatus> saveFileData(@RequestBody @Validated FileRegisterModel metadata) {
		
		
		return new ResponseEntity<ResponseStatus>(new ResponseStatus(), HttpStatus.OK);
		
	}
	
}
