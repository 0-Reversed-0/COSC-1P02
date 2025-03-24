import Media.*;

public class Notes
{

    private Turtle qwe;
    private TurtleDisplayer display;

    public Notes ()
    {
        
        qwe = new Turtle(0);
        display = new TurtleDisplayer();
        display.placeTurtle(qwe);
        display.waitForUser(); 
        
        polygon(8,20,2,5,10); // these are the arguements where they set the value of the parameters since they are empty as of now
        polygon(3,20,1,-50,-50); // draws triangle 
        polygon(4,20,3,50,50); // draws square
        printer(2, 6.0); // valid
        printer(2, 6); // also valid even if no decimal since double converts for you
        printer((int) 2.0, 6); // ONLY VALID IF (int) CAST IS THERE int does not convert unlike double
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        int b = add (5, 2); // adds 5+2
        System.out.println(b); 
        
        double c = subtract(5, 2); // subtracts 5-2
        System.out.println(c);
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        rando(); // returns a value of 1-10
        numberGenerator(10, 30); // gives a random number between 10 and 30
        
    }

    /**
     * Parameteres and arguements
     */
    
    private void polygon(int sides, int length, int penWidth, int x, int y) //parameters are local varibles
    {

        qwe.penUp();
        qwe.moveTo(x,y);
        qwe.setPenWidth(penWidth);
        qwe.penDown();

        for (int i = 1; i <= sides; i++)
        {
            qwe.forward(length);
            qwe.right((2*Math.PI)/sides);
        }

    }
    
    /**
     * Method Types
     */
    
    
    private void /* void means return nothing */ printer(int x, double y) // can reuse parameter varibles since local variable
    {
        System.out.println(x);
        System.out.println(y);
    }
    
    private int add(int x, int y) /* if you add return while having 'void' here then error */ 
    {
        int result = (x + y);
        return result; // this command returns a variable here its returning x +y
    }
    
    private double subtract(int x, int y) /* only returns one value */
    {
        //int result = (x - y); 
        return x - y; // this is perfectly valid and one less line of code
        //return 0; this would only return 0 
    }
    
    /**
     * Random Number Generation
     */
    
    private double rando()
    {
        double a = Math.random(); // random number between 0.0 - 0.99999....9
        double b = 10*Math.random(); // 0.0-9.999999....9
        int c = (int)(10*Math.random()); // chooses between 0-9
        int d = (int)(10*Math.random()+1);//chooses between 1-10
        //            |range           |starting variable
        //             -> 1 then the next 10 numbers
        //             -> To get range just do max value - min value 
        
        return d;
    }
    
    
    private void numberGenerator(int min, int max)
    {
        int a = (int)((max-min)*Math.random()+min);
        System.out.println(a);
    }
}