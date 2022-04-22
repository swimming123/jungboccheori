// 자식(하위, 서브, 파생)
// Child 클래스는 Parent 클래스를 상송받아 만들다.
public class Child extends Parent {  //interface implements 구현
	// 자바는 다중상속을 허용하지 않는다. extends Parent, Scorevov; > error
	
	
	// child 클래스는 parent 클래스의 모든 필드와 메소드를 별도의 선언 없이 사용할 수 있다.
	// child 클래스에서 필요한 기능을 정의한다.
	
	private int age;
	private String nickname;
	
	public Child() {
		// super(); // 부모클래스의 기본생성자 실행
	
	
	}
//  합쳐서 만드는게 좋음
//	public Child(String name, boolean gender) {
//		super(name, gender);
//		// TODO Auto-generated constructor stub
//	}
//
//	public Child(int age, String nickname) {
//		super();
//		this.age = age;
//		this.nickname = nickname;
//	}
	
	public Child(String name, boolean gender, int age, String nickname) {
		// 부모 클래스로부터 상속받은 필드의 접근 권한이 private일 경우 자식 클래스에서도 접근 할 수 없다.
		// 부모 클래스로부터 상속받은 private 권한의 필드는 부모 클래스의 생성자를 호출해서 초기화한다.
		
		// super 부모 클래스의 생상자 호출
		
		super(name, gender);
		this.age = age;
		this.nickname = nickname;
		
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", nickname=" + nickname + ", getName()=" + getName() + ", isGender()="
				+ isGender() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
