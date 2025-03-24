import Media.*;
import java.awt.Color;

public class Creep
{

    private Picture p1 = new Picture();
    private Picture p2 = new Picture();
    private PictureDisplayer display = new PictureDisplayer();

    public Creep()
    {
        display.placePicture(p1);
        display.placePicture(p2);
        display.waitForUser();

        balls(p1, p2,0.7,0.3);

        display.close();
    }

    private void balls(Picture p1, Picture p2,double factor1,double factor2)
    {

        while (p1.hasNext()) 
        {
            Pixel a1 = p1.next();
            Pixel a2 = p2.next();

            int r1 = a1.getRed();
            int r2 = a2.getRed();
            int g1 = a1.getGreen();
            int g2 = a2.getGreen();
            int b1 = a1.getBlue();
            int b2 = a2.getBlue();

                
            a1.setRed((int)((r1*factor1)+(r2*factor2)));
            a1.setGreen((int)((g1*factor1)+(g2*factor2)));
            a1.setBlue((int)((b1*factor1)+(b2*factor2)));
            a2.setRed((int)((r1*factor1)+(r2*factor2)));
            a2.setGreen((int)((g1*factor1)+(g2*factor2)));
            a2.setBlue((int)((b1*factor1)+(b2*factor2)));

        }

        for(Pixel aSS : p2)
        {

            int r = aSS.getRed();
            int g = aSS.getGreen();
            int b = aSS.getBlue();

            double factor = (0.2*(Math.random())+0.8);

            aSS.setRed((int)(r*factor));
            aSS.setGreen((int)(g*factor));
            aSS.setBlue((int)(b*factor));

        }

    }

}