package Arrayist;

public class ArrayList {
	private Object[] elements = new Object[100];
	private int size = 0;
	
	public boolean addFirst(Object e) {
		return add(0, e);
	}
	
	public boolean addLast(Object e) {
//		elements[size] = e;
//		size++;
//		return true;
		return add(size, e);
	}
	
	public boolean add(int index, Object e) {
		for (int i = (size - 1) ; i >= index; i--) {
			elements[i + 1] = elements[i];
		}
		elements[index] = e;
		size++;
		return true;
	}	
	
	public void allPrint() {
		for(Object e: elements) {
			if (e != null)
				System.out.println(e);
		}
	}
}
