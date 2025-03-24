import Media.*;
import java.awt.Color;

public class BigImage
{

    Picture original = new Picture();
    PictureDisplayer display;

    public BigImage()
    {   
        
        Picture result = embiggening(original);
        display = new PictureDisplayer(result);
        display.waitForUser();
        display.close();
        
    }

    private Picture embiggening(Picture original )
    {
        
        Picture result = new Picture(original.getWidth()*2, original.getHeight()*2);
        
        int h = result.getHeight();
        int w = result.getWidth();

        for (int y = 0; y < h-1; y++)
        {

            for (int x = 0; x < w-1; x++)
            {
                
                int x1 = x/2;
                int x2 = (x+1)/2;
                int y1 = y/2;
                int y2 = (y+1)/2;
                
                Pixel p1 = original.getPixel(x1, y1);
                Pixel p2 = original.getPixel(x2, y1);
                Pixel p3 = original.getPixel(x1, y2);
                Pixel p4 = original.getPixel(y2, y2);
                
                Pixel p = result.getPixel(x, y);
                
                int r = (p1.getRed() + p2.getRed() + p3.getRed() + p4.getRed())/4;
                int g = (p1.getGreen() + p2.getGreen() + p3.getGreen() + p4.getGreen())/4;
                int b = (p1.getBlue() + p2.getBlue() + p3.getBlue() + p4.getBlue())/4;
                
                p.setRed(r);
                p.setGreen(g);
                p.setBlue(b);
                
            }

        }

        return result;
        
    }

}
