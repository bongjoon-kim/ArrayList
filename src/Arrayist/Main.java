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
		
		System.out.println(arr.get(1));
		System.out.println(arr.get(5));

		System.out.println("toString : " + arr.toString());
		
		System.out.println("size : " + arr.size());
		
		System.out.println("indexOf : " + arr.indexOf(7));
		
		arr.addLast(10);
		arr.addLast(20);
		arr.addLast(30);
		arr.addLast(40);	
		
		System.out.println("size : " + arr.size());
	}

}
