package week10;

public class CircularQueue<T> {
	//fields
	private Node<T> rear;
	private int size;

	//constructor
	public CircularQueue() {
		rear = null;
		size = 0;
	}

	//Node class
	private class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	//enqueue s/t to the queue, adds to size
	public void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			newNode.next = newNode; // Point to itself for the first node
		} else {
			newNode.next = rear.next; // New node points to the head
			rear.next = newNode; // Rear now points to the new node
		}
		rear = newNode; // The new node is now the rear
		size++;
	}

	//dequeues from queue, returns what it is dequeueing
	//circular, if xthing then goes back to the top
	public T dequeue() {
		if (!isEmpty()) {
			T data = rear.next.data; // Get the data of the head
			if (rear.next == rear) {
				rear = null; // If only one node, make the queue empty
			} else {
				rear.next = rear.next.next; // Skip the head in the circular linked list
			}
			size--;
			return data;
		}
		return null;
	}

	//returns if queue is empty
	public boolean isEmpty() {
		return size == 0;
	}

	//returns size of queue
	public int size() {
		return size;
	}

	//returns strung of the whole queue
	@Override
	public String toString() {
		if (isEmpty()) {
			return "Queue is empty";
		}

		StringBuilder result = new StringBuilder();
		Node<T> current = rear.next;
		do {
			result.append(current.data).append(" ");
			current = current.next;
		} while (current != rear.next);

		return result.toString().trim();
	}
}
