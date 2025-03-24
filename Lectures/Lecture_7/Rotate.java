import Media.*;
import java.awt.Color;

public class Rotate
{

    private Picture pic = new Picture();
    private PictureDisplayer display = new PictureDisplayer(pic);

    public Rotate()
    {
        display.waitForUser();
        rotate(pic);
        display.close();
    }
    
    private Picture rotate(Picture pic)
    {
        int w = pic.getWidth();
        int h = pic.getHeight();
        
        Picture result = new Picture(h,w);
        
        for (int y = 0; y < h; y++)
            for (int x = 0; x < w; x++)
            {
                Color c = pic.getPixel(x,y).getColor();
                result.getPixel(y,w - 1 - x).setColor(c);
                
            }
        
        return result;
    }
    
}
