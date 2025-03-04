package basics;

import java.awt.RenderingHints.Key;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

//Java TreeMap class is a red-black tree-based implementation.
//It provides an efficient means of storing key-value pairs in sorted order.

//The java.util package contains the Java TreeMap class, which is a component of the Java Collections Framework.
//It extends the AbstractMap class and implements the NavigableMap interface. 
//TreeMap is an effective red-black tree-based solution that sorts key-value pairs.
//TreeMap works well in situations where ordered key-value pairs are necessary since it preserves ascending order.
//It also only includes distinct components, guaranteeing that every key corresponds to a single value.
//TreeMap can have more than one null value, even if it cannot have a null key.

//Important Points about TreeMap:

//Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
//Java TreeMap contains only unique elements.
//Java TreeMap cannot have a null key but can have multiple null values.
//Java TreeMap is non synchronized.
//Java TreeMap maintains ascending order.

public class TreeMapTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Creation of TreeMap:
		
		//Constructing an empty tree map that will be sorted using the natural order of its key.
		Map<Integer, String> treeMap = new TreeMap<>();
		
        //Constructing an empty tree-based map that will be sorted using the comparator comp.
		Map<Integer, Integer> map = new TreeMap<>(Comparator.comparing(k -> k > 2));
		
		//Initialising a TreeMap with the entries from m, which will be sorted using the natural order of the keys.
		Map<Integer, Integer> map2 = new TreeMap<>(Map.of(1,2,3,4,5,6,7,8,9,10, 11,12));
		
		//Initialising a TreeMap with the entries from the SortedMap sm, which will be sorted in the same order as sm.
		Map<Integer, Integer> map3 = new TreeMap<>(map);
		
		//Constructing a tree map containing the elements of the specified collection, sorted using their natural order.
		Map<Integer, Integer> map4 = new TreeMap<>(map2);
		
		
	    System.out.println(map2.keySet());
		
		
	
	}

}
