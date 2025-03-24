import Media.*;

public class Lab
{

    private Picture ass = new Picture();
    //private Picture dick = new Picture();
    private PictureDisplayer asshole = new PictureDisplayer();

    public Lab()
    {
        asshole.placePicture(ass);
        //asshole.placePicture(dick);
        asshole.waitForUser();

        //sunset();
        film();

        asshole.close();
    }

    private void sunset()
    {
        while (ass.hasNext())
        {
            Pixel a = ass.next();
            int r = a.getRed();
            int g = a.getGreen();
            int b = a.getBlue();

            a.setRed((int)(r));
            a.setGreen((int)(g*0.7));
            a.setBlue((int)(b*0.7));
        }
    }

    private void film()
    {

        while (ass.hasNext())
        {
            Pixel a = ass.next();
            int r = a.getRed();
            int g = a.getGreen();
            int b = a.getBlue();

            double ASSHOLE = (0.1*(Math.random())+0.9);

            a.setRed((int)(r*ASSHOLE));
            a.setGreen((int)(g*ASSHOLE));
            a.setBlue((int)(b*ASSHOLE));
        }

    }

}