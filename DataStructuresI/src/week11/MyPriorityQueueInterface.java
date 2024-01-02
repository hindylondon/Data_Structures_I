package week11;

public interface MyPriorityQueueInterface<T> {
	public void enqueue(T element);
	public T dequeue();
	public boolean isEmpty();
	public void heapifyUp();
	public void heapifyDown();
	public void swap(int i, int j);
	
	

}
