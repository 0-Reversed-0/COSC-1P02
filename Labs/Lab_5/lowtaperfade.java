import Media.*;

public class lowtaperfade 
{

    private Sound balls;
    private SoundPlayer player;

    public lowtaperfade() 
    {   
        balls = new Sound();
        player = new SoundPlayer(balls);

        fade(balls, 1.5, 0.8);
        
        player.waitForUser();

        player.close();
    }

    private void fade(Sound balls, double fadeIn, double fadeOut)
    {

        int fadeIndex= (int)(fadeIn*balls.getSampleRate());

        int fadeOutSpan= (int)(fadeOut*balls.getSampleRate());

        for ( int index=0;index<fadeIndex;index++ )
        { 
            Sample s=balls.getSample(index);
            double factor=(double)index/fadeIndex;
            s.setAmp( (int)(s.getAmp()*factor) );
        }

        for ( int index=0; index<fadeOutSpan; index++ ) 
        { 
            Sample s=balls.getSample(balls.getNumSamples()-index-1);
            double factor=(double)index/fadeOutSpan;
            s.setAmp( (int)(s.getAmp()*factor) );
        }

    }

}
