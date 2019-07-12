package LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		
		//numbers.add2(2,25);
		numbers.add(2,25);
		
		System.out.println(numbers);
		numbers.allPrint();
	}

}
