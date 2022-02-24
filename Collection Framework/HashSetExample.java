package CollectionFramework;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set =new HashSet<String>();
		set.add("ram");
		set.add("rajiv");
		set.add("priya");
		set.add("apurva");
		set.add("priya");
		set.add(null);
		
		System.out.println(set+"\n");
		
		//remove
		set.remove("apurva");
		System.out.println(set+"\n");
		
		//convert hashset to an array
		String [] arr=new String[set.size()];
		set.toArray(arr);
		
		for(String s:arr)
		{	
			System.out.println(s+"\n");
		}
		
		
		//LINKEDHASHSET
		LinkedHashSet<String> set1 =new LinkedHashSet<String>();
		set1.add("ram");
		set1.add("rajiv");
		set1.add("priya");
		set1.add("apurva");
		set1.add("priya");
		set1.add(null);
		
		System.out.println("In LinkedHashSet"+set1+"\n");
		
		
		//LINKEDHASHSET
				TreeSet<String> set2 =new TreeSet<String>();
				set2.add("ram");
				set2.add("rajiv");
				set2.add("priya");
				set2.add("apurva");
				set2.add("priya");
								
				System.out.println("In TreeSet"+set2+"\n");
	}
	
	

}
