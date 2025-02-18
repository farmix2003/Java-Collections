package basics;

import java.util.HashMap;
import java.util.Map;

//Java HashMap class implements the Map interface which allows us to store key and value pair,
//where keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key.
//It is easy to perform operations using the key index like updation, deletion, etc. 
//HashMap class is found in the java.util package.
//
//HashMap in Java is like the legacy Hashtable class, but it is not synchronized. 
//It allows us to store the null elements as well, but there should be only one null key. 
//Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value.
//It inherits the AbstractMap class and implements the Map interface.
//
//Points to Remember
//Java HashMap contains values based on the key.
//Java HashMap contains only unique keys.
//Java HashMap may have one null key and multiple null values.
//Java HashMap is non synchronized.
//Java HashMap maintains no order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

//Properties of HashMap

//Performance: If the hash function distributes the elements among the buckets appropriately, 

//HashMap offers constant-time performance for simple operations like put and get.

//Iteration: A hash map's entrySet(), keySet(), or values() methods are usually used to iterate across the map 
//and retrieve keys, values, or key-value pairs, respectively.

//Resizing: The HashMap automatically resizes itself and rehases the items to provide optimal performance when
//the number of elements above a predetermined threshold.

//Load Factor: The load factor that you can set in a hash map tells you when the map should resize in relation to its capacity.
//The load factor by default is 0.75.

//Collision Handling: When two distinct keys have the same hash,
//a hash collision is handled by HashMap using distinct chaining to store multiple entries
//in the same bucket and preserve a linked list of entries.

//Fail-Fast Iterator: The iterators that HashMap returns are fail-fast,
//which means that if the map is structurally changed in any way after the iterator is produced,
//except by using the remove() function of the iterator itself, it will raise a ConcurrentModificationException.


public class HashMapTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default HashMap.
       Map<String, Integer> map = new HashMap<>();
       
       //initialisation of the capacity of the hash map to the given integer value, capacity.
       Map<Integer, Integer> map2 = new HashMap<>(10);
       
       Map<String, Integer> anotherMap = new HashMap<>();
       anotherMap.put("Active", 10);
       anotherMap.put("Active", 10);
       
       //initialisation of the hash map by using the elements of the given Map object anotherMap.
       Map<String, Integer> map3 = new HashMap<>(anotherMap);
       
       // initialisation of both the capacity and load factor of the hash map by using its arguments.
       Map<String, String> map4 = new HashMap<>(4, 0.60f);
       
       //put(O key, O value) used to insert an entry to the map
       map.put("One", 1);
       map.put("Two", 2);
       map.put("Three", 3);
       map.put("Four", 4);
       System.out.println(map);
       
       //putAll(Map map) used to insert the specified map to the Map
       map.putAll(anotherMap);
       
       //putIfAbsent(O o) inserts the specified value with the specified key in the map only if it is not already specified.
       map.putIfAbsent("Five", 5);
       
	}

}
