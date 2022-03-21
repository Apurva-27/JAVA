package oops;

import java.util.*;

public class calculator {

	public static void main(String[] args) {

		int num1, num2, result=0, choice;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number1:");
		num1=sc.nextInt();
		
		System.out.println("Enter your number2:");
		num2=sc.nextInt();
		
		System.out.println("Enter your choice:");
		
		do 
		{
				System.out.println("========================================================================");
				
				System.out.println("1.Addition:\n2.Subtraction:\n3.Multiplication:\n4.Division:/5.Quit");
				
				System.out.println("========================================================================");
				
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				
				System.out.println("========================================================================");
				switch(choice)
				{
					case 1:
								System.out.println("It's Addition program");
								
								result=num1+num2;
								System.out.println("Addition of "+num1+"+"+num2+"="+result);
						
					break;
					
					case 2:
								System.out.println("It's Subtraction program");
								
								if(num1>num2)
								{
									result=num1-num2;
									System.out.println("Subtraction of: "+num1+"-"+num2+"="+result);
								}
								else
								{
									System.out.println("Invalid input.");
								}
					break;
						
					case 3:
								System.out.println("It's Multipication program");
								
								result=num1*num2;
								System.out.println("Multiplication of: "+num1+"*"+num2+"="+result);
								
					break;
						
					case 4:
								System.out.println("It's Division program");
								
								if(num1>num2)
								{
									result=num1/num2;
									System.out.println("Division of: "+num1+"/"+num2+"="+result);
								}
								else
								{
									System.out.println("Invalid input.");
								}
						
					break;
						
					case 5:	break;
					
					default:System.out.println("It's a wrong choice. ");
						
				}//switch
				
		}//do
		while(choice!=5);
		System.out.println("Thank you!!");
	}//main

}//class
