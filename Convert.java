class Convert
{
	public static void main(String[] args)
	{
		Integer i=Integer.parseInt(args[0]);
		System.out.println("Given Number : "+i);
		System.out.println("Binary Equivalent : "+ Integer.toBinaryString(i));	
		System.out.println("Octal Equivalent : "+ Integer.toOctalString(i));
		System.out.println("Hexadecimal Equivalent : "+ Integer.toHexString(i));
	}
}