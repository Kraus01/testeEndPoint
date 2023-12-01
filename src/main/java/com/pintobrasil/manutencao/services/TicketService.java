package com.pintobrasil.manutencao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pintobrasil.manutencao.dto.TicketDTO;
import com.pintobrasil.manutencao.entity.Department;
import com.pintobrasil.manutencao.entity.Ticket;
import com.pintobrasil.manutencao.entity.User;
import com.pintobrasil.manutencao.repositories.DepartmentRepository;
import com.pintobrasil.manutencao.repositories.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	TicketRepository repository;
	
	@Autowired
	DepartmentRepository repositoryDept;
	//**teste
	@Transactional
	public TicketDTO insert (TicketDTO dto) {
		Ticket entity = new Ticket();
		User user = new User();
		user.setId(dto.getUser().getId());
		entity.setStatus(dto.getStatus());
		entity.setUrgencia(dto.getUrgencia());
		entity.setDescricao(dto.getDescricao());
		Department dept = repositoryDept.getReferenceById(dto.getDepartamento().getId());
		entity.setDepartamento(dept);
		entity  = repository.save(entity);
		return new TicketDTO(entity);
	} 

}
