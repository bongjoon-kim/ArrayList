package ArrayList;

public class ArrayList {
	private Object[] elementData = new Object[10];
	private int size = 0;
	
	public void extendArray() {
		if (elementData.length == size) {
			Object[] ed = elementData;
			elementData = new Object[size + 10];
			for(int i = 0; i < size; i++) {
				elementData[i] = ed[i]; 
			}
		}
	}
	
	public boolean addFirst(Object e) {
		return add(0, e);
	}
	
	public boolean addLast(Object e) {
		extendArray();
		elementData[size] = e;
		size++;
		return true;
	}
	
	public boolean add(int index, Object e) {
		extendArray();
		for (int i = (size - 1) ; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = e;
		size++;
		return true;
	}
	
	public Object remove(int index) {
		Object remove = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i+1];
		}
		size--;
		return remove;
	}
	
	public Object removeFirst(){
	    return remove(0);
	}
	 
	public Object removeLast(){
	    return remove(size-1);
	}	
	
	public Object get(int index) {
		return elementData[index];
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(Object e) {
		for (int i = 0; i < size; i++) {
			if(e.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}	
	
	public String toString() {
		String str = "[";
		for(int i=0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1)
				str += ",";
		}
		str += "]";
		return str;
	}

}
