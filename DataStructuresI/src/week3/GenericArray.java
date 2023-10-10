package week3;

public class GenericArray<T> {
	private T[] genericArray;
	
	//constructor
	public GenericArray(int size) {
		Object[] genericArray;
		this.genericArray= (T[]) new Object[size];
	}
	
	//get
	public T get(int index) {
		return (T) genericArray[index];
	}
	
	//set
	public void set(int index, T value) {
		genericArray[index] = value;
	}
	
	//size
	public int size() {
		return this.genericArray.length;
	}
	
	//isEmpty
	public boolean isEmpty() {
		if (this.genericArray.length == 0) {
			return true;
		} else {
			return false;
		}
	}	

}
