import java.util.Date;

// VO (value Object) 클래스 : 1건의 데이터와 데이터를 처리하는 메소드를 모아놓은 클래스
// DTO (Data Transfer Object) 라고도 부른다.
// bean : 커피콩 처리할 데이터를 기억하는 필드(변수)와 
//		필드에 데이터를 입출력 할 수 있는 getters & setters 메소드로만 구성된 클래스를 말한다.(java필드 = c 멤버변수)

// 도서정보 1건을 기억하는 클래스 
public class BookVO {
	
	// 데이터를 기억할 필드(멤버변수)를 선언한다.
	// 클래스에서 필드로 선언된 변수는 클래스 내부의 모든 메소드에서 사용할 수 있다. >> 전역변수
	
	// 일반적으로 데이터를 기억하는 필드는 private 접근권한을 사용하고,
	// 메소드는 일반적으로 public권한을 지정해서 선언한다. (누가 실행해도 같은 결과를 가져야 한다.)
	// 1. 도서정보 설계 : 도서명(string), 저자(string), 출판사(string), 출판일(date클래스), 가격((원)int, $(double)) ...
	//-------------------------------------------------------(C의 구조체 형식은 public으로 선언되어서 멤버 데이터 넣을 때 선언하여 넣는다 )
	
	// 클래스 전체에서 사용 가능한 변수 
	String title; //도서명 (String title : 프로젝트권한 패키지 ---위배)
	private String name;//저자
	private String publisher;//출판사
	private Date date;//출판일
	private int price;//가격
	
	
	// *****생성자*****
	// 생성자 메소드(이하 생성자, constructor)를 선언한다. (객체를 만드는 방법.)
	// 생성자의 이름은 반드시 클래스의 이름과 같아야 한다.
	// 생성자를 선언하지 않으면 컴파일러가 자동으로 아무런 일도 하지 않는 생성자(기본 생성자)를 만들어주고
	// 생성자를 선언하면 기본 생성자를 자동으로 만들지 않는다.
	// 생성자는 리턴 타입을 사용하지 않고 생성자 내부에서 return 명령도 사용하지 않는다.
	// 생성자는 객체가 생성될 떄 자동으로 실행되며 **필드**에 **데이터 초기화**를 목적으로 사용한다.**
	
	// *클래스 외부에서 객체를 생성할 수 없도록 기본 생성자의 접근권한을 private으로 설정하는 디자인패턴은? singleton * 가장많이사용
	//기본 생성자
	public BookVO() {
		// TODO Auto-generated constructor stub // 상향식 통합 cluster 하향식 통합 stub 암기
		// System.out.println("수영이는집에가고싶어요");
		// 아무것도 없으면 기본생성자
		//generate constructor using filds
		
	}
	
	// 데이터를 넘겨받아 필드를 초기화 시키는 생성자 BookVO(인수의 개수>인수의 형 : 생성자 오버로딩)
	// 지역변수 : 변수가 선언된 {} 블록에서만 사용할 수 있고 {} 블록을 벗어나면 메모리에서 소멸된다.

	public BookVO(String title, String name, String publisher, Date date, int price) {
		// {} 블록 내부에 필드와 지역변수가 이름이 같을 경우 지역 변수에 우선권이 부여된다.
		super(); // 생략해도 자바 컴파일러가 다시 생성함. 부모클래스(super)의 기본 생성자를 의미한다.
		// this(): 현재 클래스의 다른 생성자를 의미한다.
		// super : 부모 클래스를 의미
		// this : 현재 클래스를 의미
		
		// 지역변수
		// 전역변수 지역변수 구분 : this.변수명 = 전역변수 , 
		this.title = title;
		this.name = name;
		this.publisher = publisher;
		this.date = date;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVO [title=" + title + ", name=" + name + ", publisher=" + publisher + ", date=" + date + ", price="
				+ price + "]";
	}

	// getters & setters (우클릭 sourse)
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 객체에 저장된 데이터를 보고싶으면 toString()메소드를 override 재정의 해야함? 
	// generate to String()
	

}
