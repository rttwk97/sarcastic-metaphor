/*Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and 
getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit account interest rate 
that the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.

Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class. 
The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and 
KotMBank - Savings 6% Fixed 9%.

Create a main method to test the above classes and their methods. Try one by one and observe your findings

a) ICICIBank i=new ICICIBank();

b) KotMBank k=new KotMBank();

c) GeneralBank g=new KotMBank();

d) GeneralBank g=new ICICIBank(); */

abstract class GeneralBank
{
	public abstract void getSavingsInterestRate();
	public abstract void getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank
{
	public void getSavingsInterestRate()
	{
		System.out.println("The savings interest rate of ICICI bank is:4%");
	}
	public void getFixedDepositInterestRate()
	{
		System.out.println("The fixed interest rate of ICICI bank is:8.5%");
	}
}
class KotMBank extends GeneralBank
{
	public void getSavingsInterestRate()
	{
		System.out.println("The savings interest rate of KotMBank bank is:6%");
	}
	public void getFixedDepositInterestRate()
	{
		System.out.println("The fixed interest rate of KotMBank bank is:9%");
	}
}
class One
{
	public static void main(String []args)
	{
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		GeneralBank g1=new KotMBank();
		GeneralBank g2=new ICICIBank();
		i.getSavingsInterestRate();
		i.getFixedDepositInterestRate();
		k.getSavingsInterestRate();
		k.getFixedDepositInterestRate();
		g1.getSavingsInterestRate();
		g1.getFixedDepositInterestRate();
		g2.getSavingsInterestRate();
		g2.getFixedDepositInterestRate();
	}
}
		
		
		
		