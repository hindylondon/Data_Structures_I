//Hindy London
//Removing Duplicates
import java.util.*;

public class Duplicates {
	public static void main(String[] args) {
		
		List<Integer> withDuplicates = Arrays.asList(1,1,2,3,3,4,5,5,6);
		
		System.out.println("List With Duplicates: " + withDuplicates);
		
		Set<Integer> noDuplicates = new HashSet<Integer>();
		
		for(int i = 0; i < withDuplicates.size(); i++) {
			noDuplicates.add(withDuplicates.get(i));
		}
		
		System.out.println("List Without Duplicates: " + noDuplicates);
	}

}
