package basics;

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
    
    arrayList.clear();
    System.out.println(arrayList);
    
    
	}

}
