import Media.*;
import BasicIO.*;

public class TextArea
{

    private BasicForm form;

    public TextArea()
    {
        form = new BasicForm("Quit", "Read", "Write"); 

        int button = 0;
        
        setup();
        
        while (true)
        {
            button = form.accept();

            if(button == 0)
            {
                break;
            }
            else if(button == 1)
            {

            }
            else if(button == 2)
            {

            }
        }

        form.close();
    }

    private void setup()
    {
        //form.addTextArea("uniqueName","Label",rows, cols, x, y);
        form.addTextArea("Area","balls",10, 10, 20, 20);
    }

    private void write()
    {
                
    }

}
