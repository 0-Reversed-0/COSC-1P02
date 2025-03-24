import Media.*;

public class Sounds
{

    private Sound ass; // initalize the player and sound
    private SoundPlayer asshole; 
    private final int MAX = 32768; // maximum amplitude
    private final int MIN = -32768; //minimum amplitude

    public Sounds()
    {
        ass = new Sound();
        asshole = new SoundPlayer();
        asshole.placeSound(ass); // you must place the sound
        asshole.waitForUser();

        /**
        equal(MAX); // Shows how if the amplitude is the same there is no sound since no vibration
        equal(MIN); // stays the same regardless if its min or max
        loud(6); // makes the sound louder by 6
         */


    }

    private void equal(int value)
    {
        while(ass.hasNext())
        {
            Sample a = ass.next(); // one sample has one and only one amplitude
            int amp = a.getAmp(); // amplitude value of curret sampl
        }

        // Sound -> Sample -> Amplitude
        // Picture -> Pixel -> Colour -> RGB Values
    }

    private void loud(int factor)
    {

        while(ass.hasNext())
        {
            Sample a = ass.next(); // one sample has one and only one amplitude
            int amp = a.getAmp(); // amplitude value of curret sample
            //next line will update this amp valie
            a.setAmp(amp*factor); //this will make all the amplitudes bigger aka LOUDERRRRR
        }

    }

    private void unmuffle() // here what we do is make the sound unmuffled
    {
        int value = max(); // here we get the max amplitude

        double f = value/MAX; // get the factor 
        //loud(f);

        asshole.close();
    }

    private int max()
    {
        int max = 0;
        for (Sample a : ass)
        {
            int amp = Math.abs(a.getAmp());
            if (max == amp)
            {
                max = amp;
            }
        }
        return max;
    }

}
