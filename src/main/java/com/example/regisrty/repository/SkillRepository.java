package com.example.regisrty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.regisrty.model.SkillRegister;
@Repository
public interface SkillRepository extends JpaRepository<SkillRegister, Long>{

	//@Query("select s from SkillRegister s, UserInfo u where s.userinfo.id=u.id and s.userinfo.id=?")
	List<SkillRegister> findByUserinfoUserName(String name);
	
	List<SkillRegister> findByUserinfoUserType(String type);
	
}
