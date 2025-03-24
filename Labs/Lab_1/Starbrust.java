import Media.*;
import java.awt.Color;

public class Starbrust
{
    
    private Turtle abc;
    private TurtleDisplayer display;
    
    public Starbrust()
    {
        abc = new Turtle(0);
        display = new TurtleDisplayer();
        display.placeTurtle(abc);
        display.waitForUser();

        single();
        
        display.close();
    }
    
    private void single()
    {
         for(int i = 1; i <= 10; i++)
            {
                abc.penUp();
                abc.forward(15); 
                abc.penDown(); 
                abc.forward(7.5); 
                abc.penUp(); 
                abc.backward(22.5); 
                abc.left(Math.PI/5);
            }
    }
    
    
}
