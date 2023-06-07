package dev.pattern.step01singleton.exercise;

public class User {
	private Ticket ticket;
	
	public void useTicketMachine() {
		TicketMachine ticketMachine = TicketMachine.operateTicketMachine();
		ticket = ticketMachine.getTicket();
		
	}
	
	public Ticket getMyTicket() {
		return this.ticket;
	}
	
	public String toString() {
		return "인스턴스: " + hashCode();
	}

}
