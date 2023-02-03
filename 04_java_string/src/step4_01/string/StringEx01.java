package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 입력
 * 
 *  next() : 공백을 기준으로 <한단어> 만 입력받는다.
 *  nextLine() : <한 줄> 을 띄어쓰기 포함해서 전부 입력
 *  nextLine 의 단점은, 바로 위에 scanner 입력이 있다면, 그걸 입력하며 받아진 <enter> 를 뒤에 따라오는 nextLine 이 바로 읽어오게 된다
 *  그래서 sc.nextLine(); 을 넣어서 <enter> 를 먹어주는 작업이 필요하다
 * */
public class StringEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter Product name : ");
//		String pdtName = sc.next();						// 단어 입력 (띄어쓰기 X)
//		System.out.println("Product name : " + pdtName);
		
		System.out.print("Product Price : ");
		int pdtPrice = sc.nextInt();
		System.out.println("Price : " + pdtPrice);

//		sc.nextLine(); 
		
		System.out.print("Enter product name : ");
//		String pdtName2 = sc.nextLine();
//		nextLine 을 사용하면, 위쪽에 nextInt를 입력하며 입력된 Enter 를 읽어오게 된다
//		을 둘 사이에 입력해서 enter를 가져가게 해야 한다
		
		String pdtName2 = sc.next();
		System.out.println("product name : " + pdtName2);
		
		sc.close();
	}

}