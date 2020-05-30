package com.travelapp.web.controllers;

import com.travelapp.models.Ticket;
import com.travelapp.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/tickets")
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService service) {
        this.ticketService = service;
    }

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Ticket> getAllTickets(HttpServletRequest req) {
        return ticketService.getAll();
    }

    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable int id) {
        return ticketService.getById(id);
    }

    @PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public Ticket registerNewTicket(@RequestBody Ticket newTicket) {
        return ticketService.save(newTicket);
    }

    @PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public boolean updateTicket(@RequestBody Ticket updatedTicket) { return ticketService.update(updatedTicket); }

    @PostMapping("/{id}")
    public boolean deleteTicket(@PathVariable int id) { return ticketService.deleteById(id); }

}
