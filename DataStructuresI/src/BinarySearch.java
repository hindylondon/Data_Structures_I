package week6;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
    	//initiate an array
        int[] nums = { 10, 8, 7, 9, 3, 6, 1 };
        
        //array has to be sorted before searching
        Arrays.sort(nums);
        
        //select item to find
        int item = 7;
        
        //set left and right
        int left = 0;
        int right = nums.length - 1;
        
        //call for searching method
        int index = searchArray(nums, item, left, right);
        
        //display if found or not
        if (index == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("The item was found at place: " + (index + 1));
        }
    }

    //search O(log n) thru the array by splitting in half to find the item's index
    public static int searchArray(int[] nums, int item, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == item) {
            return mid;
        } else if (nums[mid] < item) {
            return searchArray(nums, item, mid + 1, right);
        } else {
            return searchArray(nums, item, left, mid - 1);
        }
    }
}