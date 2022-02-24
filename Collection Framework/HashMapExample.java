package CollectionFramework;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();	
		
		//Add elements to HashMap
		hmap.put(12,"Chaitanya");
		hmap.put(2,"Rahul");
		hmap.put(7,"Singh");
		hmap.put(49,"Ajeet");
		hmap.put(3,"Anuj");
		
		//Display
		Set set =hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key is: "+mentry.getKey()+" & value is: ");
			System.out.println(mentry.getValue());
		}
		
		//get values on based keys
		String var = hmap.get(2);
		System.out.println("Value at index 2 is:"+var);
		
		//Remove values based on
		hmap.remove(3);
		System.out.println("Map value and key get removal:");
		
		Set set2 = hmap.entrySet();
		Iterator iterator2 = set.iterator();
		while(iterator2.hasNext())
		{
			Map.Entry mentry2 = (Map.Entry)iterator2.next();
			System.out.println("Key is: "+mentry2.getKey()+" & value is: ");
			System.out.println(mentry2.getValue());
		}		
	}

}
