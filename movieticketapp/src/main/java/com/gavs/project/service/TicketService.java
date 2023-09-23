package com.gavs.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gavs.project.model.Ticket;
import com.gavs.project.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	public Ticket buyTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}
	public List<Ticket> getTickets(){
		List<Ticket>ticketList=ticketRepository.findAll();
		return ticketList;
	}
	public Ticket getTicket(int id) {
		Optional<Ticket>found=ticketRepository.findById(id);
		Ticket ticket=found.get();
		return ticket;
	}
	public Ticket changeTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}
	public void deleteTicket(int id) {
		 ticketRepository.deleteById(id);
		 System.out.println("The ticket is deleted with the id"+id);
	}
	
}
