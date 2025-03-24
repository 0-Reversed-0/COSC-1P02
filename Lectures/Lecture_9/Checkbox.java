import Media.*;
import BasicIO.*;

public class Checkbox
{

    private BasicForm form;

    public Checkbox()
    {
        form = new BasicForm("read", "quit", "checkIt", "clear"); 

        form.addCheckBox("isMale", "Male?", 10, 20);
        
        int button = 0;
        while (true)
        {
            button = form.accept();

            if(button == 0)
            {
                read();
            }
            else if (button == 1)
            {
               break;
            }
            else if (button == 2)
            {
                checkIt();
            }
            else if(button == 3)
            {
                form.clearAll();
                // this is how you clear all you text boxes
            }
        }
        
        form.close();
    }

    private void read()
    {
        boolean input = form.readBoolean("isMale");
        System.out.println(input);
    }
    
    private void checkIt()
    {
        //form.writeBoolean("isMale", true);
        
        form.writeInt("isMale", 1);
    }
}
