package oops;

import java.util.*;

public class bank_transaction {
	
	//static new_bank_trans;
	static ArrayList<bank1> acc = new ArrayList<bank1>();
	static int count =0;
	public static void main(String[] args) {
		
				
		 int acc_no, ch, i;
		 String name;
		 long balance;
		  
		 Scanner sc = new Scanner(System.in);
		 
		 do 
		 {
			 int flag =1;
			 System.out.println("1.Create Account\n2.Deposite\n3.Withdraw\n4.Check Ammount\n5.Quite\6.Display\n-----------------------------------------------------------------------------------------------------------");
			 System.out.println("\nEnter your choice");
			 System.out.println("\n-----------------------------------------------------------------");
		 	 ch= sc.nextInt();
		 	 
		 	 switch(ch)
		 	 {
		 	 	case 1:
		 	 		//Account creation
		 	 				System.out.println( "\nEnter Account Number: ");
		 	 				acc_no = sc.nextInt();
		 	 						
		 	 				sc.nextLine();
		 	 				System.out.println("\nEnter Account Holder Name: ");
		 	 				name=sc.nextLine();
		 	 				
		 	 				System.out.println("\nEnter Balance: ");
		 	 				balance=sc.nextLong();
		 	 				
		 	 				acc.add(new bank1(acc_no, name, balance));
		 	 				count++;
		 	 				
		 	 				System.out.println("Account Created Successfully.");
		 	 				
		 		break; 
		 	 
		 	 	case 2:
		 	 		//deposite
		 	 				System.out.println("\nEnter Account Number to Deposite Money: ");
		 	 				int dacc_no = sc.nextInt();
		 	 				
		 	 				for(i=0; i<count; i++)
		 	 				{
		 	 					if(dacc_no==acc.get(i).acc_no)
		 	 					{
		 	 						acc.get(i).deposite();
		 	 						flag=0;
		 	 					}//if
		  				
		 	 				}//for
		 	 				
		 	 				if(flag==1)
		 	 				{
		 	 					System.out.println("\nAccount Number Not Found.");
		 	 				}
		 	 		
			 	break;
			 		
		 	 	case 3:
		 	 		//withdraw
		 	 		
		 	 			System.out.println("\nEnter Accoount Number: ");
		 	 			dacc_no = sc.nextInt();
		 	 			
		 	 			for(i=0; i<count; i++)
		 	 			{
		 	 				if(acc.get(i).acc_no==dacc_no)
		 	 				{	
		 	 					acc.get(i).withdraw();
		 	 				flag=0;
		 	 				}
		 	 			}	
		 	 			if(flag==1)
	 	 				{
	 	 					System.out.println("\nAccount Number Not Found.");
	 	 				}
		 	 			
			 	break;
			 		
		 	 	case 4:
		 	 		//check_balance
		 	 		
		 	 		System.out.println("\nEnter Accoount Number: ");
	 	 			dacc_no = sc.nextInt();
	 	 			
	 	 			for(i=0; i<count; i++)
	 	 			{
	 	 				if(acc.get(i).acc_no==dacc_no)
	 	 				{	
	 	 					acc.get(i).check_balance();
	 	 				flag=0;
	 	 				}
	 	 			}	
	 	 			
	 	 			if(flag==1)
 	 				{
 	 					System.out.println("\nAccount Number Not Found.");
 	 				}
		 	 			
			 	break;
			 		
		 	 	case 5:
		 	 			System.out.println("\nThank you for visiting.....");
			 	break;
			 	
		 	 	case 6:
		 	 			//display
		 	 			for(i=0; i<count; i++)
		 	 			{
		 	 				System.out.println("Customers in name: "+acc.get(i).name);
		 	 				System.out.println("Customers in accoount number: "+acc.get(i).acc_no);
		 	 				System.out.println("Customers in balance: "+acc.get(i).bal+"\n");
		 	 			}	
		 	 		
		 	 	break;	
			 	
			 	default: System.out.println("Enter Choice is Wrong...Please Try Again");
		 	 }//switch
			 
		 }//do
		 while(ch!=5);
		
	}

}
