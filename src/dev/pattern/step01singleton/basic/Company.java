package dev.pattern.step01singleton.basic;

/*
 * 상황 가정: 회사 내에 프린터기(CompanyPrinter)가 1대 밖에 없기 때문에
 * 직원(Employee)들이 번갈아가면서 사용해야함 
 */
public class Company {
	
	private static final int EMPLOYEES = 5;

	public static void main(String[] args) {
		Employee[] employees = new Employee[EMPLOYEES];
		
		for (int i = 0; i < EMPLOYEES; i++) {
			employees[i] = new Employee("user-" + i);
			employees[i].usePrinter();
		}
	}

}