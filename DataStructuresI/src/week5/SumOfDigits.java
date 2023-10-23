package week5;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 12345;
		int result = sum(num);
		System.out.println(result);
		
	
	}
	public static int sum(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

}
