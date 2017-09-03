package assignment5_3;

public class Main {       //main class definition 
 
	public static void main(String[] args) {             //main starts here
		
		System.out.println("--PERMANENT EMPLOYEE--");       //creating permanent class employee
		Permanent p1=new Permanent(5465,"Ram",30000,10,15,20);
		
		
		p1.calculate_salary();
		p1.print_leave_details();
		p1.avail_leave(5,'c');
		p1.calculate_balance_leaves();
		
		System.out.println("  ");
		
		
		System.out.println("--TEMPORARY EMPLOYEE--");             //creating temporary class employee
		
		Temporary T1=new Temporary(7898,"Sham",1000,10);
		
		T1.calculate_salary();
		T1.leave_details();
		T1.avail_leave(6,'p');
		T1.calculate_balance_leaves();
		
		
		
		
	}

}//class ends
