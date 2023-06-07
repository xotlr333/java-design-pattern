package dev.pattern.step01singleton.basic;

public class CompanyPrinter {
	
	int age; // 필드 앞에 static이 없으면 인스턴스 필드이기 때문에
	// 인스턴스를 먼저 생성하지 않으면 접근이 불가능
	
	// s2. 클래스 내에서 직접 인스턴스를 생성
	private static CompanyPrinter printer = new CompanyPrinter();
	
	// s1. 생성자의 접근 제어자를 private으로 설정해서 객체의 생성(인스턴스화)를 외부로부터 차단
	// 외부: 해당 클래스(CompanyPrinter)를 제외한 다른 모든 클래스들
	private CompanyPrinter() {
		System.out.println("기본 생성자");
	}
	
	public static CompanyPrinter getPrinter() {
		return printer;
	}
	
	@Override
	public String toString() {
		return "Serial No. " + hashCode();
	}

}
