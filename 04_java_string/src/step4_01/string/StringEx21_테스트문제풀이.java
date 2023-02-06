package step4_01.string;
//문제) moneyData 와 nameData 를 조합해서 userData를 아래와같이 만들어보세요
/*
* 100001/한놈/600
* 100003/석삼/7000
* 100001/한놈/100
* 100002/두시기/400
* 100001/한놈/600
* 100004/너구리/900
* 100001/한놈/130
* 100003/석삼/200
* 100002/두시기/700
* 100002/두시기/900
* 100004/너구리/800
*/
public class StringEx21_테스트문제풀이 {

	public static void main(String[] args) {
				
		String nameData = "";
		nameData +=	"100001/한놈\n";		
		nameData += "100002/두시기\n";
		nameData += "100003/석삼\n";
		nameData += "100004/너구리\n";
		nameData += "100005/오징어\n";
		nameData += "100006/육개장";
		
		String  moneyData = "";
		moneyData += "100001/600\n";	
		moneyData += "100003/7000\n";		
		moneyData += "100001/100\n";		
		moneyData += "100002/400\n";		
		moneyData += "100001/600\n";		
		moneyData += "100004/900\n";		
		moneyData += "100001/130\n";		
		moneyData += "100003/200\n";		
		moneyData += "100002/700\n";	
		moneyData += "100002/900\n";
		moneyData += "100004/800";

		String userData = "";
		
		String[] nameSplit = nameData.split("\n");
		String[][] nameCheck = new String[nameSplit.length][2];
		
		for (int i = 0; i < nameSplit.length; i++) {
			String[] tmp = nameSplit[i].split("/");
			for (int j = 0; j < tmp.length; j++) {
				nameCheck[i][j] = tmp[j];
			}
		}
		
		String[] moneySplit = moneyData.split("\n");
		
		for (int i = 0; i < moneySplit.length; i++) {
			String[] tmp = moneySplit[i].split("/");
			String name = null;
			
			for (int j = 0; j < nameCheck.length; j++) {
				if (tmp[0].equals(nameCheck[j][0])) {
					name = nameCheck[j][1];
				}
			}
			userData += tmp[0] + "/" + name + "/" + tmp[1] + "\n";
		}

		System.out.println(userData);

	}
}