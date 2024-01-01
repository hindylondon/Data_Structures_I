package week14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to your custom sorter!");
		System.out.println();
		
		System.out.println("Here is an example of a Bubble Sort: ");
		
		Car[] cars = {
				new Car("Tesla"),
				new Car("Ferrari"),
				new Car("Mustang")
		};
		
		BubbleSort<Car> bubSort = new BubbleSort<>();

		System.out.println("Original Array: ");
		for (Car car : cars) {

			System.out.println(car.getName() + " ");
		}

		//call the sort method
		bubSort.bubbleSort(cars);

		System.out.println("Sorted Array: ");
		for (Car car : cars) {

			System.out.println(car.getName() + " ");
		}
		
		System.out.println();

		String again = "y";

		//allow the user to sort again and again
		while (again.toLowerCase().equals("y")) {
			//get user input for the data type of the sort
			System.out.println("What type of list would you like to sort? ");
			System.out.println("1) Integers 2) Words ");
			int listType = input.nextInt();

			//input val for data type
			while (listType != 1 && listType != 2) {
				System.out.println("Invalid Entry. Please enter 1 or 2.");
				System.out.println("What type of list would you like to sort? ");
				System.out.println("1) integers 2) words ");
				listType = input.nextInt();

			}

			//get user input for the length of the list
			System.out.println("How long is the list you would like to sort? ");
			int length = input.nextInt();

			//input val for list length
			while (length < 0) {
				System.out.println("Invalid Entry. Entry must be a positive number.");
				System.out.println("How long is the list you would like to sort? ");
				length = input.nextInt();
			}

			//get user input for type of sort
			System.out.println("Which sort would you like to do?");
			System.out.println("1) Bubble Sort \n2) Selection Sort");
			int sort = input.nextInt();

			//input val for sort type
			while (sort != 1 && sort != 2) {
				System.out.println("Invalid Entry. Please enter 1 or 2.");
				System.out.println("Which sort would you like to do?");
				System.out.println("1) Bubble Sort \n2) Selection Sort");
				sort = input.nextInt();

			}

			//if its a list of ints...
			if (listType == 1) {
				Integer[] list = new Integer[length];

				//have the user input all the items in the list one by one
				for (int i = 0; i < length; i++) {
					System.out.println("Enter item " + (i + 1) + " of your list");
					list[i] = input.nextInt();
				}

				//use user selected sort to sort the list
				if (sort == 1) {
					//instantiate
					BubbleSort<Integer> intBubSort = new BubbleSort<>();

					System.out.println("Original Array: " + Arrays.toString(list));

					//call the sort method
					intBubSort.bubbleSort(list);

					System.out.println("Sorted Array: " + Arrays.toString(list));

				} else {
					//instantiate
					SelectionSort<Integer> selectSort = new SelectionSort<>();

					System.out.println("Original Array: " + Arrays.toString(list));

					//call the sort method
					selectSort.selectionSort(list);

					System.out.println("Sorted Array: " + Arrays.toString(list));

				}
			//if the list is strings...
			} else {
				String[] list = new String[length];
				
				//have the user input all the items in the list one by one
				for (int i = 0; i < length; i++) {
					System.out.println("Enter item " + (i + 1) + " of your list");
					list[i] = input.next();
				}

				//if user wants bubble sort...
				if (sort == 1) {
					//instantiate
					BubbleSort<String> stringBubSort = new BubbleSort<>();

					System.out.println("Original Array: " + Arrays.toString(list));

					//call sort
					stringBubSort.bubbleSort(list);

					System.out.println("Sorted Array: " + Arrays.toString(list));

				//if user wants selection sort
				} else {
					//instantiate
					SelectionSort<String> selectSort = new SelectionSort<>();

					System.out.println("Original Array: " + Arrays.toString(list));

					//call sort
					selectSort.selectionSort(list);

					System.out.println("Sorted Array: " + Arrays.toString(list));

				}

			}
			//ask if want to go again
			System.out.println("Do you want to do another sort? (y/n) ");
			again = input.next();

			//input val for again
			while (!again.equals("y") && !again.equals("n")) {
				System.out.println("Invalid Entry. Please enter y or n");
				System.out.println("Do you want to do another sort? (y/n) ");
				again = input.next();
			}
		}

		//closing msg
		System.out.println("Thank you for using this program! Goodbye.");
		
		input.close();
	}

}
