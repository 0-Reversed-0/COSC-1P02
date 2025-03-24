import BasicIO.*;

public class Guess 
{

    ASCIIPrompter prompt=new ASCIIPrompter();
    ASCIIDisplayer display=new ASCIIDisplayer();

    public Guess() 
    {
        Guesser();

        display.close();
    }

    private void Guesser()
    {

        int r = Random();

        Title();

        while(true)
        { 
            
            int attempt = prompt.readInt();
            
            if(0 > attempt || attempt > 100)
            {
                display.writeLine("Invalid Number, Try again");
                 
            }
            else if (attempt == r)
            {
                display.writeLine("You guessed the number!: " + r);
                break;
            }
            else if(r > attempt)
            {
                display.writeLine(attempt + " Higher, Guess Again"); 
                 
            }
            else if (r < attempt)
            {
                display.writeLine(attempt + " Lower, Guess Again");
                 
            }

        }

    }

    private void Title()
    {
        prompt.setLabel("Guess");
        display.writeLine("HiLo");
        display.newLine();
        display.writeLine("Guess a number between 1-100");
        display.newLine();
        display.newLine();
    }

    private int Random()
    {
        int r = (int)( ( (100*Math.random() )+1) );

        return r;
    }

}