
public class pattern_four {

	public static void main(String[] args) {

		int i, j;
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++)//for(j=i; j>=1; j--)
			{
				System.out.print(+j);
			}
			System.out.println();
		}
	}

}
/*

1
12
123
1234
12345
*/
















