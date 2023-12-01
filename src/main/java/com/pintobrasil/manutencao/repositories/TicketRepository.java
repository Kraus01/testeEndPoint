package com.pintobrasil.manutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pintobrasil.manutencao.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
