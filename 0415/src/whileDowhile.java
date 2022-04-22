
public class whileDowhile {
	public static void main(String[] args) {
		
		
		// 반복으로 최초 진입시 조건이 거짓이면 {} 블록을 1번도 실행하지 않는다.
		// while(조건식) {
		//	반복할 문장;
		//	,,, ;
		// }
		
		int i = 0;
		int sum = 0;
		while(i<=10) {  // 결과 66 , =빼면 55
			sum += ++i;
		}
		System.out.println("1 ~ 10의 합계:" + sum);
		
	
		// 반복으로 최초 진입시 조건이 거짓이더라도 {} 불록을 1번 실행한다.
		//do {
		//	반복할 문장;
		//	,,,;
		//} while (조건식 );
		
		i = sum = 0; //0을 sum에 대입하고 i에 sum을 대입 = 0
		do{  // 결과 66 , =빼면 55
			sum += ++i;
		} while (i<10);
		System.out.println("1 ~ 10의 합계:" + sum);
		
		// = 없는 for 예제와 값이 같음 = 55
		
		
		//////////////////////////////////
		int ii = 0;
		int summ = 0;
		while(ii>10) {  // 거짓 반복 안
			summ += ++ii;
		}
		System.out.println("1 ~ 10의 합계:" + summ); //0
		
	
		// 반복으로 최초 진입시 조건이 거짓이더라도 {} 불록을 1번 실행한다.
		//do {
		//	반복할 문장;
		//	,,,;
		//} while (조건식 );
		
		ii = summ = 0; 
		do{  
			summ += ++ii;  // 반복문에 들어와서 ++ii = 1
		} while (ii>10);  // 거짓, 반복문 out > 부등호 방향 조
		System.out.println("1 ~ 10의 합계:" + summ); //1
		
		// = 없는 for 예제와 값이 같음 = 55
		
		
		
		
		
		
		
	}
}
