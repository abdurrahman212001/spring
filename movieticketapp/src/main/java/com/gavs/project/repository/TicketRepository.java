package com.gavs.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gavs.project.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer>{

}
