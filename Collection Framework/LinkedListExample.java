package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> llist =new LinkedList<Integer>();//integer
		
		System.out.println("Inserted element in list");
		llist.add(12);
		llist.add(52);
		llist.add(92);
		llist.add(2);
		
		System.out.println("Print element one aft the other.");
		for(Integer i:llist)
		{
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//for loop
		System.out.println("Display using for loop");
		for(int i=0; i<llist.size(); i++)
		{
			System.out.println(llist.get(i));//list.get() get the element
		}//for
		
		System.out.println("\n");
		
		//while loop
		System.out.println("Display using while loop");
		int j=0;
		while(j<llist.size())
		{
			System.out.println(llist.get(j));
			j++;
		}
		
		System.out.println("\n");
		
		//iterator
		System.out.println("Display using iterator");
		Iterator itr=llist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
		
		//Sort list Accending
		System.out.println("Sort List Accending Order");
		Collections.sort(llist);
		System.out.println("After Sorting Values Accending Order:");
		for(Integer i:llist)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		//Sort list Decending
		System.out.println("Sort List Decending order");
		Collections.sort(llist,Collections.reverseOrder());
		System.out.println("After Sorting Values Decending order:");
		for(Integer i:llist)
		{
			System.out.println(i);
		}
		
		System.out.println();
						
		System.out.println(llist+"\n");
		
		System.out.println("After First add, Last add, At position add");
		llist.addFirst(10);
		llist.addLast(100);
		llist.add(3,30);
		System.out.println(llist+"\n");
		
		//Delete First
		int del = llist.removeFirst();
		System.out.println("Deleted first element: "+del);
		System.out.println(llist+"\n");
		
		//Delete last
		int last=llist.removeLast();
		System.out.println("Deleted last element: "+last);
		System.out.println(llist+"\n");
		
		//remove at position
		int ind = llist.remove(2);
		System.out.println("Removed element at position 2: "+ind);
		System.out.println(llist+"\n");
		
		//clear list
		llist.clear();
		System.out.println("After clear list :"+llist+"\n");
		
		//string
		LinkedList<String> link =new LinkedList<String>();
		
		link.add("apple");
		link.add("mango");
		link.add("apple");
		link.add("kiwi");
		link.add("banana");
		link.add("orange");
		System.out.println(link+"\n");
		
		int index = link.lastIndexOf("apple");
		System.out.println("Last index of apple "+index+"\n");
	
		//replace
		link.set(2,"watermelon");
		
		for(String s :link)
		{
			System.out.println(s);
		}
		
		//element presemnt
		if(link.contains("kiwi"))
			System.out.println("element present\n");
		else
			System.out.println("element not present\n");
		
		//push element at head and return
		link.push("Dragon fruit");
		System.out.println("After element push. "+link+"\n");
		
		//pop element and return
		String p = link.pop();
		System.out.println("Popped element: "+p);//apple
		System.out.println(link+"\n");
		
		//pop() return head element
		System.out.println("Pop head element:"+link.poll()+"\n");
		System.out.println(link+"\n");
		
		//pollFirst-retrieve first element and remove
		System.out.println(link.pollFirst()+"\n");
		System.out.println("After pollFirst: "+link+"\n");
		
		//pollLast-retrieve last element and remove
		System.out.println(link.pollLast()+"\n");
		System.out.println("After pollLast: "+link+"\n");
		
		//Convert LinkedList to Arraylist
		LinkedList<String> linke =new LinkedList<String>();
		
		link.add("apple");
		link.add("mango");
		link.add("apple");
		link.add("kiwi");
		link.add("banana");
		link.add("orange");
		
		List<String> list = new ArrayList<String>(linke);
		
		for(String s:list)
		{
			System.out.println("ArrayList: "+s);
		}	
		
		
	
	}

}
