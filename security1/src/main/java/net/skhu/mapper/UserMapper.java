package net.skhu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.User;

@Mapper
public interface UserMapper {
	
	// User 테이블에서 loginName 필드로 레코드를 조회하는 메소드다.
	@Select("SELECT * FROM user WHERE loginName=#{loginName}")
	User findByLoginName(String loginName);

}
