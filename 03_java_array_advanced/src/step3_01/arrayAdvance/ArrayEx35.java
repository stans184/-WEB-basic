package step3_01.arrayAdvance;
// 소스분석 > 타이핑 > 프로그래밍 연습
import java.util.Arrays;
import java.util.Scanner;
/*
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 */
public class ArrayEx35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int elementCnt = 0;
		
		while (true) {
			
			if(elementCnt != 0) System.out.println(Arrays.toString(score));
			System.out.println();
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			// 추가
			if (sel == 1) {
				// 아무거도 없으면 score new array 생성
				if (elementCnt == 0) score = new int[elementCnt + 1];
				// 하나 이상이라면
				else if (elementCnt > 0){
					// temp 배열에 score 배열의 링크를 넘겨줌
					int[] temp = score;
					// score에다가 기존 eleCnt 에다가 한개 더해서 new 배열 생성
					score = new int[elementCnt + 1];
					// 기존에 들어있던 element들을 1대 1 매칭시켜서 넘겨줌
					for (int i = 0; i < elementCnt; i++) {
						score[i] = temp[i];
					}
					// temp 배열 초기화
					temp = null;
				}
				System.out.print("[추가]성적 입력 : ");
				int data = scan.nextInt();
				// 새로 받은 데이터를 score 배열의 마지막 부분에 삽입
				score[elementCnt] = data;
				elementCnt++;
			}
			// 인덱스 삭제
			else if (sel == 2) {
				System.out.print("[삭제]인덱스 입력 : ");
				int delIdx = scan.nextInt();
				// 인덱스 범위에 따른 에러범위 설정
				if (elementCnt - 1 < delIdx || delIdx < 0) {
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				// cnt가 하나면 그냥 score 배열 초기화해버림
				if (elementCnt == 1) score = null;
				// 하나 이상이라면
				else if (elementCnt > 1) {
					// temp 배열에 score 넘기고
					int[] temp = score;
					// score 를 기존 eleCnt 에서 하나 뺀 값으로 초기화
					score = new int[elementCnt - 1];
					// 삭제를 원하는 인덱스 이전은 그냥 1대 1 매칭시켜서 넘김
					for (int i = 0; i < delIdx; i++) {
						score[i] = temp[i];
					}
					// 삭제를 원하는 인덱스 이후는 뒤에값을 땡겨와서 매칭
					for (int i = delIdx; i < elementCnt - 1; i++) {
						score[i] = temp[i + 1];
					}
					// 임의 배열 초기화
					temp = null;
				}
				// eleCnt 하나 뺌
				elementCnt--;
			}
			// 값 삭제
			else if (sel == 3) {
				System.out.print("[삭제]값 입력 : ");
				int delData = scan.nextInt();
				// 삭제할 값이 들어있는 idx 값 초기화
				int delIdx = -1;
				// 삭제할 값의 idx 위치 찾기
				for (int i = 0; i < elementCnt; i++) {
					if (score[i] == delData) delIdx = i;
				}
				// 삭제할 값이 없는 경우
				if (delIdx == -1) {
					System.out.println("[메세지]입력하신 값은 존재하지 않습니다.");
					continue;
				}
				// eleCnt 가 1개일경우 그냥 score를 초기화해버림
				if (elementCnt == 1) score = null;
				// 한개 이상일 경우
				else if (elementCnt > 1) {
					// 임의 배열에 넘기고
					int[] temp = score;
					// 한개 작은 수로 score 초기화
					score = new int[elementCnt - 1];
					// 삭제인덱스를 빼고 넣기 위해서 임의의 idx 설정
					int j = 0;
					// 배열을 쭉 훑으면서 해당하는 인덱스 값이 있다면 안넣고, 없다면 temp 값 넣으면서 j += 1
					for (int i = 0; i<elementCnt; i++) {
						if (i != delIdx) score[j++] = temp[i];
					}
					// 임의 배열 초기화
					temp = null;
				}
				// eleCnt 하나 빼기
				elementCnt--;				
			}
			else if (sel == 4) {
				System.out.print("[삽입]인덱스 입력 : ");
				int insertIdx = scan.nextInt();
				// 삽입을 원하는 위치의 에러범위 설정
				if (elementCnt < insertIdx || insertIdx < 0) {
					System.out.println("[메세지]해당 위치는 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("[삽입]값 입력 : ");
				int insertData = scan.nextInt();
				// 만약 score 가 비어있다면 한개 늘려서 초기화
				if (elementCnt == 0) score = new int[elementCnt + 1];
				// 한개 이상이라면
				else if (elementCnt > 0) {
					// 임의의 배열에 넘기고
					int[] temp = score;
					// 한개 더한값으로 score 배열 초기화
					score = new int[elementCnt + 1];
					// 임의의 값으로 넣기 위한 idx 설정
					int j = 0;
					// 해당하는 idx 가 없다면, temp에서 하나씩 넘기고, temp의 idx를 임의로 하나씩 증가시킴
					for (int i = 0; i < elementCnt + 1; i++) {
						if (i != insertIdx) score[i] = temp[j++];
					}
					// temp 초기화
					temp = null;
				}
				// score에서 삽입하고 eleCnt 늘려줌
				score[insertIdx] = insertData;
				elementCnt++;
			}
			else if (sel == 0) {
				break;
			}
		}

		scan.close();
	}
}