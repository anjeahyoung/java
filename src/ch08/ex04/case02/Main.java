package ch08.ex04.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "gambit";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과했습니다");
		} catch(LengthException e) {
			e.printStackTrace();
		} 
		
		throw new NumberException("숫자가 아닙니다.");
	}
}
//throw 예외사항이 있을 수 있다. 혹은 예외사항이다.
//log msg 시간