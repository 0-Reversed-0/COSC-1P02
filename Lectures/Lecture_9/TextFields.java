import Media.*;
import BasicIO.*;

public class TextFields
{

    private BasicForm form;

    public TextFields()
    {
        form = new BasicForm("Read", "Write", "Quit"); 

        form.setTitle("Balls"); // just to make a title
        
        /**
         * Text boxs start at the top left and intially are at 0,0 on the basicform
         * Text boxs needs a label, a cordinate and an input and a unique name for the text box
         */
        
        form.addTextField("bi", "balls?", 10 , 20, 15);
        //form.addTextField("uniqueName", "label", "width/space" , x, y)
        
        int button = form.accept();
        while (true)
        {
            button = form.accept();

            if(button == 0)
            {
                read();
            }
            else if (button == 1)
            {
                write();
            }
            else if (button == 2)
            {
                break;
            }
        }

        form.close();
    }

    private void read()
    {
        int input = form.readInt("bi");
        System.out.println("you have " + input + " balls");
    }

    private void write()
    {
        int r = (int) (Math.random()*100); 
        form.writeInt("bi", r);
    }

    private void editting()
    {
        //form.setEditable("age", false);

        // you can make it so the user can or cannot type input in  
    }
}
