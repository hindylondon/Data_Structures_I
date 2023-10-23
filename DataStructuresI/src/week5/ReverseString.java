package week5;

public class ReverseString {
	public static void main(String[] args) {
		
		char letters[] = "hello".toCharArray();

		for( int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
		}
	}

}