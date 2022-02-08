/*
1) Write a function in java to find the factorial in class perfect and then 
call that function from main woith in anotheer clss  

2)Create employe class store employee details by using setter method then 
print details of employee either using getter method or toString() method
 */

package oops;

class emp
{
	String emp_name, emp_add;
	int emp_no, emp_phn_no, emp_id;
	
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public String getEmp_add() {
		return emp_add;
	}
	public void setEmp_add(String emp_add) {
		this.emp_add = emp_add;
	}

	public int getEmp_phn_no() {
		return emp_phn_no;
	}
	public void setEmp_phn_no(int emp_phn_no) {
		this.emp_phn_no = emp_phn_no;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	@Override
	public String toString() {
		return "emp [emp_name=" + emp_name + ", emp_add=" + emp_add + ", emp_no=" + emp_no + ", emp_phn_no="
				+ emp_phn_no + ", emp_id=" + emp_id + "]";
	}
	
}

public class employee {

	public static void main(String[] args) {
		
		emp oemp =new emp();
		
		oemp.setEmp_name("Apurva");
		
		
		oemp.setEmp_id(27);
		
		
		oemp.setEmp_add("Pune");
		
		
		oemp.setEmp_phn_no(526978252);
	
	
		System.out.println(oemp.getEmp_name()+" "+ oemp.getEmp_id()+" "+oemp.getEmp_add()+" "+oemp.getEmp_phn_no());
	}

}
