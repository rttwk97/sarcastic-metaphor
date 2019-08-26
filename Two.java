/*Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each
 of them to print notice message that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated,the first compartment can be Luggage, the second one could be Ladies and so on..]*/
import java.util.*;
abstract class Compartment
{
	public abstract String notice();
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return "It is a FirstClass compartment";
	}	
}
class Ladies extends Compartment
{
	public String notice()
	{
		return "It is a Ladies compartment";
	}	
}
class General extends Compartment
{
	public String notice()
	{
		return "It is a General compartment";
	}	
}
class Luggage extends Compartment
{
	public String notice()
	{
		return "It is a Luggage compartment";
	}	
}
class TestCompartment
{
	public static void main(String []args)
	{
		Compartment arr[]=new Compartment[10];
		Random rand=new Random();
		
		int n=rand.nextInt(4);
		n=n+1;
		
		if(n==1)
		{
			arr[0]=new FirstClass();
			System.out.println(arr[0].notice());
		}
		else if(n==2)
        {
            arr[1] = new Ladies();
            System.out.println(arr[1].notice());
        }

        else if(n==3)
        {
            arr[2] = new General();
            System.out.println(arr[2].notice());
        }

        else 
        {
            arr[3] = new Luggage();
            System.out.println(arr[3].notice());
        }
	}
}
		

