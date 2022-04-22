
public class calendarMethodTest {
	
	
	public static void main(String[] args) {
	//	객체를 만들고 실행 
		CalendarMethod calendarMethod = new CalendarMethod();  // 메소드를 실행할 때 객체를 생성하여 실행 
		
		System.out.println(calendarMethod.isLeapYear(2022));   //CalendarMothod에 static을 지우면 생성해서 불러야 
		System.out.println(calendarMethod.lastDay(2022, 4));
		System.out.println(calendarMethod.totalDay(2022, 4, 20));
		System.out.println(calendarMethod.weekDay(2022, 4, 20));
		
	//  static으로 선언한 메소드는 클래스에 객체를 만들지 않고 클래스.이름으로 접근할 수 있다.
		System.out.println(CalendarMethod.isLeapYear(2022)); // 객체명.함수이름 => 불러올 메소드의 형이 반드시 static으로 선언해야 한다.
		System.out.println(CalendarMethod.lastDay(2022, 4));
		System.out.println(CalendarMethod.totalDay(2022, 4, 20));
		System.out.println(CalendarMethod.weekDay(2022, 4, 20));

		
	}
	
	
	

}
