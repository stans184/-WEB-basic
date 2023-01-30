
// * # 배열 ( array )    
// * 
// *  [ 형식 ]
// *  
// *  1) 자료형[] 배열명 = new 자료형[방의개수];
// *  2) 자료형 배열명[] = new 자료형[방의개수];
// * 
// * 	- '같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
// * 
// *  - 인덱스(index) : 0부터 시작하는 방 번호가 부여된다.
// *  
// *  - 엘리먼트(element) : 배열의 요소를 지칭한다.
// *  
// *  - 배열은 생성시에 초깃값이 부여되어 있다.
// *    String 배열의 초기값   : null
// *    int 배열의 초기값     : 0
// *    double 배열의 초기값  : 0.0
// *    char 배열의 초기값    : '0'
// *    boolean 배열의 초기값 : false
// *    
// *  - 배열은 주소변수이다.
// *  
// *  - 배열을 크기가 변하지 않는다. 배열의 요소를 삭제하여도 배열의 크기는 고정되어있다.
// *  
// *  - 배열의 요소를 지우는 것은 배열의 초깃값으로 다시 저장하는 것을 의미한다.
// * 
// *  - null을 대입함으로써 배열의 전체를 삭제할 수 있다.
// *  
// * */


package step2_01.array;

public class ArrayEx01 {

	public static void main(String[] args) {
		
//		int[] arr = null;// 주소변수의 초기값
//		arr = new int[5];
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// java.lang.ArrayIndexOutOfBoundsException
		// 배열의 최대범의를 넘었을 때
		
		for (int num : arr) System.out.println(num);
		
		System.out.println();
		
		// 배열이름.length > 배열의 길이
		for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);
		
		System.out.println();
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		// 배열의 요소(element)는 삭제 불가  >> 삭제 가능한 ArrayList, LinkedList 
		// 초기값으로 reset, 초기값은 상단 메모 참고
		arr[3] = 0;
		arr[4] = 0;
		
		for (int num : arr) System.out.println(num);
		
		// null 대입하면 배열 자체 삭제
		arr = null;
	}

}
