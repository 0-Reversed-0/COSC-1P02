import Media.*;

public class reversed
{

    private SoundPlayer ass = new SoundPlayer();
    
    public reversed()
    {
      Sound asshole = new Sound();
      ass.placeSound(asshole);
      ass.waitForUser();
      
      Sound output = blowjob(asshole);
      ass.placeSound(output);
      
      asshole.close();
    }
    
    private Sound blowjob(Sound balls)
    {
        int samps = balls.getNumSamples();
        
        Sound dick = new Sound(samps, balls);
        
        int max = (balls.getNumSamples() - 1);
        
            for(int i = 0; i < balls.getNumSamples(); i++)
        {
            Sample s = dick.getSample(i);
            int amp = balls.getSample(max).getAmp();
            s.setAmp(amp);
            max--;            
        }
        
        return dick;
    }
}
