import java.util.Scanner;

public class MyCalendar {
	
	
	// 윤년 / 평년 판별 메소드
	// 년도를 인수로 넘겨받아 윤년, 평년을 판단해서 윤년이면 true, 평년이면 false를 리턴하는 메소드 // 논리값으로 리턴되는 메소드 이름은 is로 시
	
	private static final int day = 0; //**


	public static boolean isLeapYear(int year) { 
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	// 각 달의 마지막 날짜를 리턴하는 메소드 > 어떠한 데이터를 받아야 할까? month, year( 2월 때문에) ㅋㅋㅋ아주잘못찝었쥬 
	// 년, 월을 인수로 넘겨받아 그 달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year, int month) {
		
		int[] m = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //데이터의 개수만큼 배열을 만들고 초기치로 설정한다.
		
		//2월 28일 29일 판별기, 사용자 정의 메소드 불러
		m[1] = isLeapYear(year) ? 29 : 28;
		
		return m[month-1]; // 4월이면 인덱스3에서 값을 가져와야 함 // m[_____]
		
	}
	
	// 년, 월, 일을 인수로 넘겨받아 1년 1월 1일부터 지난 날짜를 계산해서 리턴하는 메소드
	public static int totalDay(int year, int month, int day){
		// 전년도 12월 31일 까지는 모두 지남
		int sum = (year - 1) * 365 + (year - 1)/4 - (year - 1)/100 + (year - 1)/400;
		for (int i = 1; i < month; i++) {
			sum += lastDay(year, i);// lastDay (____, ___);
			
		}
		return sum += day;
		
	}
	
	// 년, 월 일을 인수로 넘겨받아 요일을 숫자로 리턴한다. 일 월 화 수 목 금 토 0123456
	
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7 ;
	}
	
	
	// static 메소드는 static 메소드만 실행 할 수 있다.
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("달력을 출력할 년, 월을 입력하세요 : ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		
		// boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; // 이거 필요할 떄 항상 복붙하려면 귀찮음, 수정시에도 불편함 
		System.out.println(isLeapYear(year) ? "윤년" : "평년");
		System.out.println(lastDay(year, month));
		System.out.println(totalDay(year, month, 1));
		System.out.println(weekDay(year, month, day)); 
		 // System.out.println(isLeapYear(year)); // isLeapYear() 함수가 있는 메소드로 이동 > 메소드 실행, 리턴값 생성 > main으로 돌아와 return값 대입 
		
		// 자바는 함수가 어디든지 있어도 됨 (앞, 뒤) C언어는 메인 앞에 함수를 생성해야 한다. 시험에서는 메인 앞쪽에 선언 
		
	}
}
