package step4_01.string;

import java.util.Arrays;

public class StringEx07_문제 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		String[] spStr = str.split(",");
		
		for (int i = 0; i < spStr.length; i++) {
			String[] test = spStr[i].split("/");
			
			for (int j = 0; j < test.length; j++) {
				
				if (j == 0) name[i] = test[j];
				else score[i] = Integer.parseInt(test[j]);
			}
		}
		
		System.out.print("name : ");
		System.out.println(Arrays.toString(name));
		
		System.out.print("age : ");
		System.out.println(Arrays.toString(score));

	}

}
