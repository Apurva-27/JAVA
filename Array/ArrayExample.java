package Array;

public class ArrayExample {

	public static void main(String[] args) {
		int i;
		//compile time initializing arry e.g
		int arr[]= {2,3,4,5,6};
		
		int arr1[]= new int[5];
		arr1[0]=5;
		arr1[1]=6;
		arr1[2]=7;
		arr1[3]=8;
		arr1[4]=9;
		
		//traversing array
		System.out.print("\n"+arr[1]);	//3
		
		for(i=0; i<5; i++)
		{
			System.out.print("\n"+arr1[i]);	
		}
	}

}
