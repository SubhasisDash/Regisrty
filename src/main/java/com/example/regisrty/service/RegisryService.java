package com.example.regisrty.service;

import java.util.List;

import com.example.regisrty.model.SkillRegister;
import com.example.regisrty.model.UserInfo;

public interface RegisryService {
	List<UserInfo> saveUser(List<UserInfo> users);
	
	List<SkillRegister> findByInfoUserName(String name);
	
	List<SkillRegister> findByInfoUserType(String type);
	
	List<UserInfo> findAllUserBySkillUsingQuery(String skill);
	
	List<UserInfo> findAllUserByDeptUsingQuery(String dept);

	List<UserInfo> findAllUserBySkillAndValueUsingQuery(String skill, String value);
	
}
