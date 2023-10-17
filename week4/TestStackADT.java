package week4;

//Hindy London
public class TestStackADT {

	public static void main(String[] args) {
// create new LinkedList that is int
		StackADT<Integer> list = new StackADT<>();
// add to list
		list.push(1);
		list.push(2);
		list.push(3);

// pop
		System.out.println("Pop: " + list.pop());
		System.out.println("Pop: " + list.pop());
//peek
		System.out.println("The toppest of the list is: " + list.peek());
//check if its empty
		System.out.println("Empty? " + list.isStackEmpty());
//report the size
		System.out.println("Size: " + list.size());
//create new Linked List that is a String
		StackADT<String> list2 = new StackADT<>();
//add to list
		list2.push("Good Morning");
		list2.push("Good Afternoon");
		list2.push("Good Night");
//pop list items
		System.out.println("Pop: " + list2.pop());
		System.out.println("Pop: " + list2.pop());
//peek at top one
		System.out.println("The toppest of the list is: " + list2.peek());
//check if empty
		System.out.println("Empty? " + list2.isStackEmpty());
//report the size
		System.out.println("Size: " + list2.size());

	}

}
