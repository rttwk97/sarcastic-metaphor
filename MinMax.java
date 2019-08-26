public class MinMax 
{

	public static void main(String[] args) 
	{
		display(Byte.TYPE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		display(Short.TYPE, Short.MIN_VALUE, Short.MAX_VALUE);
		display(Integer.TYPE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		display(Long.TYPE, Long.MIN_VALUE, Long.MAX_VALUE);
		display(Float.TYPE, Float.MIN_VALUE, Float.MAX_VALUE);
		display(Double.TYPE, Double.MIN_VALUE, Double.MAX_VALUE);
	}

	public static void display(Class<?> type, Number min, Number max) {
		System.out.printf("%-6srange:\nmin:%-20s\nmax:%s\n", type, min, max);
	}

}