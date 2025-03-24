import Media.*;
import java.awt.Color;

public class Red_Eye
{

    private Picture pic = new Picture();
    private PictureDisplayer display = new PictureDisplayer(pic);

    public Red_Eye()
    {
        display.waitForUser();
        
        display.close();
    }
}
