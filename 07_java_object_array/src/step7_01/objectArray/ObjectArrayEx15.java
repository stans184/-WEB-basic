package step7_01.objectArray;
import java.util.ArrayList;
/* # HashMap<K, V>
 	- HashMap은 K(Key)에 V(Value)를 할당 방식으로 저장하는 데이터 형식
	- HashMap은 순서와 상관없이 key로 데이터를 저장 및 관리
	- HashMap 생성방법
	
		 HashMap<키, 값> 변수명 = new HashMap<키, 값>();
		 HashMap<키, 값> 변수명 = new HashMap<>();						// new 뒤쪽의 generic은 생략 가능
		
	     Ex)
		 HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		 HashMap<String, Integer> hmap = new HashMap<>();				 
		 
		 설명)
		 HashMap<String,Integer> : key의 데이터타입은 String, 저장될 값의 데이터 타입은 Integer
		 HashMap<String,String>  : key의 데이터타입은 String, 저장될 값의 데이터 타입은 String
		 HashMap<String,Object>  : key의 데이터타입은 String, 저장될 값의 데이터 타입은 Object
		 HashMap<String,Product> : key의 데이터타입은 String, 저장될 값의 데이터 타입은 Product
		 HashMap<String,Member>  : key의 데이터타입은 String, 저장될 값의 데이터 타입은 Member
*/
import java.util.HashMap;

class TempMember {
	String id;
	String passwd;
	String name;
	String email;
	String address;
}

public class ObjectArrayEx15 {

	public static void main(String[] args) {

		HashMap<String, Integer> hMap = new HashMap<>();
		
		// put(key, value) : HashMap의 key에 value를 할당한다. 
		// put()메서드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다. 
		hMap.put("data1", 1000);
		hMap.put("data2", 2000);
		hMap.put("data3", 3000);
		hMap.put("data4", 4000);
		System.out.println(hMap);					// {data4=4000, data3=3000, data2=2000, data1=1000}
		hMap.put("data3", 3456);					// data modify
		System.out.println(hMap);					// {data4=4000, data3=3456, data2=2000, data1=1000}
		hMap.put("data5", 5432);
		System.out.println(hMap);
		System.out.println("\n=========================\n");
		
		// size() : HashMap의 데이터개수를 반환한다.
		System.out.println("크기 : " + hMap.size());
		System.out.println("\n=========================\n");
		
		// get(key) : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println("data3 의 value : " + hMap.get("data3"));
		System.out.println("\n=========================\n");
		
		// keySet() : HashMap의 key만 얻어온다.
		// values() : HashMap의 data
		System.out.println(hMap.keySet());			// [data5, data4, data3, data2, data1]
		
		for (String key : hMap.keySet()) System.out.print(hMap.get(key) + " ");
		System.out.println();
		System.out.println(hMap.values());			// [5432, 4000, 3456, 2000, 1000]
		System.out.println("\n=========================\n");
		
		// remove(key) : HashMap의 key에 해당하는 값을 제거한다.
		hMap.remove("data2");
		hMap.remove("data3");
		hMap.remove("data4");
		System.out.println(hMap);
		System.out.println("\n=========================\n");
		
		// clear() : all data delete
		hMap.clear();
		System.out.println(hMap);
		System.out.println(hMap.isEmpty());
		System.out.println("\n=========================\n");
		
		// null 대입은 HashMap 자체를 삭제, 재생성해야함
		hMap = null;		// null 대입은 HashMap 자체를 삭제, 재생성해야함
		System.out.println(hMap);
		System.out.println("\n=========================\n");
		
		// 웹에서 자주 사용하는 예시 1
		TempMember temp = new TempMember();
		temp.id = "user01";
		temp.name = "유저1";
		temp.passwd = "1";
		temp.email ="1@gmail.com";
		temp.address = "서울";
		
		// DTO - Data Transfer Object, web에서 back (DB)로 데이터를 넘기는 형식,  ***** (하나만 넘어갈 수 있다?) -> 찾아보기
		// ex) orderDTO, memberDTO, wishLishDTO 와 같이 여러개가 있을 때
		// Map 으로 묶어서 Map을 넘기는 형식으로 처리
		
		HashMap<String, Object> tempMap = new HashMap<String, Object>();
		tempMap.put("id", "user1");
		tempMap.put("name", "유저1");
		tempMap.put("passwd", "1");
		tempMap.put("email", "1@gmail.com");
		tempMap.put("address", "서울");
		// 클래스와는 다르게, 추가적인 데이터 저장 가능
		tempMap.put("isMobile", true);
		tempMap.put("browserCd", 1);
		tempMap.put("isMember", false);
		
		// 웹에서 자주 사용하는 예시 2 - 한개만 넘어가기 때문에 class를 map으로 묶어서 넘기는 것
		HashMap<String, TempMember> tempMemberMap = new HashMap<String, TempMember>();
		
		// 실습데이터 생성
		for (int i = 100; i < 110; i++) {
			TempMember tempMember = new TempMember();
			tempMember.id = "user" + i;
			tempMember.passwd = "0000";
			tempMember.name = "익명";
			tempMember.email = "user" + i + "@naver.com";
			tempMember.address = "서울";
			
			tempMemberMap.put(tempMember.id, tempMember);
		}
		
		System.out.println(tempMemberMap.get("user103").email);
		
		// 웹에서 자주 사용하는 예시 3
		// 참고) Object 타입을 명시할경우 서로 다른데이터를 저장할 수 있다.
		// 모든 class의 상위 class 이기 때문에
		HashMap<String, Object> testMap = new HashMap<>();
		testMap.put("키1", 101);
		testMap.put("키2", 'a');
		testMap.put("키3", true);
		testMap.put("키4", "hello");
		testMap.put("키5", 3.14);
		testMap.put("키6", new TempMember());
		testMap.put("키7", new Product());
		
		ArrayList<Object> arli = new ArrayList<Object>();
		arli.add(101);
		arli.add("heiil");
		arli.add(3.14);
		arli.add(false);
		System.out.println(arli);
	}
}