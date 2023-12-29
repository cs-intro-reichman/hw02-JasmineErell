public class DamkaBoard
 {	public static void main(String[] args)
	 {
		int num = Integer.parseInt(args[0]);
		int i = 1;
		int j = 1;
		while(i<=num)
		{
			while (j<num) 
			{
				if(i%2 == 0)
				{
					System.out.print(" " + "*");
				}
				else
				{
					System.out.print("*" + " ");
				}
				j++;
			}
			if (i%2==0)
			{
				System.out.println(" " + "*");
			}
			else
			{
				System.out.println("*" + " ");
			}
			j = 1;
			i++;
		}
	}
}
	
