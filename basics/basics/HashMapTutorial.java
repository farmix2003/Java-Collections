package basics;

import java.awt.RenderingHints.Key;
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
       
       System.out.println(map);
       
       //clear() clears the map
       anotherMap.clear();
       
       //isEmpty() returns true if map is empty, otherwise returns false
       System.out.println(map.isEmpty());
       
       //entrySet() used to return a collection view of the mappings contained in the map
       System.out.println(map.entrySet());
       
       //keySet() used to return a set view of the keys contained in the map.
       System.out.println(map.keySet());
       
       //remove(Object key) is used to delete an entry for the specified key.
       System.out.println(map.remove("Five"));
       
       //remove(O key, O value) used to remove the specified values with the associated specified keys from the map.
       System.out.println(map.remove("Active", 10));
       
       // compute() -> Modifies existing value or inserts a new one
       map.compute("Two", (key, value) -> (value == null) ? 1: value+2);
       System.out.println(map);
       
       // computeIfAbsent() -> Adds a value if key is not present
       map.computeIfAbsent("Six", key -> 6);
       System.out.println(map);
       
       // computeIfPresent() -> Updates the value if key exists
       map.computeIfPresent("Six", (key, value) -> value*2);
       System.out.println(map);
       
       //containsValue(O o) returns true if specified value exists in the map , else false
       System.out.println(map.containsValue(4));
       
       //containsKey(O o) returns true if specified key exists in the map, else false
       System.out.println(map.containsKey("Six"));
       
       //contains(O o) used to compare current map with another map, if they are the same returns true else false
       System.out.println(map.equals(anotherMap));
       
       //forEach(BiConsumer action) It performs the given action for each entry in the map until all entries have been processed 
       //or the action throws an exception.
       map.forEach((key, value) -> {
    	   System.out.println(key + "="+value);
       });
       
       //get(O o) returns the object that contains the value associated with the key.
       System.out.println(map.get("Three"));
       
       //getOrDefault(O key, O defaultValue) returns the value associated with the key, if not exists returns default value
       System.out.println(map.getOrDefault("Six", 5));
       
       //merge(O key, O value BiFunction) If the specified key is not already associated with a value or is associated with null,
       //associates it with the given non-null value.
       System.out.println(map.merge("Seven", 7, (k, v) -> k+v));
       
       //replace(O key, O value) replaces the value for the specified key
       map.replace("Six", 6);
       
       //replace(O key, O oldValue, O newValue) replaces the old value with the new value for a specified key.
       map.replace("Two", 4, 2);
       
       //replaceAll(BiFunction action) replaces each entry's value with the result of invoking the given function on that entry until
       //all entries have been processed or the function throws an exception.
       map.replaceAll((key, value) -> key.length()+value);
       
       
       System.out.println(map);
       
       //values() returns collection of values of map
       System.out.println(map.values());
       
       name(24);
       
	}
  
	public static void name(int n){
	    int sum = 0;
	    int temp = n; //To avoid modifying the original n.
	    while(temp > 0){
	        int digit = temp % 10;
	        if(digit % 2 == 1){
	            sum += digit;
	        }
	        temp /= 10;
	    }
	    System.out.println(sum);
	}
	
}
