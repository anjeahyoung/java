package ch04.home.ex04;

import java.util.Scanner;

public class C03inoneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("입력: ");
			input = sc.nextInt();
		} while(!(1<= input && input <= 9));
		
		System.out.println("끝.");
	}
}
