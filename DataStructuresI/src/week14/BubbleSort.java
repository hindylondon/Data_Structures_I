package week14;

import java.util.Comparator;

//T -> generic datatype, takes any in the sort
public class BubbleSort<T extends Comparable<T>> {
	// field
	private Comparator<T> comparator;
	private int accum;

	//constructor
	public BubbleSort() {
		this.comparator = (a, b) -> ((Comparable<T>) a).compareTo(b);
	}

	//comparator constructor
	public BubbleSort(Comparator<T> comparator) {
		this.comparator = (a, b) -> ((Comparable<T>) a).compareTo(b);
	}

	//comparable constructor
	public BubbleSort(Comparable<T> comparable) {
		this.comparator = (a, b) -> comparable.compareTo((T) b);
	}

	public int getAccum() {
		return accum;
	}
	
	//bubble sort method
	public void bubbleSort(T[] arr) {
		int n = arr.length;
		//instantiate accumulator
		accum = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				//if the second one is bigger then you have to switch
				if (comparator.compare(arr[j], arr[j + 1]) > 0) {
					System.out.println(arr[j].toString() + " is greater than " + arr[j + 1].toString() + ". Time to swap!");
					
					// Swap arr[j] and arr[j + 1]
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					accum++;
				}
			}
		}
		//output how many comparisons
		System.out.println("This sort made " + accum + " comparisons.");
	}

}