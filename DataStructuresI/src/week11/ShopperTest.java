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
		Shopper s1 = new Shopper("h", 2, 3);
		Shopper s2 = new Shopper("i", 4, 6);
		Shopper s3 = new Shopper("j", 4, 6);

		MyPriorityQueue<Shopper> pq = new MyPriorityQueue<>();

		pq.enqueue(s1);
		pq.enqueue(s2);
		pq.enqueue(s3);

		assertTrue(isStableOrder(pq, s1, s2, s3));
	}

	private boolean isStableOrder(MyPriorityQueue<Shopper> pq, Shopper s1, Shopper s2, Shopper s3) {
		Shopper high = pq.dequeue();
		Shopper med = pq.dequeue();
		Shopper low = pq.dequeue();
		if (high.getTotalPurchase() < med.getTotalPurchase() || high.getTotalPurchase() < low.getTotalPurchase()) {
			return false;
		} else if (med.getTotalPurchase() < low.getTotalPurchase()) {
			return false;
		} else if (high.getTotalPurchase() == med.getTotalPurchase()) {
			if (high.getId() > med.getId()){
				return false;
			}
		}	
			pq.enqueue(high);
			pq.enqueue(med);
			pq.enqueue(low);
			
			//check if order is kept
			Shopper first = pq.dequeue();
			Shopper second = pq.dequeue();
			Shopper third = pq.dequeue();
			
		return first.equals(s2) && second.equals(s3) && third.equals(s1);
	}

}
