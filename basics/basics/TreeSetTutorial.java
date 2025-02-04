package basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

//Java TreeSet class implements the Set interface that uses a tree for storage. 
//It inherits AbstractSet class and implements the NavigableSet interface. 
//The objects of the TreeSet class are stored in ascending order.

//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quiet fast.
//Java TreeSet class doesn't allow null element.
//Java TreeSet class is non synchronized.
//Java TreeSet class maintains ascending order.

//The TreeSet can only allow those generic types that are comparable.
//For example, the Comparable interface is being implemented by the StringBuffer class.

//Key Aspects of TreeSet's Functionality
//Red-Black Tree Structure: 
	//Each node in this tree is assigned a color-either red or black-which plays a crucial role in maintaining the tree's balance. 
    //This strategic coloring helps prevent the tree from becoming lopsided, 
    //which enhances performance and ensures that operations are processed quickly and efficiently.
//Dynamic Rebalancing: 
    //Whenever elements are added or removed, TreeSet dynamically adjusts its internal structure. 
    //It ensures that the set's elements are always in ascending order, 
    //making it highly reliable for applications that require well-ordered data.
//Handling Duplicates: 
	//TreeSet is designed to store only unique elements. 
    //Attempts to add duplicates are gracefully handled by the set, ensuring that only distinct elements are maintained. 
    //It is crucial for data integrity and simplifies management of collections where uniqueness is a priority.
//Order Determination:
	//The sorting of elements within TreeSet can follow the natural ordering of the elements or be defined by a custom comparator. 
    //This flexibility allows developers to control how elements are compared and ordered within the set.

public class TreeSetTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//constructing an empty tree set that will be sorted in ascending order according to the natural order of the tree set
		TreeSet<Integer> set = new TreeSet<>();
		
		//constructing a new tree set that contains the elements of the collection c.
		TreeSet<String> set2 = new TreeSet<>(Arrays.asList("D", "F", "A"));
		
		//building an empty tree set that will be sorted according to given comparator.
		TreeSet<Integer> set3 = new TreeSet<>(Comparator.naturalOrder());
		
		//It is used to build a TreeSet that contains the elements of the given SortedSet.
		TreeSet<String> set4 = new TreeSet<>(set2);
		
	}

}
