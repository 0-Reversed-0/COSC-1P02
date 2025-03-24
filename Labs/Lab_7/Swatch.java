import Media.*;
import BasicIO.*;

public class Swatch
{

    private BasicForm balls;
    private Picture pic = new Picture(50,50);

    public Swatch()
    {
        balls = new BasicForm ("Close", "COLOURR!!");
        balls.setTitle("RGB");
        int button = 1;

        setup();

        while(true)
        {
            button = balls.accept();
            if(button == 0)
            {
                break;
            }
            else if(button == 1)
            {
                Colouring(); 
            }
        }

        balls.close();
    }

    private void setup()
    {
        balls.addTextField("R", "r", 7, 10, 15);
        balls.addTextField("G", "g", 7, 110, 15);
        balls.addTextField("B", "b", 7, 210, 15);
        balls.addCanvas("S", "Swatch:",50, 50, 133, 100); 
    }

    private void Colouring()
    {
        int r = balls.readInt("R");
        int g = balls.readInt("G");
        int b = balls.readInt("B");

        for(Pixel p: pic) 
        {
            p.setRed(r);   
            p.setGreen(g); 
            p.setBlue(b);
        }

        balls.placePicture("S", pic);
    }
}