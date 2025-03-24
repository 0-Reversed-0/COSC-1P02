import Media.*;
import java.awt.Color;

public class Notes
{

    public Notes()
    {
        Picture ass = new Picture();
        PictureDisplayer asshole = new PictureDisplayer(ass);

        asshole.waitForUser();

        //forEachLoops(ass);
        //BLACKKK(ass);
        //Booleans();
        example(ass);
        
        asshole.close();
    }

    private void BLACKKK(Picture ass)
    {
        while (ass.hasNext())// this makes it black n white
        {
            Pixel a = ass.next();
            int avg = ((a.getRed())+(a.getBlue())+(a.getGreen()) /3);

            a.setRed(avg);
            a.setGreen(avg);
            a.setBlue(avg);
        }
    }

    /** 
     * For-each Loops 
     **/

    public void forEachLoops(Picture ass)
    {

        for (Pixel dick : ass) // this is equivelent of a while loop also intiatlizes Pixel
        {
            dick.setGreen(0);
        } // here for each loops dont remeber where it left off sp it starts from the start

        while (ass.hasNext()) // This will remember where it ended so you cant have a second while loop
        {
            Pixel dick = ass.next ();
            dick.setGreen(0);
        }

    }

    /**
     * Booleans
     **/

    private void Booleans()
    {
        boolean b1 = true;
        boolean b2 = false; // these are the only 2 things they can store
        boolean notb1= !b1; // will output false 
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(notb1); // prints false
    }

    private void example(Picture ass)
    {
        while (ass.hasNext())
        {
            Pixel a = ass.next();
            int avg = ((a.getRed())+(a.getBlue())+(a.getGreen()) /3);

            Color c;
            if(0 <= avg && avg <= 85) // as long as the first condition isn't false then it will check the second condition otherwise it wont check shit
            
            {
                c = new Color(0,0,255);
                a.setColor(c);
            }
            else if (85 <= avg && avg < 170)
            {
                c = new Color (0,255,0);
                a.setColor(c);
            }
            else if(170 <= avg && avg <= 255)
            {
                c = new Color (0,0,255);
                a.setColor(c);
            }
        }
    }

}
