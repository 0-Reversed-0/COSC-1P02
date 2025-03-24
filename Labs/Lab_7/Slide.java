import Media.*;
import BasicIO.*;

public class Slide
{

    private BasicForm balls;
    private Picture pic = new Picture(50,50);

    public Slide()
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
        balls.addSlider("R", "r", 0, 255, 200, 20, 15);
        balls.addSlider("G", "g", 0, 255, 200, 20, 65);
        balls.addSlider("B", "b", 0, 255, 200, 20, 105);
        balls.addCanvas("S", "Swatch:",50, 50, 100, 200); 
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