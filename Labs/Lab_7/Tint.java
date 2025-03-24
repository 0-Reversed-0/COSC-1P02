import Media.*;
import BasicIO.*;

public class Tint
{
  
    private BasicForm balls;
    private Picture pic;
    private Picture pic2 = new Picture(50,50);
    
    public Tint()
    {
        balls = new BasicForm ("Tint","Load", "Swatch","Save","Quit");
        balls.setTitle("TINTER");

        int button;

        setup();

        while(true)
        {
            button = balls.accept();
            if(button == 0)
            {
                TINT();
            }
            else if(button == 1)
            {                
                load();
            }
            else if(button == 2)
            {
                Swatch();
            }
            else if(button == 3)
            {
                pic.save();
            }
            else if (button == 4)
            {
                break;
            }
        }

        balls.close();
    }

    private void setup()
    {
        balls.addTextField("R", "r:", 7, 300, 570);
        balls.addTextField("G", "g:", 7, 300, 600);
        balls.addTextField("B", "b:", 7, 300, 630); 
        balls.addTextField("S", "Str", 7, 400, 570);
    }

    private void TINT()
    {
        int r1 = balls.readInt("R");
        int g1 = balls.readInt("G");
        int b1 = balls.readInt("B");
        double f = balls.readDouble("S");
        f = f*0.01;

        for(Pixel p: pic) 
        {
            int r2 = p.getRed();
            int g2 = p.getGreen();
            int b2 = p.getBlue();

            int r = (int) ( ( (1-f)*(r2) )+(r1*f) );
            int g = (int) ( ( (1-f)*(g2) )+(g1*f) );
            int b = (int) ( ( (1-f)*(b2) )+(b1*f) );

            p.setRed(r);   
            p.setGreen(g); 
            p.setBlue(b);
        }
        
    }

    private void load()
    {
        pic = new Picture();
        int h = pic.getHeight();
        int w = pic.getWidth();
        balls.addCanvas("P", "Picture:",w, h, 10, 50);
        balls.addCanvas("C", "Swatch:",50, 50, 10, 570);
        balls.placePicture("P", pic);
        balls.placePicture("C", pic2);
    }
    
    private void Swatch()
    {
        
        int r = balls.readInt("R");
        int g = balls.readInt("G");
        int b = balls.readInt("B");

        for(Pixel p: pic2) 
        {
            p.setRed(r);   
            p.setGreen(g); 
            p.setBlue(b);
        }
        
    }

}
