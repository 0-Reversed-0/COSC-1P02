import Media.*;
import java.awt.Color; 

public class Lec3
{

    private Turtle yertle;
    private TurtleDisplayer display;

    public Lec3 () 
    {

        yertle = new Turtle(0);
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        display.waitForUser();
        yertle.penDown();
        yertle.setPenColor(Color.black); 
        
    }
    
}