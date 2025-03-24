import Media.*;
import java.io.*; // needed for serialization

public class Classes implements Serializable //this makes class able to make objects writable to a .bin file OR ELSE IT WONT WRORK
{

    private final long serialVersionUID = 2L; //this gives an id to your written object not needed but HIGHLY RECCOMENDED

    /**
     * the keyword final just means that it cannot be changed afterwards
     * the "L" in this case make sure it stays a class 
     * the id makes objects different from other objects 
     */

    private int x;

    public Classes()
    {
        x = 0;
    }

    public int getX() // this is a getter where it takes the current x value
    {

        return x;
    }

    public void setX(int nX) // this is setter where it sets the x value to something new
    {
        x = nX;
    }

    public String toString()
    {
        return ("balls is " + x);
    }
}
