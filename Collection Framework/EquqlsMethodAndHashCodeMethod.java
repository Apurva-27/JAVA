package CollectionFramework;

class Employee extends Object
{
	int age, salary;
	String name;
	
	public Employee(int age, int salary, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	
	//
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
			
		}
		
		//if parameternull or both are not same class  
		if(obj == null || this.getClass()!=obj.getClass())
		{
			return false;
		}
		
		//Compare using data member
		Employee emp = (Employee)obj;
		
		//compare 2 obj i.e. e1 & e2
		return this.name == emp.name 
				&& this.age == emp.age
				&& this.salary == emp.salary;
		
	}
}

public class EquqlsMethodAndHashCodeMethod {

	public static void main(String[] args) {
	//System.out.println(2=2);	
	
	Employee e1 = new Employee(25,37000,"Sachin");
	Employee e2 = new Employee(45,40000,"Virat");	//False
		
	Employee e3 = new Employee(45,40000,"Sachin");
	Employee e4 = new Employee(45,40000,"Sachin");	//true
	
	System.out.println(e1.equals(e2));	
	System.out.println(e3.equals(e4));	
	
	}

}
