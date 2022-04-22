import java.util.Scanner;


public class ScannerTest3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//키보드로 1문자 입력받기
		char ch = scanner.nextLine().charAt(0);  //키보드로 1글자 받기 
		// .charAt(0)== 파이썬 문자열인덱싱 
		
		System.out.println(ch);
		
	}
}
