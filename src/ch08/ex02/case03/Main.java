package ch08.ex02.case03;

public class Main {
	public static void main(String[] args) {
		String name = Way.LEFT.name();
		int ordinal =Way.LEFT.ordinal();
		name = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal();
		System.out.printf("%s %d\n", name, ordinal);
		
		Way[] ways = Way.values();
		for(Way way: ways) System.out.print(way + " ");
		System.out.println();
		
		Way way = Way.valueOf("LEFT");
		System.out.println(way);
	}
}

/*
entry enum 안에 있는 데이터 
*/