
public class forTest {
	public static void main(String[] args) {
		
		// for 는 {} 블록을 조건이 만족하는 동안 반복해서 실행한다.
		// 반복 횟수가 알려져 있는 경우 주로 사용한다.
		
		//일반 for == C와 동일 
		// 변수의 저장된 초기치로 조건식을 비교해서 참이면 반복을 실행한다. 
		// {} 블록을 1번 반복한 후 변수값을 증감치만큼 변경시킨 후 조건식을 비교해서 참이면 반복을 실행하고 거짓이면 반복을 중지한다. (종료) 
		// for (자료형 변수명 = 초기치; 조건식; 증감치 {
		//		반복해서 실행할 문장;
		//		,,,
		//}
		
		int sum = 0 ;
		for (int i = 0; i < 10; i++) {	
			sum += i;
		}	
			System.out.println("1 ~ 10의 합계 " + sum ); //i = 0, 1	로 시작하면 출력 45  //1 ... 10 까지 더하면 55
			
		// 증감 연산자 (단항연산자)
		// ++ : 1 증가, -- : 1 감소
		// 변수++ 사용 후 1 증가 , 변수에 저장된 값을 사용(연산)하고 ";"을 만나 문장이 종료될 떄 1증가.
		// ++변수 1증가 후 사용 , 변수에 저장된 값을 1증가시키고 사용(연산)한다.
		// 변수++ 사용 후 1 증가 , 변수에 저장된 값을 사용(연산)하고 ";"을 만나 문장이 종료될 떄 1감소 .
		// ++변수 1증가 후 사용 , 변수에 저장된 값을 1감소시키고  사용(연산)한다.
			
		
		int a=1, b, c;
		b = a++; // b에 1 저장하고 a=2
		c = ++a; // a=2에서 1먼저 더하여 저장 a=3
		
		System.out.println("a: "+ a +", b: " + b + ",c : " + c );
		
		
		int d=1, e;
		e = ++d + ++d + ++d + ++d;
		//Java : d = 5, e =
		//C : d = 5, e = 
		System.out.println("d: "+ d +", e: " + e );
		
		
		// Java 5, 14 / C 5, 20 / 값이 다르다. 
		
		
		
		//향상된  for >> 파이썬에도 있음 
		// ":" 뒤 위 배열이나 list 타입의 자료형의 0번째 index의 값 부터 마지막 index의 값 까지 차례대로 변수에 저장되며 반복한다.
				// for (자료형 변수명 : 배열 또는 list 타입의 자료형 ) {
				//		반복해서 실행할 문장;
				//		,,,
				//}

		
		
	}
}
