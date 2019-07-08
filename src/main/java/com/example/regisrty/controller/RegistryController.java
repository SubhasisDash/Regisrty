package com.example.regisrty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.regisrty.model.SkillRegister;
import com.example.regisrty.model.UserInfo;
import com.example.regisrty.service.RegisryService;


@RestController
@RequestMapping("/registry")
public class RegistryController {

	@Autowired
	RegisryService regisryService;
	
	@PostMapping("/save")
	public ResponseEntity<List<UserInfo>> saveFileData(@RequestBody List<UserInfo> users) {
		return new ResponseEntity<List<UserInfo>>(regisryService.saveUser(users), HttpStatus.OK);
		
	}
	
	@GetMapping("/skillbyname")
	public ResponseEntity<List<SkillRegister>> getSkillByNameDetails(String name) {
	
		return new ResponseEntity<>(regisryService.findByInfoUserName(name), HttpStatus.OK);
	}
	
	@GetMapping("/skillbytype")
	public ResponseEntity<List<SkillRegister>> getSkillByTypeDetails(String type) {
		
		return new ResponseEntity<>(regisryService.findByInfoUserType(type), HttpStatus.OK);
	}
	
	@GetMapping("/gelalluserbydept")
	public ResponseEntity<List<UserInfo>> getalluserbydept(String dept) {
		return new ResponseEntity<>(regisryService.findAllUserByDeptUsingQuery(dept), HttpStatus.OK);
	}
	
	@GetMapping("/gelalluserbyskill")
	public ResponseEntity<List<UserInfo>> getalluserbyskill(String skill) {
		return new ResponseEntity<>(regisryService.findAllUserBySkillUsingQuery(skill), HttpStatus.OK);
	}
	
	
	@GetMapping("/gelalluserbyskillandvalue")
	public ResponseEntity<List<UserInfo>> getalluserbyskill(String skill,String value) {
		return new ResponseEntity<>(regisryService.findAllUserBySkillAndValueUsingQuery(skill,value), HttpStatus.OK);
	}
	

	@GetMapping("/test")
	public ResponseEntity<String> getDetails() {
		
		return new ResponseEntity<>("Hello GG", HttpStatus.OK);
	}
	
}
