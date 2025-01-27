package basics;

import java.util.LinkedList;
import java.util.List;

//Java LinkedList class uses a doubly linked list to store the elements. 
//It provides a linked-list data structure. 
//It inherits the AbstractList class and implements List and Deque interfaces.

//In Java, a LinkedList is a class that implements the List interface and
//represents a linked list data structure. Unlike arrays, which store elements in contiguous memory locations,
//a linked list stores elements as nodes, where each node contains the element itself and
//a reference (or pointer) to the next node in the sequence.

//The important points about Java LinkedList are:

//Java LinkedList class can contain duplicate elements.
//Java LinkedList class maintains insertion order.
//Java LinkedList class is non synchronized.
//In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//Java LinkedList class can be used as a list, stack or queue.


public class LinkedListTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//LinkedList creation
		List<String> nameList = new LinkedList<>();
		
		// boolean add(Element e) is used to insert element to the end of LL
		nameList.add("Farrukh");
		nameList.add("Mukhammmad");
		nameList.add("Shokhzod");
		
		System.out.println(nameList);
		
		//void add(int index, Element e) used to insert an element to the specific index of LL
		nameList.add(2, "Sanjar");
		System.out.println(nameList);
		
		LinkedList<String> namesList2 = new LinkedList<>(List.of("Jhonny", "Cole", "Mason"));
		
		//boolean addAll(Collection<? extends E> c) is used to add List of elements to the LL
        nameList.addAll(namesList2);
        System.out.println(nameList);
		
		//boolean addAll(int index, Collection<? extends E> c) used to add List of elements at the specified index of LL
		nameList.addAll(2, namesList2);
		System.out.println(nameList);
		
		//int size() returns length of elementd in the LL
		System.out.println(nameList.size());
		
		//void clear() used to clear LL
		nameList.clear();
		System.out.println(nameList);
		
		//boolean contains(Object o) is used to return true if a list contains a specified element.
		System.out.println(!nameList.contains("Farrukh"));
		
		
	}

}
