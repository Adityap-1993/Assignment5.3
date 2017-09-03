package assignment5_3;

public class Permanent extends Employee {     //extending abstract class Employee
	
	private int paid_leaves,sick_leaves,casual_leaves;     //instance variables
	
	private double basic,hra,pf;
	
	Permanent(){             //default constructor 
		super();
	}
	
	Permanent(int id,String name,double basic,int pl,int sl,int cl){      //parameterized constructor

		super(id,name);
		this.basic=basic;
		this.paid_leaves=pl;
		this.sick_leaves=sl;
		this.casual_leaves=cl;
				
	}
	
	public void print_leave_details()              //method for displaying leave details
	
	{
		
		System.out.println("The leave details for Employee :- " );
		System.out.println("Paid Leaves : " +paid_leaves);
		System.out.println("sick_leaves : " +sick_leaves);
		System.out.println("casual Leaves : "+casual_leaves);
		System.out.println("Total leaves available : " + (paid_leaves + sick_leaves + casual_leaves));
			
	}
	
	public  boolean avail_leave(int no_of_leaves,char type_of_leave)         //method for availing leaves
	{
	
		if(type_of_leave=='P' || type_of_leave=='p')
		{
		
			if(no_of_leaves<=paid_leaves)
				
				{
				paid_leaves=paid_leaves-no_of_leaves;
				System.out.println("Paid leaves selected : " + no_of_leaves );
				System.out.println("The remaining paid leaves  : " + paid_leaves);
				return true;
			
			}
			else 
				{
				System.out.println("Insufficient leave balance");
			return false;
			}
		}
		
		
		
		else if(type_of_leave=='S' || type_of_leave=='s')
		{
			if(no_of_leaves<=sick_leaves)
			{
				sick_leaves=sick_leaves-no_of_leaves;
				System.out.println("Sick  leaves selected : " + no_of_leaves );
				System.out.println("The remaining sick  leaves : " + sick_leaves);
				return true;
			}
			else
				System.out.println("Insufficient leave balance");
			return false;
		}
		
		
		else if(type_of_leave=='C' || type_of_leave =='c')
		{
			if(no_of_leaves<=casual_leaves)
			{
				casual_leaves=casual_leaves-no_of_leaves;
				System.out.println(" Casual leaves selected : " + no_of_leaves );
				System.out.println("The remaining casual leaves  : " + casual_leaves);
				return true;
			}
			
			else
				System.out.println("Insufficient leave balance");
			return false;
		}
		else 
			System.out.println("Invalid input from user");
		return false;
	}
	
	
	public void calculate_balance_leaves()             //calculating leave balance
	{
		System.out.println("The leave balance remaining : "  + (paid_leaves + sick_leaves + casual_leaves));
		
	}
	
	public void calculate_salary()                //calculating salary
	{
		pf=basic*0.12;
		hra=basic*0.5;
		
		total_salary=basic+hra-pf;
		System.out.println("The id  of employee : " +empid);
		System.out.println("The Name of employee : " +emname);
		System.out.println("The salary details of employee :- ");
		System.out.println("The basic salary for Permanent employee : Rs " +basic);
		System.out.println("The total salary : Rs  " + total_salary);
	}
	
	
	

}//class ends
