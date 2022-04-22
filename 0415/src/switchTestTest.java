

import java.util.Scanner;


public class switchTestTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); {
			System.out.print("3과목 점수를 입력하세요 :  ");	
			int java = scanner.nextInt();
			int c = scanner.nextInt();
			int python = scanner.nextInt();
			
			int total = java + c + python;
			// double average = total / 3;
			double average = (double)total / 3;
			
			
			System.out.printf("총점 : %d, 평균 : %6.2\n", total, average);
			
			// total / 3 = 정수  99  
			// 6.2f 소숫점 아래 2째자리까지 > 99.00
			
			if (average >=90) {
				System.out.println("A");
			}else if (average >=80) { //average < 90 && 이미 위에서 90미만
					System.out.println("B");
			}else if (average >=70) { 
					System.out.println("C");
			}else if (average >=60) { 
					System.out.println("D");
			}else {
					System.out.println("F");
			}
			
			// if (80 <= average <90) >> c 값 : 1 (앞 조건에 만족하기 때문에 참), python (정상 비교) , Java (빨간줄 나옴 에러)
			// **key에는 정수 또는 연산 결과정수인 수식, JDK1.7 ~ 버전부터 문자열도 가능하다.
			// switch (key){
			// 		case value : 
			//			key와 value가 일치할 경우 실행할 문장;
			//			,,,
			//			[break;]
			//		...
			//		[default : 
			//			key와 value 일치하지 않을 때 실행할 문장;
			//			break;
			//			]
			//			
			//		}
			//
			System.out.println("-------------------------");
			
			switch ((int)average/10) {  //average 그대로 쓰면 정수이기 때문에 에러, average / 10으로 나눠서 90~100, 80~89
			case 10 : // 연산자 사용할 수 없음 ex) >= 80
				System.out.println("A");
				break;
//		case 100 : case 99 : case 98 : case 97 : ,,, case 90 :
//			System.out.println("A";)
			case 9 : 
				System.out.println("A");
				break;
			case 8 : 
				System.out.println("B");
				break;
			case 7 : 
				System.out.println("C");
				break;
			case 6 : 
				System.out.println("D");
				break;
			default : // case 5~0 까지 F  나머지 케이스는 모두 에프 
				System.out.println("F");
				break;

			//break; 가 없으면 break 만날때까지  다 실행 함 
			}
			// 스위치 끝 
		} // scanner 끝 
		
		
		
		
		
		
	}
}
