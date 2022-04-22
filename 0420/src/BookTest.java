import java.util.Date;

public class BookTest {
	
	
	public static void main(String[]args) {
		
		// bookVO 클래스 객체를 기본 생성자로 만든다.
		// 기본 생성자가 없어도 자바가 자동으로 만들어서 사용 가능
		BookVO bookVO1 = new BookVO();
		
		// bookVO.title = "자바";  
		// title 강제로 쓰고, 필드로 인식은 됨 
		// BookVO파일에 String title; 로 바꾸면 됨;;
		System.out.println(bookVO1); //깡통필드 
		
		// public과 private의 접근권한 차이는 ? 
		// 접근권한 3개 : 영문으로 : private public protected + package > box형
		
		// 객체 생성
		// 생성자를 선언하면 BOOKVO에러됨 (생성자가 있어서)
		// 무조건 기본생성자 만들어서 시작합니다.
		BookVO bookVO2 = new BookVO("부자되는법", "윤수영", "새나라",new Date(), 10000);
		System.out.println(bookVO2); // 풀소유필드
		
		
		// 객체 필드 내 일부 정보 수정
		//BookVO2.name : private라 안됨
		// private 접근 함수 or 메소드
		
		// getters : get.멤버이름
		// setters : set.멤버이름
		// private 접근 권한이 너무 엄격해서 클래스 외부에서 클래스 필드에 접근하거나 값을 수정할 수 없기 떄문에
		// 이것에 대한 예외를 지정하는 메소드 (우회로)
		
		bookVO2.setName("윤수영수영");
		System.out.println(bookVO2.getName());
	}
	
	
	

}
