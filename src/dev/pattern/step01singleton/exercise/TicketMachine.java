package dev.pattern.step01singleton.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TicketMachine {
	private static TicketMachine ticketMachine = new TicketMachine();
	private int MAX_TICKET_LIMIT = 5; // 발행 가능한 최대 티켓 수
	private int currentTicketCount = 0; // 현재까지 발급된 티켓 수
	private long[] VALID_SERIAL_NUMBERS = new long[MAX_TICKET_LIMIT]; // 유효한 티켓 번호만 보관하고 있는 배열
	private static Logger logger = LoggerFactory.getLogger(TicketMachine.class);
	
	private TicketMachine() {
		
	}
	
	// 티켓을 발급해주는 기능
	public Ticket getTicket() {
		if (currentTicketCount < MAX_TICKET_LIMIT) {
			Ticket ticket = new ValidTicket();
			VALID_SERIAL_NUMBERS[currentTicketCount] = ticket.getTicketNum();
			currentTicketCount++;
			return ticket;
		} else {
			return new InvalidTicket();
		}
	}
	
	// 티켓 머신 인스턴스 취득
	public static TicketMachine operateTicketMachine() {
		return ticketMachine;
	}
	
	// 전달받은 티켓이 유효한지 검증해주는 기능
	public void checkValidTicket(Ticket ticket) {
		if(ticket.getTicketNum() == 0L) {
			logger.info("유효하지않은 티켓이다.");
		} else {
			logger.info("유효한 티켓이다.");
		}
	}
	
	public String toString() {
		return "티켓발행기 고유번호: " + hashCode();
	}

}
