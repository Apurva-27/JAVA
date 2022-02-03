
public class pattern_three {

	public static void main(String[] args) {

		int i, j;
		
		for(i=1; i<=5; i++)
		{
			for(j=i; j<5; j++)//for(j=i; j>=1; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
