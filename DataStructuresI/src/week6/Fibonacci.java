package week6;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("Fibonacci While Loop: " + fibWhile(n));
		System.out.println("Fibonacci Head Recursion: " + fibHead(n));
		System.out.println("Fibonacci Tail Recursion: " + fibTail(n));
	}

	public static int fibWhile(int n) {
		n = n - 1;
		int n1= 0;
		int n2 = 1;
		int total = 0;
		while(n > 0) {
			total = n1 + n2;
			n1 = n2;
			n2 = total;
			n --;
		}
		return total;
	}
	
	public static int fibHead(int n) {
		if (n <= 1) {
			return n;
		} else {
			int prev1 = fibHead(n - 1);
			int prev2 = fibHead(n - 2);
			return prev1 + prev2;
		}
	}
	
	public static int fibTail(int n) {
		if (n <= 0) {
			return 0;
		}
		return calculateFib(n, 0, 1);
		
	}

	public static int calculateFib(int n, int a, int b) {
		if (n == 1) {
			return b;
		} else {
			return calculateFib(n-1, b, a + b);
		}
	}

}


/*
Question 4:  Extra Credit 50 points 

Implement Fibonacci three ways ( you can use our slides for this answer )

Create client code to interact with the following versions of this algorithm: 
Fibonacci using a While loop (no recursion)
Fibonacci Head Recursion (classic and computationally expensive)
Tail Recursion (no computation happens after the return)
*/
