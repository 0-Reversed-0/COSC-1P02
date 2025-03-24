import Media.*;
import java.awt.Color; 

public class TurtleSetupExample
{

    private Turtle yertle;
    private TurtleDisplayer display;

    public TurtleSetupExample () 
    {

        yertle = new Turtle(0);
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        display.waitForUser();
        yertle.penDown();
        yertle.setPenColor(Color.black); 


        for(int j = 1; j<= 4; j++)
        {

            for(int i = 1; i<= 4; i++)
            {
                yertle.forward(15);
                yertle.right(Math.PI/2);
                yertle.forward(15);
                yertle.left(Math.PI/2);
            }
            yertle.left(Math.PI/4);            
            for(int aneeba = 1; aneeba<=4; aneeba++)
            {
                yertle.forward(20);
                yertle.right(Math.PI/2);
            }
            yertle.right(Math.PI/2+Math.PI/4);
        }

        display.close();

    }
}