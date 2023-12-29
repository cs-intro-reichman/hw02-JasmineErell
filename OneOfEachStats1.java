public class Test {
public static void main (String[] args)
{
    int totalKids = 0;
    int with2 = 0;// counts how many famtlies are with 2 children
	int with3 = 0;// counts how many famtlies are with 3 children
	int with4 = 0;
    int T = 3;
    for (int i =0; i < T; i++)
    {
        double gender = (Math.random());// below 0.5 - boy, above 0.5 - girl (50 50 chance)
		int c = 0;// counts the children in each family
		if (gender<0.5)
		{
			while (gender<0.5)
			{
				System.out.print("b" + " ");
				gender = (Math.random());
				c++;
			}
            c++;
            totalKids = totalKids + c ;// count thr amount of kids with an extra 1 for the next gender 
			System.out.println("g");
            if (c>=4)// to count the amount of families with X children
            {
                with4 ++;
            }
            else if (c==3)
            {
                with3 ++;
            }
            else
            {
                with2++;
            }
		}
		else
		{
			while (gender>0.5)
			{
				System.out.print("g" + " ");
				gender = (Math.random());
				c++;
			}
            c++; 
            totalKids = totalKids + c ;// count thr amount of kids with an extra 1 for the next gender 
			System.out.println("b");
             if (c>=4)// to count the amount of families with X children
            {
                with4 ++;
            }
            else if (c==3)
            {
                with3 ++;
            }
            else
            {
                with2++;
            }
		}
    }
    System.out.println(with2 + " " + with3 + " " + with4);
    System.out.println("Average: " + (double)(totalKids)/T + " " + "children to get at least one of each gender.");
    System.out.println("Number of families with 2 children: " + with2);  
    System.out.println("Number of families with 3 children: " + with3); 
    System.out.println("Number of families with 4 or more children: " + with4); 
    if (with4>with3 && with4>with2)
    {
        System.out.println("The most common number of children is 4 or more.");
    }
    else if (with3>with2 && with3>with4)
    {
        System.out.println("The most common number of children is 3.");
    }
    else
    {
        System.out.println("The most common number of children is 2.");
    }
}
}