package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declare List
		ArrayList<Integer> list =new ArrayList<Integer>();//integer
		ArrayList<String> list2 =new ArrayList<String>();
		
		//System.out.print("Insert element in list");
		list.add(10);
		list.add(12);
		list.add(12);
		list.add(13);
		list.add(14);
		
		System.out.println(list);
		
		System.out.println("Size of list");
		System.out.println(list.size()+"\n");
		
		list.add(15);
		list.add(16);
		
		System.out.println("Size of list after adding 2 elements");
		System.out.println(list.size()+"\n");
		
		//Add at specific position
		System.out.println("Add element at specific position in list");
		list.add(2,5); //list add(position,element);
		System.out.println(list+"\n");
		
		//Change element
		System.out.println("Change the element at specific position in list");
		list.set(3,17);//list.set(position,element);
		System.out.println(list+"\n");
		
		//Remove Element

		System.out.println("Remove element at position in list");
		list.remove(3);//list.remove(position);
		System.out.println(list+"\n");
		
		System.out.println("Print element one aft the other.");
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//for loop
		System.out.println("Display using for loop");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));//list.get() get the element
		}//for
		
		System.out.println("\n");
		
		//while loop
		System.out.println("Display using while loop");
		int j=0;
		while(j<list.size())
		{
			System.out.println(list.get(j));
			j++;
		}
		
		System.out.println("\n");
		
		//iterator
		System.out.println("Display using iterator");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
		
		//Sort list Accending
		System.out.println("Sort List Accending Order");
		Collections.sort(list);
		System.out.println("After Sorting Values Accending Order:");
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		//Sort list Decending
		System.out.println("Sort List Decending order");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After Sorting Values Decending order:");
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		//String List
		System.out.println("String list");
		list2.add("A");
		list2.add("F");
		list2.add("E");
		list2.add("D");
		list2.add("C");
		list2.add("B");
		System.out.println(list2);
		
		System.out.println("list2 size");
		System.out.println(list2.size()+"\n");
		
		//Add at specific position
		System.out.println("Add element at specific position in list");
		list2.add(3,"Q");
		System.out.println(list2+"\n");
		
		
	}//main

}
