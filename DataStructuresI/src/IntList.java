package week6;

import java.util.*;

public class IntList {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		int item = 2;

		int ans = search(list, item);

		boolean found;

		if (ans == -1) {
			found = false;
		} else {
			found = true;
		}

		System.out.println(found);
	}

	public static int search(LinkedList<Integer> list, int item) {
		return search(list, 0, item); // Call recursive search
	}

	public static int search(LinkedList<Integer> list, int head, int item) {
		if (head == list.size()) // Base case: empty list - failure
			return -1;
		else if (list.get(head) == item)// Base case: key found -- success
			return head;
		else // Recursive case: search the tail
			return search(list, head + 1, item);
	}

}