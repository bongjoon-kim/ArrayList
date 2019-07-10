package Arrayist;

public class Main {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.addLast(10);
		arr.addLast(20);
		arr.addLast(30);
		arr.addLast(40);
		
		arr.add(1, 15);
		arr.add(4, 35);
		
		arr.addFirst(5);
		arr.addFirst(4);

		arr.allPrint();
	}

}
