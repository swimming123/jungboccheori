import java.util.Scanner;

public class weekdayTest {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
			System.out.print("요일을 계산할 날짜를 입력하세요 :  ");	
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int day = scanner.nextInt();
		
			// 서기 1년 1월 1일 월요 부터 입력한 날짜까지 며칠째 날 인가를 계산한다. > 7로 나눈 나머지를 계산한다.
			// 1+year 1+month 1+day 
			// 나머지가 0일 1월 2화 3수 4목 5금 6토  (파이썬은 월화수목금토일)
			// 전년도 까지는 지난 날짜임
			// 1) 1년 1월 1일 ~ 전년도 12월 31일 까지 지난 날짜를 계산한다.
			//(year-1) * 365
			
			// 코드 중간을 채우시오 > 실행결과를 쓰시오 , 
			
			// currentTimeMillis():System.currentTimeMillis(); 1970 01 01 자정부터 이 메소드가 실행된 순간까지 지난 시간을 밀리초(1/1000) 단위로 얻어온다.
			
			//long start = System.currentTimeMillis();
		
		/*	int sum = (year-1) * 365;
			for (int i=1; i<year; i++) {
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
					sum++;
				}
			}
			
			System.out.println(sum % 7);
			
			*/
			
			
			
			/*
			
			int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1)/400;
			System.out.println(sum % 7);
			*/
			
			
			//System.out.println(end - start);
			
			/*
			
			for (int i=1; i<month; i++) {
				// Switch arrayFor
				switch (i) {
				case 2: //2월
					sum += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28; //(조건 ? 참값 : 거짓값 )
					break;
				case 4: case 6: case 9: case 11: //30일까지 있는 달 (짧은달)
					sum += 30;
					break;
				default: // case 1: case 3: case 5: case 7: case 8: case 10: case 12: //긴 달
					sum += 31;
					break;
				}
				
				
				//++++++++++++++++++++++++++++++++++++++++++++
				*/
				
				// 12달의 마지막 날짜를 기억하는 배열을 만든다. 
				int[] m = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				int sum = 0;
				
				m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
				
				
				for (int i=1; i<month; i++) {
					// sum =+ m[month];  아주 잘못 짰쥬? 에러없고 돌아가고 답 이상하쥬?
					
					
					
				
					sum += m[i-1]; //**************죨라 헷갈리쥬?
				}
				
				
				System.out.println(sum % 7);
				// string[] week = {일, 월, 화, 수, 목, 금, 토};
				// week[sum%7]+"요일"
			}
			
		
	
}
