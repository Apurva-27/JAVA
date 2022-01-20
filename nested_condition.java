/*
WAP to accept choice from user and accordingly display the output
1: EVEN ODD
2:Greater between 3 NO
3:Vowel or not
4:accept a no and display the day (1:Monday 2: Tuesday .....7: Sunday)
*/

import java.util.*;

class nested_condition
{
	public static void main(String args[])
	{
		int num;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your choice:\n1)Check number is even or odd.\n2)Check enter number is greater or not.\n)3)Check given charachter is vowel or not.\n4)Display the Day according your choice.");
		num=sc.nextInt();
		
		switch(num)
		{
			
			case 1:
			{
				int num1;
								
				System.out.println("Enter number:");
				num1 = sc.nextInt();
				
				if((num1 % 2)==0)
				{
					System.out.println("Enter number is even."+num1);
				}
				else
				{
					System.out.println("Enter number odd."+num1);
				}
			}	
			break;
			
			case 2:
			{	
				int num2,num4,num5;
				
				System.out.println("Enter three numbers:");
				num2 = sc.nextInt();
				num4 = sc.nextInt();
				num5 = sc.nextInt();
				
				if(num2>num4)
				{
					System.out.println("Enter number is greater="+num2);
				}
				else if(num2>num5)
				{
					System.out.println("Enter number is greater="+num2);
				}
				else if(num4>num2)
				{
					System.out.println("Enter number is greater="+num4);
				}
				else if(num4>num5)
				{
					System.out.println("Enter number is greater="+num4);
				}
				else if(num5>num2)
				{
					System.out.println("Enter number is greater="+num5);
				}
				else
				{
					System.out.println("Enter number is greater="+num5);
				}
			}
			break;
			
			case 3:
				{
					char val;
					
					System.out.println("Enter the character:");
					val=sc.next().charAt(0);
					switch(val)
					{
						case 'a':
						case 'e':
						case 'i':
						case 'o':
						case 'u':
							System.out.println("It is vowel:"+val);
						break;
					
						default:
							System.out.println("It is not a vowel:"+val);
						break;
					}
				}	
			break;
			
			case 4:
			{
				int num3;
				
				System.out.println("Enter the character:");
				num3=sc.nextInt();
				switch(num3)
				{
					case 1:
					System.out.println("\nIt is Monday");
					break;
					
					case 2:
					System.out.println("\nIt is Tuesday");
					break;
					
					case 3:
					System.out.println("\nIt is Wednesday");
					break;
					
					case 4:
					System.out.println("\nIt is Thursday");
					break;
					
					case 5:
						System.out.println("\nIt is Friday");
					break;
					
					case 6:
						System.out.println("\nIt is Saturday");
					break;
					
					case 7:
						System.out.println("\nIt is Sunday");
					break;
					
					default:
						System.out.println("\nInvalid Choice.");
					break;
				}
			}
			break;
			
			default:
				System.out.println("\nInvalid Choice.");
			break;
		}
	}
}