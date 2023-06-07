package dev.pattern.step01singleton.exercise;

public class InvalidTicket extends Ticket{

	@Override
	long getTicketNum() {
		return 0L;
	}

}
