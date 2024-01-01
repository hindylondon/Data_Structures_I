package week14;

import java.util.Comparator;

//T -> generic datatype, takes any in the sort
public class SelectionSort<T extends Comparable<T>> {
	//field
	private Comparator<T> comparator;
	private int accum;

	//constructor
	public SelectionSort() {
		this.comparator = (a, b) -> ((Comparable<T>) a).compareTo(b);
	}
	
	public int getAccum() {
		return accum;
	}

	//comparator constructor
	public SelectionSort(Comparator<T> comparator) {
		this.comparator = (a, b) -> ((Comparable<T>) a).compareTo(b);
	}

	//comparable constructor
	public SelectionSort(Comparable<T> comparable) {
		this.comparator = (a, b) -> comparable.compareTo((T) b);
	}

	//selection sort method
	public void selectionSort(T[] arr) {
		int n = arr.length;
		//instantiate accumulator
		accum = 0;

		for (int i = 0; i < n - 1; i++) {
			// Assume the current index is the minimum
			int minIndex = i;

			// Find the index of the minimum element in the remaining unsorted array
			for (int j = i + 1; j < n; j++) {
				if (comparator.compare(arr[j], arr[minIndex]) < 0) {
					System.out.println(arr[j] + " is less then " + arr[minIndex] + ". Time to swap!");
					minIndex = j;
					accum++;
				}
			}

			// Swap the found minimum element with the first element of the unsorted array
			T temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		//print out number of comparisons
		System.out.println("This sort made " + accum + " comparisons.");
	}

}