import Media.*;
import java.awt.Color;

public class Notes
{
  
    private Turtle ass;
    private TurtleDisplayer asshole;
    private Picture balls;
    private PictureDisplayer sack;
    
    public Notes()
    {
        /**
        ass = new Turtle(0);
        asshole = new TurtleDisplayer(ass);
        asshole.close();
        */
        balls = new Picture();
        sack = new PictureDisplayer();
        
        //whileLoop();
        //ifStatement();
        
    }

    public void whileLoop()
    {
    
        /**
         * While loops are useful to stop a loop until a condition is or is not fufilled
         * They are also useful when we don't know when the condition is fulfilled (unlike a for loop) 
         */
        
        //int x = 6; // this will loop forever since x is always 6

        int x = 10; //In this case it wont loop since x is never 6
        
        while (x == 6 /* condition */)
        {
           System.out.println("ass"); 
        }
        
        while (x < 7) // This will repeat 7 times until it gets x gets to 7 if x = 0
        {
            System.out.println("ass");
            x++; // adding an increment makes it equivelent to a for loop
        }
        
        int a = (int) (Math.random()*100); // random number from 0-100
        int counter = 0; // count how much attempts until we got the number
        
        while (a != 40) // This is where while loops is useful because we dont know exactly when the loop will end
        {
            System.out.println(a); // number will keep repeating until conditon met
            a = (int) (Math.random()*100);
            counter++;
        }
        
        System.out.println("Balls: " + counter);
            
    }
    
    private void ifStatement()
    {
        
        /**
         * If statements are where it will either run the code or not 
         * They only run once when the codition is met
         */
        
        int x = 0;
        
        if (x==0) // this will run once
        {
            System.out.println("ass");
        }
        
        if (x==2) // this wont run
        {
            System.out.println("ass");
        }
        else // Since it doesnt fulfill the first condition then it will run the else condtion
        {
            System.out.println("tits"); // unless x = 2 it will print "ass" then in all other cases it will print "tits"
        }
        
        int a = (int) (4*Math.random());
        
        if (a == 0)
        {
            System.out.println("zero");
        }
        else if (a == 1) // you can have an infinite amount of "else if"
        {
            System.out.println("one");
        }
        else if(a == 2) 
        {
            System.out.println("two");
        }
        else
        {
            System.out.print("no good number :(");
        }
    }
    
}
