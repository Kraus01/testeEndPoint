package com.pintobrasil.manutencao.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_tickets")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "requisitante_id")
	private User requisitante;
	@Column(columnDefinition = "TEXT")
	private String status;
	private String urgencia;
	private String descricao;
	
	@ManyToMany
    @JoinTable(
        name = "ticket_tecnico",
        joinColumns = @JoinColumn(name = "ticket_id"),
        inverseJoinColumns = @JoinColumn(name = "tecnico_id")
    )
    private Set<Tecnico> tecnicos = new HashSet<>();
	
	 @ManyToOne
	 @JoinColumn(name = "departamento_id")
	 private Department departamento;
	
	public Ticket () {}

	public Ticket(Long id, User requisitante, String status, String urgencia, String descricao, Department departamento) {
		this.id = id;
		this.requisitante = requisitante;
		this.status = status;
		this.urgencia = urgencia;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getRequisitante() {
		return requisitante;
	}

	public void setRequisitante(User requisitante) {
		this.requisitante = requisitante;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Department getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}

	public Set<Tecnico> getTecnicos() {
		return tecnicos;
	}
	
}
