package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * - String 은 int, boolean, double 과 다름
 * */
public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = "james";
		
		System.out.print("Enter the name : ");
		String getName = sc.next();
		
		// 비교 불가
		if (getName == name) System.out.println("== O");
		else System.out.println("== X");
		
		System.out.println();
		
		// string class에 구현된 method를 활용해야 함
		if (name.equals(getName)) System.out.println("equals method, O");
		else System.out.println("equals method, X");
		
		sc.close();
	}
}