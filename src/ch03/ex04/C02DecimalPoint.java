package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi =(int)(pi * 10) / 10.0;
		System.out.println(shortPi);
		
//		과제 : pi 값을 소수점 이하 세자로 조정하라.
		shortPi =(int)(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
//		과제: pi 값을 반올림해서, 소수점 이하 세자리로 조정하라.
		
		shortPi =(int)(pi * 10000) / 10000.0;
		System.out.println(shortPi);
		shortPi = Math.floor(shortPi);
		System.out.println(shortPi);
		/*
		shortPi = Math.floor(shortPi) * 5.1;
		System.out.println(shortPi); 15.2999999999
		
		shortPi = Math.round(shortPi);
		System.out.println(shortPi) * 3.1; 9.3
		*/
	}
}
