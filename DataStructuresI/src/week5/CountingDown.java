package week5;

public class CountingDown {
	public static void main(String[] args) {
	int num = 5;
	System.out.print(countDown(num));
	}
	
	public static int countDown(int num) {
	    if (num == 1) {
	    	return num;
	    }
	    else {
	    	System.out.print(num + ", ");
	    	return countDown(num - 1);
	    }
		
	}	
}

