package basics;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

//Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.
//It inherits the HashSet class and implements the Set interface.

//The important points about the Java LinkedHashSet class are:

//Java LinkedHashSet class contains unique elements only like HashSet.
//Java LinkedHashSet class provides all optional set operations and permits null elements.
//Java LinkedHashSet class is non-synchronized.
//Java LinkedHashSet class maintains insertion order.


public class LinkedHashSetTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		// default HashSet constructor.
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		// hash set by using the elements of the collection c
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("J", "K", "A"));
        
        //Initialising the capacity of the linked hash set to the given integer value capacity.
        LinkedHashSet<Integer> set3 = new LinkedHashSet<>(10);
        
        //initialising both the capacity and the fill ratio (also called load capacity) of the hash set from its argument.
        LinkedHashSet<String> set4 = new LinkedHashSet<>(10, 1);

        //add(E e) adds element to LinkedHashSet
        set.add("1");
        
        //So all methods of LinkedHashSet are the same with ArrayList and LinkedList methods so I am not going to write them again.
        //But LinkedHashSet does not allow you to insert duplicate elements,
        //whenever you insert same element twice, LinkedHashSet overrides first one of it and puts second one to the List
        
        set.add("2");
        set.add("1");
        set.add("3");
        set.add("3");
        
        System.out.println(set);
        System.out.println(set.size());
        
	}

}
