
public class InheritanceTest {
	

	public static void main(String[]args) {
		
		Parent parent = new Parent("윤수영",false);
		
		System.out.println(parent);
		System.out.println(parent.toString());
		
		Child child = new Child("윤수영", false, 26, "똥멍청이");
		System.out.println(child);
		
		
		
	}

	
	
}
