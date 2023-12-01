package com.pintobrasil.manutencao.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pintobrasil.manutencao.dto.TicketDTO;
import com.pintobrasil.manutencao.services.TicketService;

@RestController
@RequestMapping(value ="/ticket")
public class TicketController {
	
	@Autowired
	private TicketService service;
	
	@PostMapping
	public ResponseEntity<TicketDTO> insert (@RequestBody TicketDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
		
	}

}
