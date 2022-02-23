package CollectionFramework;

import java.util.ArrayList;

public class ArrayListUsingClass {

	public static void main(String[] args) {
		
		ArrayList<Author> list = new ArrayList<Author>();
		/*
		//way 1 to store elements in an list
		System.out.println("way 1 to store elements in an list");
		
		Author a1=new Author(101,"balguruswami","Let us C");
		Author a2=new Author(102,"Schild","Database Management");
		Author a3=new Author(103,"MC","Java Complete Reference");
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		//System.out.println(list);
		for(Author author:list)
		{
			System.out.println("Id: "+author.getId()+" "+"Name: "+author.getName()+" "
			+"Book Name: "+author.getBook());
		}//for
			
		*/
		
		System.out.println("\n");
		
		//way 2 to store elements in an list
		System.out.println("way 2 to store elements in an list");
		
		list.add(new Author(101,"balguruswami","Let us C"));
		list.add(new Author(102,"Schild","Database Management"));
		list.add(new Author(103,"MC","Java Complete Reference"));
		
		//System.out.println(list);
		for(Author author:list)
		{
			System.out.println("Id: "+author.getId()+" "+"Name: "+author.getName()+" "
			+"Book Name: "+author.getBook());
		}//for
	}

}
