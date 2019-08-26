import java.util.*;
class Binary
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Integer i=sc.nextInt();
		String b=Integer.toBinaryString(i);
		int a=Integer.parseInt(b);
		System.out.println(String.format("%08d",a));
	}
}