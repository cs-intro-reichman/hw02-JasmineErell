import java.util.Random;

public class OneOfEachStats1 
{
	public static void main (String[] args)
	{
        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);
        int totalKids = 0;
        int with2 = 0;// counts how many famtlies are with 2 children
        int with3 = 0;// counts how many famtlies are with 3 children
        int with4 = 0;// counts how many famtlies are with 4 or more children
        for (int i =0; i < T; i++)
        {
            double gender = generator.nextDouble();// below 0.5 - boy, above 0.5 - girl (50 50 chance)
            int c = 0;// counts the children in each family
            if (gender<0.5) // families that starts with boy
            {
                while (gender<0.5)
                {
                    gender = generator.nextDouble();
                    c++;
                }
                c++;
                totalKids = totalKids + c ;// count thr amount of kids with an extra 1 for the next gender 
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
                while (gender>0.5)// families that starts with girl
                {
                    gender = generator.nextDouble();
                    c++;
                }
                c++; 
                totalKids = totalKids + c ;// count the amount of kids with an extra 1 for the next gender 
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
