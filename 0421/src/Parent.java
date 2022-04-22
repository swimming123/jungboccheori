// 부모 (상위, 슈퍼, 기반)
public class Parent {
	
	private String name;
	private boolean gender;
	
	// 기본생성자 무조건 생성
	public Parent() {
		
	}
	
	public Parent(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", gender=" + gender + ", getName()=" + getName() + ", isGender()=" + isGender()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	
}	
	
//	package 권한
//	String name;
//	boolean gender;
	// 오버로드 같은이름 메소드 여러개, 이름같으면 인수개수, 인수타입으로 식별
	// 오버라이드 상속, 부모로부터 상속받은 메소드가 기능부족할 때 자식클래스에서 (재정의) 다시 하는 것
	


