package LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		
		numbers.addLast(40);
		numbers.addLast(50);
		numbers.addFirst(5);
		
		numbers.add(4,35);
		numbers.add(1,7);
		numbers.add(0,3);
		numbers.add(9,60);
		numbers.add(0,2);
		numbers.add(6,25);
		
		System.out.println(numbers.get(5));
		numbers.allPrint();
	}

}
