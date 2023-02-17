package step7_01.objectArray;

import java.util.*;

/*  [ java.util.ArrayList ]
 *	 - 배열은 한번 선언하면 프로그램에서 배열의 크기를 바꿀 수 없다.
 * 	 - ArrayList 클래스는 데이터가 입력되면 자동으로 크기가 커지고 데이터가 삭제되면 자동으로 크기가 작아진다.
 *   - 중간에 데이터가 삽입되면 데이터가 삽입될 위치부터 모든 데이터가 뒤로 이동되고 
 *     중간의 데이터가 제거된 다음 위치부터 모든 데이터가 앞으로 이동한다.
 *   
 *   [ ArrayList 생성 방법 ]
 *   ArrayList<Integer> list = new ArrayList<Integer>();     
 *   ArrayList<Integer> list = new ArrayList<>();           		// 우변의 제네릭의 데이터형은 생략 가능하다.
 *   ArrayList<String> list = new ArrayList<String>();
 *   ArrayList<Product> list = new ArrayList<Product>();
 *   ArrayList<Member> list = new ArrayList<Member>();
 *   
 *   
 *   * [ 래퍼 클래스(wrapper class) ]
 * 	- 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
 *   [기본형]           [래퍼 클래스]
 *    byte          	    Byte
 *    short     	        Short
 *    int       	       Integer
 *    long      	        Long
 *    float    	 	        Float
 *    double    	        Double
 *    char       	       Character
 *    boolean     	        Boolean
 *
 *  [ 제네릭 ]
 * - 제네릭(generic)이라 부르며 ArrayList에 저장될 데이터 타입을 반드시 클래스로 작성한다.
 * - 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 하는 경우에는 래퍼 클래스를 사용한다.
 */

public class ObjectArrayEx10 {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		System.out.println("\n=====================\n");
		
		// add(value) : arrayList의 맨뒤에 value를 추가한다.
		// add(index,value) : arrayList의 index번째에 value를 추가한다.
		for (int i = 0; i < 5; i++) arr[i] = (i+1)*10;
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(2, 30);
		list.add(50);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		System.out.println("\n=====================\n");
		
		// size() : arrayList의 데이터의 개수를 반환한다.
		System.out.println("arr의 크기\t\t: " + arr.length);
		System.out.println("arraylist의 크기\t: " + list.size());
		System.out.println("\n=====================\n");
		
		// set(index,value) : ArrayList의 index번째의 값을 value값으로 수정한다. set/modify/update
		for (int i = 0;i<3;i++) {
			arr[i] = (i+1)*1000;
			list.set(i, (i+1)*1000);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		System.out.println("\n=====================\n");
		
		// get(index) : ArrayList의 index번째의 value를 얻어온다. 
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
		System.out.println();
		
		for (int num : list) System.out.print(num + " ");
		System.out.println();
		System.out.println("\n=====================\n");
		
		// remove(index) : ArrayList의 index번째 위치의 값을 삭제한다.
		for (int i = 0; i<3; i++) arr[i] = 0;
		
		for (int i = 2; i>=0; i--) list.remove(i);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		System.out.println("\n=====================\n");
		
		/* # 향상된 for문 (for_each), 무조건 처음부터 끝까지
		 *  
		 *  [ 구조 ]
		 *  for (자료형 변수명 : Array or ArrayList) {
		 *  	명령어;
		 *  }
		 * 
		 *  element가 직접 변수에 저장된다.
		 * */
		for (int num : arr) System.out.print(num + " ");
		System.out.println();
		
		// ArrayList니까 Wrapper class 도 작성 가능하다, Integer iter
		for (int iter : list) System.out.print(iter + " ");
		System.out.println();
		
		// 예시 1)
		String[] index = {"한놈" , "두식이" , "석삼" , "너구리" , "오징어"};
		
		for (String word : index) System.out.print(word + " ");
		System.out.println("\n=====================\n");
		
		// 예시 2)
		ArrayList<Product> container = new ArrayList<Product>();
		
		Product myMobile = new Product("iphone 12 PRO", 1350000);
		Product dadMobile = new Product("Galaxy S20 +", 1290000);
		Product momMobile = new Product("iphone 13 PRO", 1350000);
		
		container.add(myMobile);
		container.add(dadMobile);
		container.add(momMobile);
		
		for (int i = container.size(); i > 0; i--) {
			System.out.println("NAME : " + container.get(i-1).name + ",\tPrice : " + container.get(i-1).price);
		}
		System.out.println();
		
		for (Product product : container) {
			System.out.println("NAME : " + product.name + ",\tPrice : " + product.price);
		}
		System.out.println("\n=====================\n");
		
		// clear
		arr = null;
		list.clear();						// ArrayList 의 모든 데이터만 삭제, List 자체는 남겨둠
		System.out.println(Arrays.toString(arr));
		list.add(10);
		list.add(10);
		list.add(10);
		list.remove(2);
		System.out.println(list);
		
		list = null;						// ArrayList 자체를 삭제
		System.out.println(list);
		System.out.println("\n=====================\n");
	}
}