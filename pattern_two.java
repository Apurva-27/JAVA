
public class pattern_two {

	public static void main(String[] args) {
		int i, j;
		
		for(i=1; i<=5; i++)
		{
			for(j=i; j>=1; j--) //for(j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*

*
**
***
****
*****

*/
