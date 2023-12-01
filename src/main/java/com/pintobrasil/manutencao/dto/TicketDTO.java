package com.pintobrasil.manutencao.dto;

import com.pintobrasil.manutencao.entity.Ticket;

public class TicketDTO {
	
	private Long id;
	private UserDTO user;
	private String status;
	private String urgencia;
	private String descricao;
	private DepartmentDTO departamento;

	public TicketDTO(Long id, UserDTO user, String status, String urgencia, String descricao,
			DepartmentDTO departamento) {
		this.id = id;
		this.user = user;
		this.status = status;
		this.urgencia = urgencia;
		this.descricao = descricao;
		this.departamento = departamento;
	}
	
	public TicketDTO(Ticket entity) {
		id = entity.getId();
		user = new UserDTO(entity.getRequisitante());
		status = entity.getStatus();
		urgencia = entity.getUrgencia();
		descricao = entity.getDescricao();
		departamento = new DepartmentDTO(entity.getDepartamento());
		
	}
	
	public Long getId() {
		return id;
	}
	public UserDTO getUser() {
		return this.user;
	}
	public String getStatus() {
		return status;
	}
	public String getUrgencia() {
		return urgencia;
	}
	public String getDescricao() {
		return descricao;
	}

	public DepartmentDTO getDepartamento() {
		return departamento;
	}
	
	
}
