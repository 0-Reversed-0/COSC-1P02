import Media.*;
import java.awt.Color; 

public class Lab
{

    private Turtle abc;
    private TurtleDisplayer display;
    private Turtle cba;
    private TurtleDisplayer display2;

    public Lab()
    {
        ////////////////////////////////////
        
        abc = new Turtle(0);
        display = new TurtleDisplayer();
        display.placeTurtle(abc);
        display.waitForUser(); 
        
        ////////////////////////////////////

        cba = new Turtle(0);
        display2 = new TurtleDisplayer();
        display2.placeTurtle(cba);
        display2.waitForUser(); 
        
        ////////////////////////////////////

        
        /**
         * Random Walks
         */

        for(int i = 1; i <= 20; i++)
        {
            randomWalks();
        }

        //////////////////////////////////// 

        /**
         * Fireworks
         */

        abc.setPenWidth(500);
        abc.penDown();
        abc.forward(20);
        abc.setPenWidth(1);
        abc.penUp(); 
        //for(int i = 1; i<=20; i++){fireworks1();}
        
        for(int i = 1; i<=4; i++){fireworks2();}

        //////////////////////////////////// 
        display.close();
        display2.close();
    }

    /**
     * Random Walks
     */

    private int randoNum()
    {
        int x = (int)(150*Math.random()+1);
        return x;
    }

    private void randomWalks()
    {
        cba.penUp();
        cba.penDown();

        int x = randoNum();
        int y = randoNum();

        cba.moveTo(x,y); 

    }
    
   
    /**
     * Fireworks
     */

    private void fireworks1()
    {
        abc.penUp();
        abc.setPenColor(Color.lightGray);

        int x = randoNum();
        int y = randoNum();

        abc.moveTo(x,y);

        single();
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
    
    
    private void cluster()
    {
        Color ate =new Color((int)(Math.random()*16777216));
        abc.setPenColor(ate);
        
        burst();
        
        abc.penUp();
        abc.backward(30);
        abc.right(Math.PI/2);
        abc.forward(30);
        
        for (int y = 1; y<= 3; y++) {
            Color rc=new Color((int)(Math.random()*16777216));
            abc.setPenColor(rc);
            
            abc.left(2*Math.PI/3);
            
            //////////////////////////////////
            burst();
            //////////////////////////////////
            
            abc.forward(60);
            
        }
    }

    private void burst()
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
    
        private void fireworks2()
    {
        abc.penUp();
        abc.setPenColor(Color.lightGray);

        int x = randoNum();
        int y = randoNum();

        abc.moveTo(x,y);

        cluster();
    }
    
}
