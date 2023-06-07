package dev.pattern.step01singleton.exercise;


public class MainApplication {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		User user5 = new User();
		User user6 = new User();
		
		user1.useTicketMachine();
		user2.useTicketMachine();
		user3.useTicketMachine();
		user4.useTicketMachine();
		user5.useTicketMachine();
		user6.useTicketMachine();
		
		System.out.println(user1.getMyTicket().getTicketNum());
		
		TicketMachine ticketMachine = TicketMachine.operateTicketMachine();
		
		ticketMachine.checkValidTicket(user6.getMyTicket());
		
		
		

	}

}
