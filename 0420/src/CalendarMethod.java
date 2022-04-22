import java.util.Scanner;

public class CalendarMethod {


	public static boolean isLeapYear(int year) { 
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	
	public static int lastDay(int year, int month) {
		int[] m = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		m[1] = isLeapYear(year) ? 29 : 28;
		return m[month-1]; // 4월이면 인덱스3에서 값을 가져와야 함 // m[_____]
	}
	
	public static int totalDay(int year, int month, int day){
		// 전년도 12월 31일 까지는 모두 지남
		int sum = (year - 1) * 365 + (year - 1)/4 - (year - 1)/100 + (year - 1)/400;
		for (int i = 1; i < month; i++) {
			sum += lastDay(year, i);// lastDay (____, ___);
		}
		return sum += day;
	}
	
	
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7 ;
	}
	
	
	// static 메소드는 static 메소드만 실행 할 수 있다.
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("달력을 출력할 년, 월, 을 입력하세요 : ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();


		System.out.println(isLeapYear(year) ? "윤년" : "평년");
		System.out.println(lastDay(year, month));
		System.out.println(totalDay(year, month, 1));
		System.out.println(weekDay(year, month, day)); 
	 // System.out.println(isLeapYear(year)); 
	}

}
