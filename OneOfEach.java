public class OneOfEach 
{
	public static void main (String[] args)
	{
		double gender = (Math.random());// below 0.5 - boy, above 0.5 - girl (50 50 chance)
		int c = 0;
		if (gender<0.5)
		{
			while (gender<0.5)
			{
				System.out.print("b" + " ");
				gender = (Math.random());
				c++;
			}
			System.out.println("g");
		}
		else
		{
			while (gender>0.5)
			{
				System.out.print("g" + " ");
				gender = (Math.random());
				c++;
			}
			System.out.println("b");
		}
		System.out.println("You made it... and you now have" + " " + (c+1) + " " + "children.");
	}
}
