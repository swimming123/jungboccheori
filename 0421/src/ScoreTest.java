
public class ScoreTest {
	
	
	
	public static void main(String[]args) {
		
		System.out.println(Math.PI);
		
		ScoreVOV score1 = new ScoreVOV("윤수영", 100, 90, 80);  //1
		System.out.println(score1);
		ScoreVOV score2 = new ScoreVOV("윤자영", 90, 80, 70); 
		System.out.println(score2);
		ScoreVOV score3 = new ScoreVOV("허경남", 80, 70, 60); 
		System.out.println(score3);
		ScoreVOV score4 = new ScoreVOV("윤재형", 70, 60, 50); 
		System.out.println(score4);
		
		
		System.out.println("score1.count ; " + score1.count); // 값 바꾸기 전
		score2.count = 100; // 값 바꿈
		System.out.println("score2.count ; " + score2.count);
		System.out.println("score3.count ; " + score3.count); //score3 값이 2값으로 바뀜 : score 메모리를 공유함
		System.out.println("score1.count ; " + score1.count);
		
		System.out.println(Math.PI);
		System.out.println(ScoreVOV.PI);
		// 상수를 변경하려고 했으므로 에러가 발생된다.
		// ScoreVOV.PI = 123.123;
		
	}

}
