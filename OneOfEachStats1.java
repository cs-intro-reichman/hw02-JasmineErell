import java.util.Random;

public class OneOfEachStats1 
{
    public static void main (String[] args)
	{

        int totalKids = 0;
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
        }
    
    System.out.println("You made it... and you now have "+  totalKids + " " + "children.");
        
}
}
