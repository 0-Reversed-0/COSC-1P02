import Media.*;
import BasicIO.*;

public class Sliders
{

    private BasicForm form;

    public Sliders()
    {
        form = new BasicForm("Quit"); 

        form.setTitle("Age");
        
        slider();
        
        int button = 0;

        while (true)
        {
            button = form.accept();
            
            if(button == 0)
            {
                break;
            }
            
        }

        form.close();
    }

    private void slider()
    {
        /**
         * Sliders are things that allow you to choose an int within a range
         */
        
        //form.addSlider("unique Name", "label", min, max, space/width, x,y);

        form.addSlider("age", "Age? ", 0, 100, 1000, 20, 20);
        int a = form.readInt("age");
        
    }

}
