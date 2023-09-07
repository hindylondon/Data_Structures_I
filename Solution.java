
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[]) {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    


    list1.add(1);
    list1.add(3);
    list1.add(5);
    list2.add(2);
    list2.add(4);
    list2.add(6);

    ArrayList<Integer> alreadyMergedList = mergeTwoLists(list1, list2);
    System.out.println("List 1: " + list1);
    System.out.println("List 2: " + list2);
    System.out.println("Merged Lists: " + alreadyMergedList);

    }

   public static ArrayList<Integer> mergeTwoLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
	   ArrayList<Integer> mergedList = new ArrayList<Integer>();  
	   for(int i = 0; i < list1.size(); i++){
        	mergedList.add(list1.get(i));
	   }
	   for(int j = 0; j < list2.size(); j++){
       	mergedList.add(list2.get(j));
	   }
	   ArrayList<Integer> sortedList = sort(mergedList);
	   
       return sortedList;
        }
  
   public static ArrayList<Integer> sort(ArrayList<Integer> mergedList) {
	    for (int i = 0; i < mergedList.size() - 1; i++) {
	      int currentMin = mergedList.get(i);
	      int currentMinIndex = i;

	      for (int j = i + 1; j < mergedList.size(); j++) {
	        if (currentMin > mergedList.get(j)) {
	          currentMin = mergedList.get(j);
	          currentMinIndex = j;
	        }
	      }

	     if (currentMinIndex != i) {
	        mergedList.set(currentMinIndex, mergedList.get(i));
	        mergedList.set(i, currentMin);
	      }
	    }
		return mergedList;
	  
   }}
