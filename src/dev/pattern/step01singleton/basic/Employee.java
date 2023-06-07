package dev.pattern.step01singleton.basic;

public class Employee {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	// 프린터기를 이용하는 기능
	public void usePrinter() {
		CompanyPrinter printer = CompanyPrinter.getPrinter();
		String message = String.format("%s가 %s를 사용중 ", name, printer);
		System.out.println(message);
	}

}
