package com.example.regisrty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.regisrty.model.SkillRegister;
import com.example.regisrty.model.UserInfo;
import com.example.regisrty.repository.SkillRepository;
import com.example.regisrty.repository.UserRepository;
import com.example.regisrty.service.RegisryService;

@Service
public class RegisryServiceImpl implements RegisryService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SkillRepository skillRepository;
	
	@Override
	public List<UserInfo> saveUser(List<UserInfo> users) {
		
		for(UserInfo u:users) {
			u.getSkillRegister().forEach(s->{
				s.setUserinfo(u);
			});	
		}
		return userRepository.saveAll(users);
	}

	@Override
	public List<SkillRegister> findByInfoUserName(String name) {
		return skillRepository.findByUserinfoUserName(name);
	}

	@Override
	public List<SkillRegister> findByInfoUserType(String type) {
		return skillRepository.findByUserinfoUserType(type);
	}


	@Override
	public List<UserInfo> findAllUserBySkillUsingQuery(String skill) {
		return userRepository.findallUserbySkill(skill);
	}

	@Override
	public List<UserInfo> findAllUserByDeptUsingQuery(String dept) {
		return userRepository.findallUserbyDept(dept);
	}
	
	@Override
	public List<UserInfo> findAllUserBySkillAndValueUsingQuery(String skill,String value) {
		return userRepository.findallUserbySkillNameAndValue(skill,value);
	}
	

}
