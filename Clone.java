class Employee implements Cloneable
{  
	int empid;  
	String name;  
  
	Employee(int empid,String name)
	{  
		this.empid=empid;  
		this.name=name;  
	}  
  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
  
	public static void main(String args[])
	{  
	try
	{  
		Employee e1=new Employee(101,"Ram");  
 		Employee e2=(Employee)e1.clone(); 
  		System.out.println(e2.empid+" "+e2.name);  
		e1.empid=102;
		e1.name="Shyam";
		System.out.println(e1.empid+" "+e1.name); 
  
	}
		catch(CloneNotSupportedException c){}  
	}  
} 