package basics;

import java.util.LinkedHashMap;


//Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface,
//with predictable iteration order.
//It inherits HashMap class and implements the Map interface.
//
//Points to remember
//Java LinkedHashMap contains values based on the key.
//Java LinkedHashMap contains unique elements.
//Java LinkedHashMap may have one null key and multiple null values.
//Java LinkedHashMap is non synchronized.
//Java LinkedHashMap maintains insertion order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75


public class LinkedHashMapTutorial {
   
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
		map.put(1, "Jhon");
		map.put(2, "Lucas");
		map.put(3, "Ron");
		map.put(4, "Joel");
		map.put(5, "Mason");
		
		//All methods of LinkedHashMap are the same with methods of HashMap
		
		
	}
}
