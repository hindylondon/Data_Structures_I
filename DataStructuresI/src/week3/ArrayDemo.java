package week3;

public class ArrayDemo {
	public static void main(String[] args) {
		int size = 3;
		GenericArray ga = new GenericArray(size);
		
		ga.set(0,1);
		ga.set(1,2);
		ga.set(2,3);
		
		System.out.println("Array:");
		for (int i = 0; i < size; i++) {
			Object num = ga.get(i);
			System.out.println(num + " ");
		}
		
		ga.set(0,4);
		ga.set(1,5);
		ga.set(2,6);
		
		System.out.println("Modified Array:");
		for (int i = 0; i < size; i++) {
			Object num = ga.get(i);
			System.out.println(num + " ");
		}
		
		int length = ga.size();
		System.out.println("Size: " + length);
		
		boolean empty = ga.isEmpty();
		System.out.println("Empty: " + empty);
	
	GenericArray storage = new GenericArray(3);
	
	storage.set(0, "Hi");
	storage.set(1, "Hello");
	storage.set(2, "Goodbye");
	
	System.out.println("String Array:");
	for (int i = 0; i < size; i++) {
		Object word = storage.get(i);
		System.out.println(word + " ");
	}
	
	int storageLength = storage.size();
	System.out.println("String Array Size: " + storageLength);
	
	boolean storageEmpty = storage.isEmpty();
	System.out.println("String Array Empty: " + storageEmpty);

}
	
}