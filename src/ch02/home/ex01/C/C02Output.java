package ch02.home.ex01.C;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100);
		System.out.println(score);
		System.out.println(100 + 1);
		System.out.println(Math.random());
		
		System.out.print(200);
		System.out.print(300);
		System.out.print('\n');
		System.out.print(400);
		System.out.println();
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.156, "hello" );
		
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.156, "hello" );
		
		System.out.printf("%5b|%5c|%5d%5f|%5s\n", true, 'a', 10, 1.156, "hello" );
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name +"은 " + age + "살입니다.");
	}
}
