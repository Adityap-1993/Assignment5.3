package assignment5_3;

public abstract  class Employee {   //abstract class definition
	 
	protected int empid;              //instance variables
	protected  String emname;
	protected  int total_leaves;
	protected  double total_salary;
	
	
	Employee(){                       //default constructor
	
		this.empid=-1;
		this.emname=null;
		
	}
	
	Employee(int id,String name)        //two parameter constructor 
	{
		this.empid=id;
		this.emname=name;
	}
	
	Employee(int id,String name,int total_leaves)      //three parameter constructor
	{
		this.empid=id;
		this.emname=name;
		this.total_leaves=total_leaves;
	}
	
	public abstract void calculate_balance_leaves();      //abstract method 1
	
	public abstract boolean avail_leave(int no_of_leaves,char type_of_leave);  //abstract method 2
	
	public abstract void calculate_salary();                //abstract method 3
	

}//class ends
