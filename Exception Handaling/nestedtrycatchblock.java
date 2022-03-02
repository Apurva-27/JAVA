package ExceptionHandling;

public class nestedtrycatchblock {

	public static void main(String[] args) {
		
		try//external
		{
			System.out.println("Inside external try.");
					
			try //inner
			{
				int arr[]=new int[5];
				arr[6]=6;
				System.out.println(arr[6]);
								
			}
			catch(ArrayIndexOutOfBoundsException ee)
			{
				System.out.println("Exception handle. Inside internal catch");
			}
			//inner
			
			
			try
			{
				System.out.println("going to devide by zero");
				int d=23/0;
			}
			catch(ArithmeticException ex)//internal
			{
				System.out.println("Exception handle. Inside internal catch");
			}
			
			
		}//external
		catch (Exception e)
		{
			System.out.println("Inside external catch");
			
		}//external
		
	}

}
