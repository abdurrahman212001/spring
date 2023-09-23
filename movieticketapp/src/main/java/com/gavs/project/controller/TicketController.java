package com.gavs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gavs.project.model.Ticket;
import com.gavs.project.service.TicketService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@RequestMapping(value="/buy",method=RequestMethod.POST)
	public Ticket buyTicket(@RequestBody Ticket ticket) {
		return ticketService.buyTicket(ticket);
	}
	
	@RequestMapping(value="/getTickets",method=RequestMethod.GET)
	public List<Ticket> getTickets(){
		return ticketService.getTickets();
	}
	
	@RequestMapping(value="/getTicket/{id}",method=RequestMethod.GET)
	public Ticket getTicket(@PathVariable int id) {
		return ticketService.getTicket(id);
	}
	
	@RequestMapping(value="/changeTickets",method=RequestMethod.PUT)
	public Ticket  changeTicket(@RequestBody Ticket ticket) {
		return ticketService.changeTicket(ticket);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void deleteTicket(@PathVariable int id) {
		 ticketService.deleteTicket(id);
	}
	
}
