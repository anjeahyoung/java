package ch04.home.ex02;

public class H01Coupon {
	public static void main(String[] args) {
		int grade = 1;
		String coupon = "";
		/*
		switch(grade) {
		case 1 -> coupon = "5만원";
		case 2 -> coupon = "1만원";
		case 3 -> coupon = "1천원";
		}
		*/
		
		if(grade == 1) coupon = "5만원";
		else if(grade == 2) coupon = "1만원";
		else if(grade == 3) coupon = "1천원";
		
		System.out.println(coupon);
	}
}

/*
ch04.ex02.C01Switch 를 if로 refactoring 하라.
*/