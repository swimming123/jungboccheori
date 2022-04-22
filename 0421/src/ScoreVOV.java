
public class ScoreVOV {
	
	// 정적(static) 필드, 정적 멤버 변수 > 프로그램이 시작되기 전에 메모리에 생성된다. 
	// ㄴ**현재 클래스로 생성되는 모든 객체에서 공유해서 사용한다.**
	// static을 붙여서 선언한 변수나 메소드는 클래스의 객체를 생성하지 않고 클래스 이름에 "."을 찍어 접근할 수 있다.
	public static int count;
	// 필드 : 초기화 하지 않아도 기본 초기화 됨
	
	
	// 필드 > 인스턴스 멤버 변수 > 클래스 객체가 생성될 때마다 독립된 기억 공간을 가진다.
	private int idx; // 일련번호, 자동증가
	private String name; // 이름
	private int java; // JAVA점수
	private int c; // C 점수
	private int python; // python 점수
	private int total; // 총점
	private double mean; // 평균
	
	// 변수를 선언할 떄 final을 붙여서 선언하면 그 변수의 값은 프로그램에서 수정할 수 없다.
	// 변수에 저장된 값이 항상 일정하기 때문에 *상수*라고 부르고 다른 변수에 구분하기 위해서 대문자로 만들어 사용한다.
	// 상수를 수정하려 하면 에러가 발생된다.
	public static final double PI = 3.141592653589793;
	// 메소드를 선언할 때 final을 붙이면 그 메소드는 override가 불가능하다.
	// 클래스를 선언할 때 final을 붙이면 그 클래스는 상속시킬 수 없다.
	
	
	// 기본생성자 
	public ScoreVOV(){
		
	}

	// 이름과 3과목 점수를 넘겨받아 총점과 평균을 계산한 후 초기화시키는 생성자
	
	public ScoreVOV(String name, int java, int c, int python) {  // scoreTest에 1번 넘겨받음
		idx = ++count;
		
	
		this.name = name;
		this.java = java;
		this.c = c;
		this.python = python;
		
		//멤버변수(필드) 지역변수 같이있을 때 지역변수에 우선
		total = java + c + python;
		mean = (double)total / 3;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getPython() {
		return python;
	}

	public void setPython(int python) {
		this.python = python;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return "ScoreVOV [idx=" + idx + ", name=" + name + ", java=" + java + ", c=" + c + ", python=" + python
				+ ", total=" + total + ", mean=" + mean + "]";
	}
	
	
	
	
	
	
	
	

}
