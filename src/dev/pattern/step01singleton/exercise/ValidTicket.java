package dev.pattern.step01singleton.exercise;

public class ValidTicket extends Ticket{

	@Override
	long getTicketNum() {
		return hashCode();
	}

}
