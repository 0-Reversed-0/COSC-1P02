import Media.*;
public class echo 
{

    private SoundPlayer player;

    public echo()
    {
        Sound mySound = new Sound();//allows user to select audio file
        player = new SoundPlayer();
        player.placeSound(mySound);
        player.waitForUser();

        Sound output = repeat(mySound);
        player.placeSound(output);

        player.close();
    }

    private Sound repeat(Sound original)
    {
        
        int numOfSamples = original.getNumSamples();
        int shift = (numOfSamples)/3;
        int newNumOfSamples = numOfSamples+shift;
        
        Sound copy = copy(original);
        Sound result = new Sound(newNumOfSamples+shift, original);

        for( int i = 0; i < newNumOfSamples; i++)
        {
            int amplitude;

            if (i>=shift)
            {
                if (i>=numOfSamples-1)
                {
                    amplitude = 0;
                }
                else
                {    amplitude = original.getSample(i).getAmp();

                    int amplitude2 = copy.getSample(i-shift).getAmp();

                    int amplitude3 = (amplitude+amplitude2)/2;
                    result.getSample(i).setAmp(amplitude3);
                }
            }
            else
            {
                amplitude = original.getSample(i).getAmp();
                result.getSample(i).setAmp(amplitude);
            }

        }

        return result;
    }

    private Sound copy(Sound original)
    {

        int numOfSamples = original.getNumSamples();// number of samples

        Sound result = new Sound(numOfSamples, original);
        for( int i = 0; i < numOfSamples; i++)
        {
            int amplitude = original.getSample(i).getAmp();
            result.getSample(i).setAmp(amplitude/2);
        }

        return result;
    }

}
