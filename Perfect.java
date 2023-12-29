/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		String dev = " "; 
		int sum = 0;
		int i = 1;
		while (i<num)
		{
			if (num%i == 0)
			{
				if(i!=1)
				{
					dev = dev + "+" + " " +i + " "; 
				}
				sum += i;
			}
			i++;
		}
		if(num == sum)
		{
			System.out.println(num + " " + "is a perfect number since" + " " + num + " = 1" + dev );
		}
		else
		{
			System.out.println(num + " " + "is not a perfect number");
		}
	}
}
