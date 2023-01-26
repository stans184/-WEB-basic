package step1_01.print; // 1) package 선언문은 '항상' 첫줄에 작성
// 2) 주석(comment) 설명문, 프로그램 실행에 영향 X
// 2-1) line 주석, 한줄 통채로
/*
   2-2) block 주석, 여러줄
   안병욱님이 수정 요청함
 */
/*
 *  3) 에디터 화면 확대 및 축소 : ctrl + [+] , ctrl + [-]
 *  
 *  
 *  4) 뒤로 되돌리기(redo)  : ctrl + z
 *    앞으로 되돌리기(undo) : ctrl + y
 * 
 * 
 *  5) 저장 : ctrl + s  ,  저장하지 않았을 경우 파일명 왼쪽에 *표시가 나옴. ( 항상 저장하는 습관 권장 )
 *  
 *  
 *  6) 출력문 자동완성
 *  
 *  	6-1) sout + ctrl + space
 *  	6-2) sysout + ctrl + space
 *  
 *  
 *  7) 유용한 단축키 
 *  
 * 		7-1) 복사    			  : ctrl + alt + 위 or 아래 방향키
 * 		7-2) 이동     			  : alt + 위 or 아래 방향키
 * 		7-3) 블록잡기 			  : shift + 위 or 아래 방향키
 * 		7-4) 삭제     			  : ctrl + d
 * 	    7-5) 단어 찾기 			  : ctrl + f
 * 	    7-6) 화면 최대화 & 최소화    : ctrl + m
 * */
public class PrintEx01 {

	public static void main(String[] args) { // main method {} 안에서만 프로그래밍
		// tab 들여쓰기 이후에 코드를 작성
//		System.out.println('DATA'); DATA를 화면에 출력하고 개행
//		System.out.print(); 출력만 함
			
		System.out.println("=========");
		System.out.println("메뉴 선택");
		System.out.println("=========");
		System.out.println();
		
		System.out.println("1) login");
		System.out.println("2) logout");
		System.out.println("3) exit");
		System.out.println();
		
		System.out.print("Print testing / ");
		System.out.print("12356 / ");
		System.out.print("84651 / ");
		
				
	}
}