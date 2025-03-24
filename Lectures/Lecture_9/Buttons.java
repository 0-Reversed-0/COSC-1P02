import Media.*;
import BasicIO.*;

public class Buttons
{

    private BasicForm form;

    public Buttons()
    {
        form = new BasicForm("left", "middle/quit", "right"); 

        /**
         * You can name the buttons whatever you want
         * This is how you start adding buttons in GUI but this will not run 
         * This works like an ASCII prompter where you need to SELECT a button
         */
        
        int button = 0;
        
        while (true)
        {
            button = form.accept();
            // the reason why its an int is because the buttons are numbered 
            // left is 0, middle is 1, right is 2
            if(button == 1)
            {
                System.out.println(button + " you pressed the wrong button");
                break;
            }
            System.out.println(button);
        }

        form.close();
    }

}
