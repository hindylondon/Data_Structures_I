package week5;

public class CountingDown {
	public static void main(String[] args) {
	int num = 5;
	int result[] = countDown(num);
	System.out.print(num);
	for (int i = 0; i < result.length - 1; i++) {
		System.out.print(", " + result[i]);
	}
	

}
	public static int[] countDown(int num) {
	    int countDown = num - 1;
	    int temp[] = new int[num];
	    
	    while (countDown > 0) {
	        for (int i = 0; i < num; i++) {
	            temp[i] = countDown;
	            countDown--;
	        }
	    }
	    return temp;
	}
}

