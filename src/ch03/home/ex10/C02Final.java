package ch03.home.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3;
//		MAX = 1;
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14;
		int r = 3;
		area = PI * r * r;
		System.out.print(area);
	}
}
