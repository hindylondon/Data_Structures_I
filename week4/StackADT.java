package week4;
import java.util.*;
//Hindy London


public class StackADT<T> {
	//field
	private LinkedList<T> stackList;
	
	//constructor
	public StackADT() {
		this.stackList = new LinkedList<>();
	}
	
	//push, adds to stack
	public void push(T input){
		System.out.println("Added: " + input);
		stackList.add(input);
	}
	//pop, removes from stack
	public T pop(){
		if (isStackEmpty()) {
			System.out.println("Stack Underflow");
		}
		return stackList.remove(stackList.size() - 1);
	}
	//peek, returns top of stack, without removing it
	public T peek() {
		if (isStackEmpty()) {
			System.out.println("Stack Underflow");
		}
		return stackList.get(stackList.size() - 1);
	}
	
	//checks if its an empty stack
	public boolean isStackEmpty() {
		return stackList.isEmpty();
	}
	
	//returns the size of the stack
	
	public int size() {
		return stackList.size();
	}


}
