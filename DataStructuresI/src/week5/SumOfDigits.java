package week5;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 12345;
		System.out.println(sum(num));
		
	
	}
	public static int sum(int num) {
		int sum = 0;
		if (num == 0) {
			return sum;
		}
		else {	
			sum = num % 10;
			return sum + sum(num / 10);
		}
	}

}
