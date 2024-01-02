package week11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShopperTest {

	@Test
	void testIfGetCouponIfOver50() {
		Shopper man = new Shopper("Dan", 5, 60);
		assertTrue(man.getCoupon(60));
	}

	@Test
	void testIfStableSort() {
		MyPriorityQueue<Shopper> pq = new MyPriorityQueue<>();
		
		// create 2 shopper with equal totalPurchaseValue
		Shopper second = new Shopper("i", 4, 6);
		Shopper third = new Shopper("j", 4, 6);
		Shopper first = new Shopper("h", 4, 8);
		
		pq.enqueue(second);
		pq.enqueue(third);
		pq.enqueue(first);
		
		//sort and check for stable
		Shopper s1 = pq.dequeue();
		Shopper s2 = pq.dequeue(); 
		Shopper s3 = pq.dequeue();
		

		assertEquals(s1.getName(), "h");
		assertEquals(s2.getName(), "i");
		assertEquals(s3.getName(), "j");
		

	}

}
