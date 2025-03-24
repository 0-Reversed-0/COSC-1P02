import Media.*;

public class Methods
{

    private Turtle yertle;
    private TurtleDisplayer display;

    public Methods ()
    {
        
        yertle = new Turtle(0);
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        display.waitForUser();

        hexa(50.5, 8, 20, 20); // draw hexagon here the arguement that represents the side length
        polygon(7, 20, 2, -40, -40);
        
    }
    
    private void polygon(int sides, int length, int penWidth, int x, int y)
    {
        
       yertle.penUp();
       yertle.moveTo(x,y);
       yertle.setPenWidth(penWidth);
       yertle.penDown();
       
       for (int i = 1; i <= sides; i++)
       {
           yertle.forward(length);
           yertle.right((2*Math.PI)/sides);
       }
        
    }

    private void drawingSquare() // Methods are used to store a code to do soemthing
    {
        yertle.penDown();
        for (int i = 1; i<=4; i++)
        {
            yertle.forward(10);
            yertle.right(Math.PI/2);
        }
    }

    private void drawTwoSquares()
    {

        drawingSquare(); // instead of using a loop just use your method to draw square
        yertle.forward(10);
        drawingSquare();

    }

    private void hexa(double l, int penWidth, int x, int y) //parameter here would be "double l"
    {
        
        yertle.penUp(); // always have it up
        yertle.moveTo(x,y); //no need to put a moveTo in constructor
        yertle.setPenWidth(penWidth);
        int s = 6;
        double a = Math.PI/3;
        yertle.penDown();

        for (int i = 1; i <= s; i++)
        {
            yertle.forward(l);
            yertle.right(a);
        }

    }

    private void shape()
    {
        int s = 15; // sides correlate with angle
        int l = 40;
        double a = 2*Math.PI / s; // no need to calculate angle then

        yertle.penDown();
        for(int i = 1; i <= s; i++)
        {
            yertle.forward(l);
            yertle.right(a);
        }

    }

}
