package week5;

public class ReverseString {
	public static void main(String[] args) {
		
		//char letters[] = "hello".toCharArray();
		
		String word = "hello";
		
		System.out.print(reverse(word));
		
	}
		
		public static String reverse(String word) {
			if (word.length() == 0) {
				return word;
			}
			else {
				System.out.print(word.charAt(word.length()-1));
				return reverse(word.substring(0, word.length() - 1));
			}
		}

}
