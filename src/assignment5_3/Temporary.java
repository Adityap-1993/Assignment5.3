package assignment5_3;

public class Temporary extends Employee{         //extending abstract class Employee        
	
	double basic,hra,pf;           //instance variables 
	
	 Temporary()                          //default constructor 
	 {
		 super();
	 }
	 
	 Temporary(int id,String name,double basic,int leaves)     //parameterized constructor 
	 {
		 super(id,name,leaves);
		 
		 this.basic=basic;
	 }
	
	public void leave_details() {
		System.out.println("The leave details for Employee:- ");
		System.out.println("Total leaves available : " + total_leaves);
	}
	
	
	public  boolean avail_leave(int no_of_leaves,char type_of_leave)              ///method for availing leaves
	{
		
		if(type_of_leave=='P' || type_of_leave=='p')
				{
			if(no_of_leaves<=total_leaves)
				{System.out.println("The employee has requested leaves : " +no_of_leaves);
				total_leaves=total_leaves-no_of_leaves;
		     	return true;}
			
			else {
				System.out.println("Insufficient leave balance");
				return false;
			}
				}
		
			
		
		     	else 
		     	{
		     		System.out.println("Invalid User Input");
		     		return false;
		     	}
				
		
	}
	
	
	
	public void calculate_balance_leaves()             //method for calculating leave balance 
	{ 
		
		System.out.println("Total leave balance remaining : " +total_leaves);
	}
	
	public void calculate_salary()          //calculating salary
	{
		
		System.out.println("The id of Employee : " +empid);
		System.out.println("The name of Employee : " +emname);
		System.out.println("The salary details for Employee :-");
		System.out.println("The basic salary for Temporary  employee : Rs " +basic);
		
		pf=basic*0.12;
		hra=basic*0.5;
		
		total_salary=basic+hra-pf;
		
		System.out.println("The total salary for employee : Rs  " +total_salary);
		
	}

}//class ends
