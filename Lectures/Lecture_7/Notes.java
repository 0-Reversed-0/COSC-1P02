import Media.*;
import java.awt.Color;

public class Notes
{

    private Picture pic = new Picture();
    private PictureDisplayer display = new PictureDisplayer(pic);

    public Notes()
    {
        display.waitForUser();
        //methodChaining();
        makeGrey();

        display.close();
    }

    private void methodChaining()
    {
        int r = pic.getPixel(0,0).getRed(); // here now we get the red value for the the top right pixel
        System.out.println(r); 

        int s = pic.getPixel(0,0).getColor().getRed(); //using the dot we can have all our method only using one line of code
        // with method chaing the method MUST RETURN AN OBJECT ONLY
        System.out.println(s);
    }

    private void makeGrey()
    {
        int h = pic.getHeight();
        int w = pic.getWidth();

        for (int y = 0; y < h; y++) // u can also use a normal for loop to choose specfically where to start
            for (int x = 0; x < w; x++)
            {

                Pixel p = pic.getPixel(x,y);
                Color c = getBright(p);
                
                p.setColor(c);
                
            }
    }

    public Color getBright(Pixel p)
    {

        int r = p.getRed();
        int g = p.getGreen();
        int b = p.getBlue();

        int avg = (r+g+b)/3;

        Color c = new Color(avg,avg,avg);

        return c;
    }

}
