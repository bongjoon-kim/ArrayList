package LinkedList;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {
		private Object data;
		private Node next;
		
		private Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) {
			tail = newNode;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public void add(int index, Object input) {
		Node newNode = new Node(input);
		Node curNode = head;
		Node nextNode = null;
		if(size == 0 || index == 0) {
			addFirst(input);
		} else if(index >= size) {
			addLast(input);
		} else {
			for (int i = 1; i < index; i++) {
				nextNode = curNode.next;
				curNode = nextNode;
			}
			newNode.next = curNode.next;
			curNode.next = newNode;
			size++;
		}
	}	
	
	public Object get(int index){
		Node curNode = head;
		Node nextNode = null;
		if (index >= size) {
			return -1;
		}
		for (int i = 0; i < index; i++) {
			nextNode = curNode.next;
			curNode = nextNode;
		}
		return curNode.toString();
	}
	
	public void allPrint() {
		System.out.print("[");
		for(int i = 0; i < size; i++) {
			System.out.print(get(i));
			if (i < size-1)
				System.out.print(",");
		}
		System.out.println("]");		
	}
}
