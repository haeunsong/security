package net.skhu.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

	int id;
	String loginName;
	String password;
	String name;
	String email;
	boolean enabled;
	String userType;
	Integer departmentId; // int 로 하면 null 값을 넣을 수 없으므로 Integer 로 한다.
	
}
