package step7_01.objectArray;
// 추가하기
// 삽입하기
// 출력하기
// (index로)삭제하기
// 길이 구하기
// (index로)값 꺼내오기
// 특정 위치의 값 수정하기
// 모든 데이터를 제거하기

class testIntArray{

	int[] arr;
	int eleCnt;
	
	void add(int value) {
		if (eleCnt == 0) {
			arr = new int[eleCnt+1];
			arr[0] = value;
			eleCnt += 1;
		}
		else {
			int[] tmp = new int[eleCnt+1];
			
			for (int i = 0; i < arr.length; i++) tmp[i] = arr[i];
			tmp[eleCnt] = value;
			
			arr = new int[eleCnt+1];
			arr = tmp;
			eleCnt += 1;
		}
	}
	
	void add(int idx, int value) {
		int[] tmp = new int[eleCnt+1];
		
		for (int i = 0; i < idx; i++) tmp[i] = arr[i];
		for (int i = idx; i < arr.length; i++) tmp[i+1] = arr[i];
		tmp[idx] = value;
		arr = new int[eleCnt+1];
		arr = tmp;
		eleCnt += 1;
	}
	
	void set(int idx, int value) {arr[idx] = value;}
	
	int get(int idx) {return arr[idx];}
	
	void print() {
		System.out.print("[");
		if (eleCnt > 0) {
			for (int i = 0; i < eleCnt; i++) {
				System.out.print(arr[i]);
				if (i >= 0 && i < eleCnt-1) System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	int size() {return eleCnt;}
	
	void remove(int idx) {
		int[] tmp = new int[eleCnt-1];
		
		for (int i = 0; i < idx; i++) tmp[i] = arr[i];
		for (int i = idx; i < arr.length-1; i++) tmp[i] = arr[i+1];
		
		arr = new int[eleCnt-1];
		arr = tmp;
		eleCnt -= 1;
	}
	
	void clear() {
		arr = null;
		eleCnt = 0;
	}
}

public class ObjectArrayEx13_풀이1 {

	public static void main(String[] args) {
		// 추가하기
		// 삽입하기
		// 출력하기
		// (index로)삭제하기
		// 길이 구하기
		// (index로)값 꺼내오기
		// 특정 위치의 값 수정하기
		// 모든 데이터를 제거하기
		testIntArray testArray = new testIntArray();
		
		for (int i = 0; i < 5; i++) testArray.add(i+1);
		testArray.print();
		
		testArray.add(3, 10);
		testArray.print();
		
		testArray.remove(0);
		testArray.print();
		
		System.out.println(testArray.size());
		System.out.println(testArray.get(2));
		
		testArray.set(3, 80);
		testArray.print();
		
		testArray.clear();
		testArray.print();
		
		testArray.add(10);
		testArray.add(20);
		testArray.print();
	}
}