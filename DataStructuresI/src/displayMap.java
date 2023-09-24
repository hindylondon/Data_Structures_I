package map;

import java.util.*;
import java.util.Map.Entry;

public class displayMap{
	public static void main(String[] args)  {
		Shoe shoe1 = new Shoe("Venettini", "Loafer");
		Shoe shoe2 = new Shoe("Nike", "Flip-Flop");
		Shoe shoe3 = new Shoe("Floafer", "Water-Shoe");
		Shoe shoe4 = new Shoe("Adidas", "Addissauge Slide");
		Shoe shoe5 = new Shoe("Beberlis", "Kid Shoe");
		Shoe shoe6 = new Shoe("Venettini", "School Shoe");
		Shoe shoe7 = new Shoe("Nike", "Slide");
		Shoe shoe8 = new Shoe("Floafer", "Croc");
		Shoe shoe9 = new Shoe("Adidas", "Sneaker");
		Shoe shoe10 = new Shoe("Beberlis", "Slipper");
		
		HashMap<String, Shoe> shoeMap = new HashMap<String, Shoe>();
		shoeMap.put(shoe1.getName(), shoe1);
		shoeMap.put(shoe2.getName(), shoe2);
		shoeMap.put(shoe3.getName(), shoe3);
		shoeMap.put(shoe4.getName(), shoe4);
		shoeMap.put(shoe5.getName(), shoe5);
		shoeMap.put(shoe6.getName(), shoe6);
		shoeMap.put(shoe7.getName(), shoe7);
		shoeMap.put(shoe8.getName(), shoe8);
		shoeMap.put(shoe9.getName(), shoe9);
		shoeMap.put(shoe10.getName(), shoe10);
		
		TreeMap<String, Shoe> sorted = new TreeMap<>();
		 
        sorted.putAll(shoeMap);

        for (Entry<String, Shoe> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                         " -> \tValue = " + entry.getValue());   
	}
}
