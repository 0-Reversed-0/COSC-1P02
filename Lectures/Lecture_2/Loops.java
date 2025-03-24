import Media.*;

public class Loops
{
    public static void main(String args[])
    {
        // for (number (1st) ; condition (2nd) ; increment (4th)){(3rd)}
        for (int i = 0; i<=4;i++)
        {
            System.out.println(i);
        }
        
        
        //Nested loop (a loop within a loop)
        for (int i = 0; i<=5;i++)
        {
            for (int j = 1; j<11; j++){
                System.out.println(j);
            }
        }
        
    }
}
