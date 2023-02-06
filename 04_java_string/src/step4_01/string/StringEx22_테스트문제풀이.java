package step4_01.string;
//문제) 아래의 데이터는  각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
//		 데이터를 아래와 같이 출력 하시요 (각 회원별 구입 총합 )	
/*
  =====================
	10001 김철수 2670
	10002 이영희 1950
	10003 유재석 4080
	10004 박명수 7130
   =====================		  
 */
public class StringEx22_테스트문제풀이 {

	public static void main(String[] args) {
		
		String data  = "10001/김철수/600\n";
			   data += "10002/이영희/800\n";
			   data += "10001/김철수/1400\n";
			   data += "10003/유재석/780\n";
			   data += "10002/이영희/950\n";
			   data += "10004/박명수/330\n";
			   data += "10001/김철수/670\n";
			   data += "10003/유재석/3300\n";
			   data += "10002/이영희/200\n";
			   data += "10004/박명수/6800\n";
		
		String[] spData1 = data.split("\n");
		String[][] spData2 = new String[spData1.length][3];
		
		for (int i = 0; i < spData1.length; i++) {
			spData2[i] = spData1[i].split("/");
		}
		
		int[] totalPrice = new int[4];
		
		for (int i = 0; i < spData1.length; i++) {
			if (spData2[i][0].equals("10001")) {
				totalPrice[0] += Integer.parseInt(spData2[i][2]);
			}
			else if (spData2[i][0].equals("10002")) {
				totalPrice[1] += Integer.parseInt(spData2[i][2]);
			}
			else if (spData2[i][0].equals("10003")) {
				totalPrice[2] += Integer.parseInt(spData2[i][2]);
			}
			else if (spData2[i][0].equals("10004")) {
				totalPrice[3] += Integer.parseInt(spData2[i][2]);
			}
		}
		
		System.out.println("=====================");
		for (int i = 0; i < totalPrice.length; i++) {
			String name = null;
			String code = 10001 + i + "";
			
			for (int j = 0; j < spData1.length; j++) {
				if (spData2[j][0].equals(code)) {
					name = spData2[j][1];
				}
			}
			
			System.out.println(" " + code + " " + name + " " + totalPrice[i]);
		}
		System.out.println("=====================");
	}
}