import Media.*;

public class Lab
{

    private Turtle abc;
    private TurtleDisplayer display;

    public Lab()
    {
        abc = new Turtle(0);
        display = new TurtleDisplayer(abc, 500, 500);
        display.waitForUser(); 

        //////////////////////////////////////////////////

        //diamond(40);
        //cube();
        //cubes(4);
        //coolThing();
        //dumbThing();
        balls();

        display.close();
    }

    public void diamond(double sideLength)
    {

        abc.left(Math.PI/6);
        abc.penDown();
        abc.forward(sideLength);
        abc.left(2*Math.PI/3);
        abc.forward(sideLength);
        abc.left(Math.PI/3);
        abc.forward(sideLength);
        abc.left(2*Math.PI/3);
        abc.forward(sideLength);
        abc.left(Math.PI/6);
        abc.penUp();

    }

    private void cube()
    {
        for (int i = 1; i<=3; i++)
        {
            diamond(40);
            abc.right(2*Math.PI/3);
        }
    }

    private double adjacent()
    {
        double adj = Math.cos(Math.PI/6) * 40;
        return adj;
    }

    private double opposite()
    {
        double opp = 40*(Math.sin(Math.PI/6));
        return opp;
    }

    private void cubes(int howMany)
    {
        double adj = adjacent();
        abc.moveTo(-104,-20);
        for (int i =1; i <= howMany; i++)
        {
            cube();
            abc.forward(2*adj);
        }
        abc.moveTo(0,0);
    }

    private void coolThing()
    {
        cubes(4);
        double a = adjacent();
        double o = opposite();

        abc.moveTo(2*a,0);
        diamond(40);
        abc.backward(2*a);
        diamond(40);
        abc.backward(2*a);
        diamond(40);
        abc.moveTo(a,o);
        diamond(40);
        abc.backward(2*a);
        diamond(40);
        abc.moveTo(0,2*o);
        diamond(40);

    }

    private void cubes2(int howMany)
    {
        double adj = adjacent();

        abc.backward(3*adj);

        for (int i =1; i <= howMany; i++)
        {
            cube();
            abc.forward(2*adj);
        }
        abc.moveTo(0,0);
    }

    private void dumbThing()
    {
        double a = adjacent();
        double o = opposite();

        cubes2(3);
        abc.moveTo(a,o);
        diamond(40);
        abc.backward(2*a);
        diamond(40);
        abc.moveTo(0,2*o);
        diamond(40);

    }

    private void balls()
    {
        cubes(4);
        double a = adjacent();
        double o = opposite();
        double x = 2*a;
        double y = 0;
        int b = 3;

        for (int i = 1; i<=3; i++)
        {
            abc.moveTo(x, y);
            
            for (int j = 1; j<=b; j++)
            {
                diamond(40);
                abc.backward(2*a);
            }
            
            y = y+o;
            x = x-a;
            b = b-1;
        }

    }
}