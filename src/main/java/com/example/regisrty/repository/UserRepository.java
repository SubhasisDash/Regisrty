package com.example.regisrty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.regisrty.model.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long>{

	@Query("Select u from UserInfo u, SkillRegister s where s.userinfo.id=u.id and s.department=?1")
	List<UserInfo> findallUserbyDept(String dept);
	
	@Query("Select u from UserInfo u, SkillRegister s where s.userinfo.id=u.id and s.skillName=?1")
	List<UserInfo> findallUserbySkill(String skill);
	
	@Query("Select u from UserInfo u, SkillRegister s where s.userinfo.id=u.id and s.skillName=?1 and s.skillValue=?2")
	List<UserInfo> findallUserbySkillNameAndValue(String skill,String value);
	
}
