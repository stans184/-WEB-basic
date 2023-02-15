package step7_01.objectArray;

class CardClover {
	int num;
	String shape;
}

public class ObjectArrayEx02_풀이1 {

	public static void main(String[] args) {
		
		 CardClover[] cardClo = new CardClover[10];
		 
		 // for문 활용
		 for (int i = 0; i < cardClo.length; i++) {
			 cardClo[i] = new CardClover();
			cardClo[i].num = (i+1);
			cardClo[i].shape = "클로버";
		 }
		 
		 for (int i = 0; i < cardClo.length; i++) {
			System.out.println(cardClo[i].shape + " " + cardClo[i].num);
		 }
		 
	}
}