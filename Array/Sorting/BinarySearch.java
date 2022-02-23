package Array;

public class BinarySearch {

	public static void binarySearch(int first, int last, int arr[], int key)
	{
		int mid=0;
		
		mid=(first + last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first = mid + 1;
			}//if
			else if(arr[mid]==key)
			{
				System.out.println("Element found at index: "+mid);
				break;
			}//else if
			else
			{
				last=mid-1;
			}//else
			
			mid = (first+last)/2;
			
		}//while
		
		if(first|last)
		{
			System.out.println("Element not found. ");
		}//if
	}
	
	public static void main(String[] args) {
		
		int arr[]= {20,30,40,50,60};

		int key=40;
		int last=arr.length-1;
		binarySearch(0,last,arr,key);
	}

}
