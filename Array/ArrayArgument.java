package Array;

public class ArrayArgument {

	public static void FindMin(int arr[])
	{
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Minimum value: "+min);
		
	}//min
		
	public static void main(String[] args) {
		
		int arr[]= {4,9,2,1,10};
		FindMin(arr);	//passing arr to method
		
		
	}//main

}
