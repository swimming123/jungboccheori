
import java.util.Scanner;

public class ScannerTest2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이 : ");
	  	int age = scanner.nextInt();  //정수형 + 20 enter 값까지 저장됨 
		//String age = scanner.nextLine();
		
	  	
	  	
	  	//키보드 버퍼를 비운다.
	  	scanner.nextLine();
	  	// 초기화 없을 때 실행결과를 쓰시오
	  	//님은 20살 입니다.
	  	//님은 내년에 21살 입니다.
	  	
	  	
	  	
		System.out.print( "name : ");
		String name = scanner.nextLine(); //
		
		System.out.println( name + "는 " + age + "입니다.");
		
		System.out.println( name + "는 내년에  " + (age + 1) + "입니다.");
		
		//나이 : 11
		//name : is 11입니다.
	}

	
	
}
