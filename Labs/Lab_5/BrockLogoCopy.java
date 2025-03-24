import Media.*;
import java.awt.Color;

public class BrockLogoCopy
{

    int width;
    int height;
    private Picture background;

    public BrockLogoCopy()
    {
        Picture pic1 = new Picture();

        width = pic1.getWidth();
        height = pic1.getHeight();
        
        background = new Picture((2*width), (2*height));// and this the paper 

        PictureDisplayer display = new PictureDisplayer((2*width), (2*height)); // set the height to 2 times the height since ther is two images, like wise with the width
        

        display.placePicture(pic1);
        display.placePicture(background);

        display.waitForUser();

        move(pic1, 0,0,0);
        move(pic1, width,0,1);
        move(pic1, 0,height,2);
        move(pic1, width,height,3);

        display.close();
    }

    /**
     * move - moves the pixels to form the next image
     *
     * @param pic is the picture your copying, startX is the starting point,startY is the starting horizontal point, version helps determine the colour
     */

    private void move(Picture pic, int startX, int startY, int version)
    {
        for(int x = 0; x < width; x++) 
        { 
            for(int y = 0; y < height; y++)
            {             
                Pixel p = pic.getPixel(x, y);
                Color c = changeColour(p,version);
                background.getPixel(x+startX, y+startY).setColor(c);
            }
        }
    }

    /**
     * iteration - uses the version number to determine what color to use
     *
     * @param version helps determine the colour
     * @return the color according to the version number
     */

    private Color iteration(int version)
    {
        if(version == 1)
        {
            return Color.cyan;
        }
        else if(version == 2)
        {
            return Color.magenta;
        }
        else if(version == 3)
        {
            return Color.yellow;
        }
        else
        {
            return Color.BLACK;
        }
    }

    /**
     * changeColour - checks if the pixel is white or black and clanges the colour
     *
     * @param p is the pixel being checked, version helps determine the colour
     * @return the new color
     */
    
    private Color changeColour(Pixel p, int version)
    {
        Color newColour;
        if(p.getDistance(255,255,255)<50)
        { 
            newColour = p.getColor();  
        }
        else
        {
            newColour = iteration(version); 
        }
        return newColour;
    }
}
