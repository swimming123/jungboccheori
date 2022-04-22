import java.util.HashMap;

public class hashMap {
	public static void main(String[]args) {
		
		//map = 파이썬 딕셔너리
		// HashMap은 사전식으로 데이터를 저장한다. key에 value를 할당하는 방식으로 저장한다. 
		// key는 일반적으로 String 타입으로 하고 value는 저장할 데이터 타입으로 만든다. 
		
		// HashMap<Key, Value>
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		// put(key, value) : HashMap에 key에 value를 할당해서 저장한다.
		hmap.put("apple", 1000);
		
		// size() : HashMap에 저장된 데이터의 개수를 얻어온다.
		hmap.put("cherry", 7000); // 순서 뒤죽박죽
		System.out.println(hmap.size() + ": " + hmap);
		hmap.put("peach", 5000);
		System.out.println(hmap.size() + ": " + hmap);
		hmap.put("banana", 2000);
		System.out.println(hmap.size() + ": " + hmap);
		hmap.put("melon", 3000);
		System.out.println(hmap.size() + ": " + hmap);
		
		// 출력결과 = 으로 출력  딕셔너리는 : 로 출력 
		// 존재하는 key를 수정하면 
		// put()메소드로 없는 key에 할당하면 데이터가 저장되고
		// 있는 key에 할당하면 그 key의 value를 수정한다. 
		
		hmap.put("banana", 200);
		System.out.println(hmap.size() + ": " + hmap);
		
		// get(key) ; HashMap에 저장된 key에 할당된 데이터를 얻어온다.
		System.out.println(hmap.get("banana"));
		
		// remove(key) ; HashMap에 저장된 key에 할당된 데이터를 삭제한다. 
		hmap.remove("banana");
		System.out.println(hmap.size() + ": " + hmap);
		
		System.out.println("===========================");
		
		// keySet() : HashMap에 저장된 key만 얻어온다 (python keys)   (only python : items.......tuple())
		System.out.println(hmap.keySet());
		
		
		// values() : HashMap에 저장된 value만 얻어온다
		System.out.println(hmap.values());
		
		System.out.println("===========================");
		
		
		// clear() : hashMap에 저장된 모든 데이터를 제거한다.
		hmap.clear();
		System.out.println(hmap.size() + ": " + hmap);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
