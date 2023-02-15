package step7_01.objectArray;

class Mem{
	String name;
	int num;
}

class MemList{
	Mem[] memList = new Mem[3];
}

public class ObjectArrayEx06_풀이1 {

	public static void main(String[] args) {
		
		MemList ml = new MemList();
		
		Mem m1 = new Mem();
		m1.name = "kim";
		m1.num = 1;
		ml.memList[0] = m1;
		
		m1 = new Mem();
		m1.name = "lee";
		m1.num = 2;
		ml.memList[1] = m1;
		
		m1 = new Mem();
		m1.name = "kang";
		m1.num = 3;
		ml.memList[2] = m1;
		
		for (int i = 0; i < ml.memList.length; i++) {
			System.out.println(ml.memList[i].name + ", " + ml.memList[i].num);
		}
		System.out.println();
		Mem tmp = ml.memList[1];
		System.out.println(tmp.name + ", " + tmp.num);
	}
}
