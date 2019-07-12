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
	
	//강의	
	public void add(int k, Object input) {
		if(k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k - 1);
			Node newNode = new Node(input);
			newNode.next = temp1.next;
			temp1.next = newNode;
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	//강의안보고 만든거
	public void add2(int index, Object input) {
		if(size == 0 || index == 0) {
			addFirst(input);
		} else if(index >= size) {
			addLast(input);
		} else {
			Node newNode = new Node(input);
			Node curNode = head;
			Node nextNode = null;
			for (int i = 0; i < index - 1; i++) {
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
	
	Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
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
	
	public String toString() {
		if (head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		while(temp.next != null) {
			str += temp.data + ",";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}
}
