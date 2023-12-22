package week11;

public class Store {
	public static void main(String[] args) {
		//instantiate all the shoppers
		Shopper shopper = new Shopper("", 0, 0);
		Shopper[] customers = { 
				new Shopper("Bob", 0, 0), 
				new Shopper("Joe", 0, 0), 
				new Shopper("Tom", 0, 0),
				};


		//instantiate the priorityQueue
		MyPriorityQueue<Shopper> pq = new MyPriorityQueue<>();
		
		//the shoppers go shopping
		shopper.goShopping(pq, customers);
		
		//time for checkout, call that method
		System.out.println("Checkout time!");
		shopper.checkout(pq);
		

	}

}
