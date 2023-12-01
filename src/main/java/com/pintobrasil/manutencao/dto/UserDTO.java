package com.pintobrasil.manutencao.dto;

import com.pintobrasil.manutencao.entity.User;

public class UserDTO {
	
	private Long id;
	private String user;
	private String email;
	
	public UserDTO(Long id, String user, String email) {
		this.id = id;
		this.user = user;
		this.email = email;
	}
	
	public UserDTO (User entity) {
		id = entity.getId();
		user = entity.getUser();
		email = entity.getEmail();
	}
	public Long getId() {
		return id;
	}
	public String getUser() {
		return user;
	}
	public String getEmail() {
		return email;
	}	
}
	
