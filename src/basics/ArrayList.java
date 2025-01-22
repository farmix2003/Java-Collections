package basics;

import java.util.Iterator;
import java.util.List;

// ArrayList in Java is a dynamic array implementation that 
//  belongs to the Java Collections Framework. 
// This is a big array that grows on its own as more elements are added to it.
// ArrayList is so commonly used for its ease of use and flexibility.
// ArrayList is dynamic sized which you do not need to give fixed size to it unlike the array.
// ArrayList can have same values.


public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> arrayList = new java.util.ArrayList<>();
    List<Integer> ListOfIntegers = new java.util.ArrayList<>(List.of(11,80,34));
    List<Integer> arrIntegers = new java.util.LinkedList<>(List.of(66,77,34));
    
    //add(E e) is used to insert elements to the end of ArrayList;
    arrayList.add(23);
    arrayList.add(20);
    arrayList.add(55);
    arrayList.add(10);
    
    //add(int index, E e) is used to add elements to specified index;
    arrayList.add(3, 15);
    arrayList.add(5, 33);
    
    //addAll(Collection c) inserts all elements to ArrayList from the another collection
    arrayList.addAll(arrIntegers);
    
    //addAll(int index, Collection c) is used to append all elements in specified collection, starting at specified position of list.
    arrayList.addAll(0, ListOfIntegers);
 
    System.out.println(arrayList);
    
    //clear() clears ArrayList;
    
//    arrayList.clear();
    
    //get(int index) is used to get element at specified index
    
    int d = arrayList.get(4);
    System.out.println(d);
    
//    System.out.println(arrayList);
    
    
    //isEmpty() return boolean value checking whether ArrayList is empty or contains elements
    boolean isEmpty = arrayList.isEmpty();
    System.out.println(isEmpty);
    
    
    //iterator returns an iterator over the elements in the list
//    Iterator<Integer> iterator = arrayList.iterator();
//    while(iterator.hasNext()) {
//    	int i = iterator.next();
//    	System.out.println(i);
//    }
	
    //size() returns the number of elements present in the list
    int size = arrayList.size();
    
    System.out.println(size);
    
    //lastIndexOf(Object o) is used to find and return the index in the list of last occurrence of the specified element,
    // or return -1 if the list does not contain that element;
    
    int index = arrayList.lastIndexOf(66);
    System.out.println("Last indexof 66: "+index);
    System.out.println("When list does not contain specified element: "+arrayList.lastIndexOf(122));
    
    
    //toArray() method returns object array containing all elements in the list;
    Object[] arr = arrayList.toArray();
    for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
    
    System.out.println();
    
    //indexOf(Object o) returns index of given object, if given object is not in the list, return -1;
    int indexOf = arrayList.indexOf(33);
    System.out.println(indexOf);
    
    
    //remove(int index) removes the element at the given index;
    System.out.println(arrayList);
    arrayList.remove(3);
    System.out.println(arrayList);
    
    //remove(Object o) used to remove the first occurrence of specified element;
    arrayList.remove((Integer)15);
    System.out.println(arrayList);
    
    //removeIf(Predicate<? super E> filter) It is used to remove all the elements from the list that satisfies the given predicate.
    System.out.println(arrayList.removeIf(o -> o <30));
    System.out.println(arrayList);
    
    //removeAll(Collection<?> c) used to remove all elements from the list
    arrayList.removeAll(arrIntegers);
    System.out.println(arrayList);
    
	}
    

}
