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
      
    arrayList.add(23);
    arrayList.add(20);
    arrayList.add(55);
    arrayList.add(10);
    
    System.out.println(arrayList);
    
	}

}
