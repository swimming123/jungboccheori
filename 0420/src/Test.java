// 파일 1개에 클래스 1개 원칙임 
//( class 앞에 public) >> 파일명과 이름이 같은 class에 public 붙음 
// JAVA 파일 이름과 같은 이름의 클래스에만 public을 붙일 수 있음


// 232p ~ 233p
public class Test {
	
	public static void main(String[]args) {
		
		int x = 3, y = 6, r;
		
		SOO cal = new SOO();
		r = cal.funcSdd(x, y);
		System.out.println(r);
	}
}

class SOO {
	int a = 10; 
	int funcSdd(int x, int y) {
		return x + y + a ;
	}
	
}


//The public type SOO must be defined in its own file
//public class SOO {
//}

// 컴파일
//컴파일러, 인터프리터 의 차이는 :  컴파일러는 번역(기록)을 하는 도구, **인간언어를 기계어로 바꾸고 실행한다, 실행파일(exe)이 생긴다.**
//인터프리터(html, javascript)는 통역(대화)을 하는 도구, 대화형 언어,  **한번에 한줄씩 실행**